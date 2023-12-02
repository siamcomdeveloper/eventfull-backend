package com.example.SpringReactMongoProject.payload.response;

public class UserInfoResponse {
  private String _id;
  private String name;
  private String email;
  private Integer role;

  public UserInfoResponse(String _id, String name, String email, Integer role) {
    this._id = _id;
    this.name = name;
    this.email = email;
    this.role = role;
  }

  public String getId() {
    return _id;
  }

  public void setId(String id) {
    this._id = _id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getRole() {
    return role;
  }

  public void setRole(Integer role) {
    this.role = role;
  }

}
