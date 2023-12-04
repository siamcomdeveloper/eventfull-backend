package com.example.SpringReactMongoProject.Service;

import com.example.SpringReactMongoProject.Entity.Vendor;
import com.example.SpringReactMongoProject.Entity.VendorDetail;
import com.example.SpringReactMongoProject.Repo.VendorDetailRepo;
import org.springframework.stereotype.Service;

@Service
public class VendorDetailServices {
    private final VendorDetailRepo repo;

    public VendorDetailServices(VendorDetailRepo repo) {
        this.repo = repo;
    }

    public void saveOrUpdate(VendorDetail vendorDetails) { repo.save(vendorDetails); }

    public Iterable<VendorDetail> listAll() { return this.repo.findAll(); }

    public void deleteVendorDetail(String id) { repo.deleteById(id); }

    public VendorDetail getVendorDetailById(String vendorDetailId) { return repo.findById(vendorDetailId).get(); }

    public VendorDetail getVendorDetailByUserId(String userId) { return repo.getVendorDetailByUserId(userId); }

    public Iterable<VendorDetail> getVendorDetailByCategory(String catetory) { return repo.getVendorDetailByCategory(catetory); }

    public Iterable<VendorDetail> getVendorDetailByLocation(String location) { return repo.getVendorDetailByLocation(location); }
}
