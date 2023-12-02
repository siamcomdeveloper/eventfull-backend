package com.example.SpringReactMongoProject.Controller;

import com.example.SpringReactMongoProject.Entity.Property;
import com.example.SpringReactMongoProject.Service.PropertyServices;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/property")
public class PropertyController {

    private final PropertyServices propertyServices;

    public PropertyController(PropertyServices propertyServices) {
        this.propertyServices = propertyServices;
    }

    @PostMapping(value = "/save")
    private String saveProperty(@RequestBody Property properties){
        propertyServices.saveOrUpdate(properties);
        return properties.get_id();
    }

    @GetMapping(value = "/getall")
    private Iterable<Property> getProperties(){
        return propertyServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private Property update(@RequestBody Property property, @PathVariable(name="id")String _id){
        property.set_id(_id);
        propertyServices.saveOrUpdate(property);
        return property;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteProperty(@PathVariable("id") String _id){
        propertyServices.deleteProperty(_id);
    }

    @RequestMapping("/search/{id}")
    private Property getProperty(@PathVariable(name="id")String propertyId){
        return propertyServices.getPropertyById(propertyId);
    }
}
