package com.example.SpringReactMongoProject.Repo;

import com.example.SpringReactMongoProject.Entity.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends MongoRepository<Booking, String> {

}
