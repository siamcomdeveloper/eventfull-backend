package com.example.SpringReactMongoProject.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.SpringReactMongoProject.Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
  Optional<User> findByEmail(String email);

  Boolean existsByEmail(String email);
}
