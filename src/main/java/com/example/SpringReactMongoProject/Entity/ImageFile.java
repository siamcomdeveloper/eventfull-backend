package com.example.SpringReactMongoProject.Entity;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;

@org.springframework.data.mongodb.core.mapping.Document
public class ImageFile {
    @Id
    private String _id;
    private String name;
    private String docType;
    private Binary image;
    private Long size;
    public ImageFile(){

    }

    public ImageFile(String _id, String name, String docType, Binary image, Long size) {
        this._id = _id;
        this.name = name;
        this.docType = docType;
        this.image = image;
        this.size = size;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileType() {
        return docType;
    }

    public void setFileType(String docType) {
        this.docType = docType;
    }

    public Binary getImage() {
        return image;
    }

    public void setImage(Binary image) {
        this.image = image;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}