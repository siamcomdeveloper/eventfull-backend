package com.example.SpringReactMongoProject.Repo;

import com.example.SpringReactMongoProject.Entity.Vendor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VendorRepo extends MongoRepository<Vendor, String> {

    //@Query(value="{ 'firstName' : ?0 }", fields="{ 'firstName' : 1, 'lastName' : 1}")
    //List<Vendor> findByThePersonsFirstname(String firstName);

    Vendor findByUserId(String userId);

    //Vendor findByUserId(String userId);

    //Boolean existsByEmail(String email);
}
