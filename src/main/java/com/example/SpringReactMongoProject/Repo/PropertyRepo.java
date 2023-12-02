package com.example.SpringReactMongoProject.Repo;

import com.example.SpringReactMongoProject.Entity.Property;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepo extends MongoRepository<Property, String> {

}
