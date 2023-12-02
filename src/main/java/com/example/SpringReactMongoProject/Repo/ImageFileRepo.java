package com.example.SpringReactMongoProject.Repo;

import com.example.SpringReactMongoProject.Entity.ImageFile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageFileRepo extends MongoRepository<ImageFile, String> {

}
