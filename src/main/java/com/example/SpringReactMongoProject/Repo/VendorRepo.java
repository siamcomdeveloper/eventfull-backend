package com.example.SpringReactMongoProject.Repo;

import com.example.SpringReactMongoProject.Entity.Vendor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepo extends MongoRepository<Vendor, String> {
    Vendor findByUserId(String userId);
}
