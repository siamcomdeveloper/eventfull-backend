package com.example.SpringReactMongoProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "properties")
public class Property {
    @Id
    private String _id;
    private String no;
    private String name;
    private Integer price;
    private Integer bedroom;
    private Integer bathroom;
    private Integer space;
    private String address;
    private String city;
    private String stateProvince;
    private String postalCode;
    private String commenceDate;
    private String imgUrl;
    private Integer status;

    public Property() {
    }

    public Property(String _id, String no, String name, Integer price, Integer bedroom, Integer bathroom, Integer space, String address, String city, String stateProvince, String postalCode, String commenceDate, String imgUrl, Integer status) {
        this._id = _id;
        this.no = no;
        this.name = name;
        this.price = price;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.space = space;
        this.address = address;
        this.city = city;
        this.stateProvince = stateProvince;
        this.postalCode = postalCode;
        this.commenceDate = commenceDate;
        this.imgUrl = imgUrl;
        this.status = status;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getBedroom() {
        return bedroom;
    }

    public void setBedroom(Integer bedroom) {
        this.bedroom = bedroom;
    }

    public Integer getBathroom() {
        return bathroom;
    }

    public void setBathroom(Integer bathroom) {
        this.bathroom = bathroom;
    }

    public Integer getSpace() {
        return space;
    }

    public void setSpace(Integer space) {
        this.space = space;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCommenceDate() {
        return commenceDate;
    }

    public void setCommenceDate(String commenceDate) {
        this.commenceDate = commenceDate;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Property{" +
                "_id='" + _id + '\'' +
                ", no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", bedroom=" + bedroom +
                ", bathroom=" + bathroom +
                ", space=" + space +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", stateProvince='" + stateProvince + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", commenceDate='" + commenceDate + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", status=" + status +
                '}';
    }
}
