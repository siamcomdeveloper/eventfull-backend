package com.example.SpringReactMongoProject.Controller;

import com.example.SpringReactMongoProject.Repo.VendorRepo;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.example.SpringReactMongoProject.Entity.User;
import com.example.SpringReactMongoProject.payload.request.LoginRequest;
import com.example.SpringReactMongoProject.payload.request.SignupRequest;
import com.example.SpringReactMongoProject.payload.response.UserInfoResponse;
import com.example.SpringReactMongoProject.payload.response.MessageResponse;
import com.example.SpringReactMongoProject.Repo.UserRepo;
import com.example.SpringReactMongoProject.security.jwt.JwtUtils;
import com.example.SpringReactMongoProject.security.services.UserDetailsImpl;

//for Angular Client (withCredentials)
//@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600, allowCredentials="true")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UserRepo userRepository;

  @Autowired
  VendorRepo vendorRepository;

  @Autowired
  PasswordEncoder encoder;

  @Autowired
  JwtUtils jwtUtils;

  @PostMapping("/user/signin")
  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

    Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));

    SecurityContextHolder.getContext().setAuthentication(authentication);

    UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

    ResponseCookie jwtCookie = jwtUtils.generateJwtCookie(userDetails);

    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, jwtCookie.toString())
        .body(new UserInfoResponse(userDetails.getId(),
                                   userDetails.getUsername(),
                                   userDetails.getEmail(),
                                   userDetails.getRole()));
  }

  @PostMapping("/user/signup/{role}")
  public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest, @PathVariable(name="role")String role) {

    if (userRepository.existsByEmail(signUpRequest.getEmail())) {
      return ResponseEntity
          .badRequest()
          .body(new MessageResponse("Error: Email is already in use!"));
    }

    // Create new user's account
    User user = new User(signUpRequest.getName(),
                         signUpRequest.getEmail(),
                         encoder.encode(signUpRequest.getPassword()),
                          Integer.parseInt(role));

    userRepository.save(user);

    return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
  }

}
