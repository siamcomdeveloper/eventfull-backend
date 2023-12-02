package com.example.SpringReactMongoProject.Service;

import com.example.SpringReactMongoProject.Entity.User;
import com.example.SpringReactMongoProject.Repo.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    private final UserRepo repo;

    public UserServices(UserRepo repo) {
        this.repo = repo;
    }

    public void saveOrUpdate(User users) {
        repo.save(users);
    }

    public Iterable<User> listAll() {
        return this.repo.findAll();
    }

    public void deleteUser(String id) {
        repo.deleteById(id);
    }

    public User getUserById(String userId) {
        return repo.findById(userId).get();
    }

}
