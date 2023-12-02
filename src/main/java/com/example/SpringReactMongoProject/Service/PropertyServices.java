package com.example.SpringReactMongoProject.Service;

import com.example.SpringReactMongoProject.Entity.Property;
import com.example.SpringReactMongoProject.Repo.PropertyRepo;
import org.springframework.stereotype.Service;

@Service
public class PropertyServices {

    private final PropertyRepo repo;

    public PropertyServices(PropertyRepo repo) {
        this.repo = repo;
    }

    public void saveOrUpdate(Property properties) {
        repo.save(properties);
    }

    public Iterable<Property> listAll() {
        return this.repo.findAll();
    }

    public void deleteProperty(String id) {
        repo.deleteById(id);
    }

    public Property getPropertyById(String propertyId) {
        return repo.findById(propertyId).get();
    }

}
