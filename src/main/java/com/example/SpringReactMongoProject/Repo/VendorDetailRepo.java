package com.example.SpringReactMongoProject.Repo;

import com.example.SpringReactMongoProject.Entity.Vendor;
import com.example.SpringReactMongoProject.Entity.VendorDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VendorDetailRepo extends MongoRepository<VendorDetail, String> {

    VendorDetail getVendorDetailByUserId(String userId);

    Iterable<VendorDetail> getVendorDetailByCategory(String category);

    Iterable<VendorDetail> getVendorDetailByLocation(String location);

    //Iterable<VendorDetail> getVendorDetailByCapacity(String capacity);
    //Optional<VendorDetail> findByEmail(String email);

    //Boolean existsByEmail(String email);
}
