package com.example.SpringReactMongoProject.Controller;

import com.example.SpringReactMongoProject.Entity.User;
import com.example.SpringReactMongoProject.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/user")
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @PostMapping(value = "/save")
    private String saveUser(@RequestBody User users){
        userServices.saveOrUpdate(users);
        return users.get_id();
    }

    @GetMapping(value = "/getall")
    private Iterable<User> getUsers(){
        return userServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private User update(@RequestBody User user, @PathVariable(name="id")String _id){
        user.set_id(_id);
        userServices.saveOrUpdate(user);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteUser(@PathVariable("id") String _id){
        userServices.deleteUser(_id);
    }

    @RequestMapping("/search/{id}")
    private User getUser(@PathVariable(name="id")String userId){
        return userServices.getUserById(userId);
    }
}
