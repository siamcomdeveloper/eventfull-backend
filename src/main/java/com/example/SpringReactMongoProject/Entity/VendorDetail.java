package com.example.SpringReactMongoProject.Entity;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vendorDetails")
public class VendorDetail {
    @Id
    private String _id;

    @NotBlank
    private String userId;

    @NotBlank
    private String companyName;

    private String contactName;

    @NotBlank
    private String emailAddress;


    private String phoneNumber;

    private String streetAddress;

    @NotBlank
    private String category;

    @NotBlank
    private String subCategory;

    private String description;

    private String serviceDescription;

    private String availableDates;

    private String nonAvailableDates;

    @NotBlank
    private String location;

    private Float rating;

    private Integer minPrice;

    private Integer maxPrice;

    private Integer maxCapacity;

    private String imgUrl;
    private String imgUrl1;
    private String imgUrl2;
    private String imgUrl3;

    public VendorDetail(String _id, String userId, String companyName, String contactName, String emailAddress, String phoneNumber, String streetAddress, String category, String subCategory, String description, String serviceDescription, String availableDates, String nonAvailableDates, String location, Float rating, Integer minPrice, Integer maxPrice, Integer maxCapacity, String imgUrl, String imgUrl1, String imgUrl2, String imgUrl3) {
        this._id = _id;
        this.userId = userId;
        this.companyName = companyName;
        this.contactName = contactName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.streetAddress = streetAddress;
        this.category = category;
        this.subCategory = subCategory;
        this.description = description;
        this.serviceDescription = serviceDescription;
        this.availableDates = availableDates;
        this.nonAvailableDates = nonAvailableDates;
        this.location = location;
        this.rating = rating;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.maxCapacity = maxCapacity;
        this.imgUrl = imgUrl;
        this.imgUrl1 = imgUrl1;
        this.imgUrl2 = imgUrl2;
        this.imgUrl3 = imgUrl3;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(String availableDates) {
        this.availableDates = availableDates;
    }

    public String getNonAvailableDates() {
        return nonAvailableDates;
    }

    public void setNonAvailableDates(String nonAvailableDates) {
        this.nonAvailableDates = nonAvailableDates;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getImage() {
        return imgUrl;
    }

    public void setImage(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImage1() {
        return imgUrl1;
    }

    public void setImage1(String imgUrl1) {
        this.imgUrl1 = imgUrl1;
    }

    public String getImage2() {
        return imgUrl2;
    }

    public void setImage2(String imgUrl2) {
        this.imgUrl2 = imgUrl2;
    }

    public String getImage3() {
        return imgUrl3;
    }

    public void setImage3(String imgUrl3) {
        this.imgUrl3 = imgUrl3;
    }
}
