package com.example.SpringReactMongoProject.Entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookings")
public class Booking {

    @Id
    private String _id;

    private String userId;
    private String vendorId;
    private String companyName;
    private String customerName;
    private String email;
    private String phone;
    private String startDatetime;
    private String endDatetime;
    private Integer status;

    public Booking(){};

    public Booking(String _id, String userId, String vendorId, String companyName, String customerName, String email, String phone, String startDatetime, String endDatetime, Integer status) {
        this._id = _id;
        this.userId = userId;
        this.vendorId = vendorId;
        this.companyName = companyName;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.status = status;
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

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
