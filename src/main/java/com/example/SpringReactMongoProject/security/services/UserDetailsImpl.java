package com.example.SpringReactMongoProject.security.services;

import java.util.Collection;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.SpringReactMongoProject.Entity.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailsImpl implements UserDetails {
  private static final long serialVersionUID = 1L;

  private String _id;

  private String name;

  private String email;

  @JsonIgnore
  private String password;

  private Integer role;

  private Collection<? extends GrantedAuthority> authorities;

  public UserDetailsImpl(String _id, String name, String email, String password, Integer role){
    this._id = _id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.role = role;
  }

  public static UserDetailsImpl build(User user) {

    return new UserDetailsImpl(
        user.get_id(),
        user.getUsername(), 
        user.getEmail(),
        user.getPassword(),
        user.getRole());

  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  public String getId() {
    return _id;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return name;
  }

  public Integer getRole() {
    return role;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    UserDetailsImpl user = (UserDetailsImpl) o;
    return Objects.equals(_id, user._id);
  }
}
