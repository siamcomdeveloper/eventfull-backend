package com.example.SpringReactMongoProject.Controller;

import com.example.SpringReactMongoProject.Entity.Vendor;
import com.example.SpringReactMongoProject.Service.VendorServices;
import org.bson.json.JsonObject;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/vendor")
public class VendorController {
    private final VendorServices vendorServices;

    public VendorController(VendorServices vendorServices) {
        this.vendorServices = vendorServices;
    }

    @PostMapping(value = "/save")
    private String saveVendor(@RequestBody Vendor vendors){
        vendorServices.saveOrUpdate(vendors);
        return vendors.get_id();
    }

    @GetMapping(value = "/getall")
    private Iterable<Vendor> getVendors(){
        return vendorServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private Vendor update(@RequestBody Vendor vendor, @PathVariable(name="id")String _id){
        vendor.set_id(_id);
        vendorServices.saveOrUpdate(vendor);
        return vendor;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteVendor(@PathVariable("id") String _id){
        vendorServices.deleteVendor(_id);
    }

    @RequestMapping("/search/{id}")
    private Vendor getVendor(@PathVariable(name="id")String vendorId){
        return vendorServices.getVendorById(vendorId);
    }

    /*@RequestMapping("/find/{firstname}")
    private Iterable<Vendor> getVendor(@PathVariable(name="firstname")String firstName){
        System.out.println("here!");
        return vendorServices.getVendorByThePersonsFirstname(firstName);
    }*/

    /*@PostMapping(value = "/find")
    private Iterable<Vendor> getVendor(@RequestBody Vendor vender){
        System.out.println("here!");
        System.out.println(vender);
        return vendorServices.getVendorByThePersonsFirstname(vender.getFirstName());
    }*/

    @PostMapping(value = "/getinfo")
    private Vendor getVendorByUserId(@RequestBody Vendor vender){
        System.out.println("here!");
        System.out.println(vender);
        return vendorServices.getVendorByUserId(vender.getUserId());
    }
}
