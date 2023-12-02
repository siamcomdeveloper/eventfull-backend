package com.example.SpringReactMongoProject.Entity;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "vendors")
public class Vendor {
    @Id
    private String _id;

    @NotBlank
    private String userId;

    @NotBlank
    private String firstName;

    private String middleName;

    @NotBlank
    private String lastName;

    @NotBlank
    private String dateOfBirth;

    @NotBlank
    private String emailAddress;

    @NotBlank
    private String phoneNumber;

    private String streetAddress;

    public Vendor(String _id, String userId, String firstName, String middleName, String lastName, String dateOfBirth, String emailAddress, String phoneNumber, String streetAddress) {
        this._id = _id;
        this.userId = userId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.streetAddress = streetAddress;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getdateOfBirth() {
        return dateOfBirth;
    }

    public void setdateOfBirth(String dateOfBirth) {
        dateOfBirth = dateOfBirth;
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

}
