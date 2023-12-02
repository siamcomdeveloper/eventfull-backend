package com.example.SpringReactMongoProject.Service;

import com.example.SpringReactMongoProject.Entity.Vendor;
import com.example.SpringReactMongoProject.Repo.VendorRepo;
import org.springframework.stereotype.Service;

@Service
public class VendorServices {
    private final VendorRepo repo;

    public VendorServices(VendorRepo repo) {
        this.repo = repo;
    }

    public void saveOrUpdate(Vendor vendors) { repo.save(vendors); }

    public Iterable<Vendor> listAll() { return this.repo.findAll(); }

    public void deleteVendor(String id) { repo.deleteById(id); }

    public Vendor getVendorById(String vendorId) { return repo.findById(vendorId).get(); }

    //public Vendor getVendorByUserId(String userId) { return repo.findByUserId(userId).get(); }

    //public Iterable<Vendor> getVendorByThePersonsFirstname(String firstName) { return repo.findByThePersonsFirstname(firstName); }

    public Vendor getVendorByUserId(String userId) { return repo.findByUserId(userId); }
}
