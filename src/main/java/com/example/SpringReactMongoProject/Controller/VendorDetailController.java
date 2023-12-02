package com.example.SpringReactMongoProject.Controller;

import com.example.SpringReactMongoProject.Entity.Vendor;
import com.example.SpringReactMongoProject.Entity.VendorDetail;
import com.example.SpringReactMongoProject.Service.VendorDetailServices;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/vendor-detail")
public class VendorDetailController {
    private final VendorDetailServices vendorDetailServices;

    public VendorDetailController(VendorDetailServices vendorServices) {
        this.vendorDetailServices = vendorServices;
    }

    @PostMapping(value = "/save")
    private String saveVendor(@RequestBody VendorDetail vendorDetails){
        vendorDetailServices.saveOrUpdate(vendorDetails);
        return vendorDetails.get_id();
    }

    @GetMapping(value = "/getall")
    private Iterable<VendorDetail> getVendors(){
        return vendorDetailServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private VendorDetail update(@RequestBody VendorDetail vendorDetail, @PathVariable(name="id")String _id){
        vendorDetail.set_id(_id);
        vendorDetailServices.saveOrUpdate(vendorDetail);
        return vendorDetail;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteVendorDetail(@PathVariable("id") String _id){
        vendorDetailServices.deleteVendorDetail(_id);
    }

    @RequestMapping("/search/{id}")
    private VendorDetail getVendorDetail(@PathVariable(name="id")String vendorDetailId){
        return vendorDetailServices.getVendorDetailById(vendorDetailId);
    }

    @PostMapping(value = "/getinfo")
    private VendorDetail getVendor(@RequestBody VendorDetail venderDetail){
        return vendorDetailServices.getVendorDetailByUserId(venderDetail.getUserId());
    }

    @RequestMapping(value = "/search-category/{category}")
    private Iterable<VendorDetail> getVendorDetailByCategory(@PathVariable(name="category")String category){
        return vendorDetailServices.getVendorDetailByCategory(category);
    }

    @RequestMapping(value = "/search-location/{location}")
    private Iterable<VendorDetail> getVendorDetailByLocation(@PathVariable(name="location")String location){
        return vendorDetailServices.getVendorDetailByLocation(location);
    }

    //@RequestMapping(value = "/search-capacity/{capacity}")
    //private Iterable<VendorDetail> getVendorDetailByCapacity(@PathVariable(name="capacity")String capacity){
    //    return vendorDetailServices.getVendorDetailByCapacity(capacity);
    //}
}
