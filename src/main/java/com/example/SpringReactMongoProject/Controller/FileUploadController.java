package com.example.SpringReactMongoProject.Controller;

import com.example.SpringReactMongoProject.Entity.ImageFile;
import com.example.SpringReactMongoProject.Service.ImageFileServices;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/file")
public class FileUploadController {

    MongoTemplate mongoTemplate;
    private final ImageFileServices documentServices;

    public FileUploadController(ImageFileServices documentServices) {
        this.documentServices = documentServices;
    }

    @Autowired
    ImageFileServices imageService;

    @PostMapping(value = "/upload")
    public ResponseEntity<Object> singleFileUpload(@RequestParam("file") MultipartFile multipart) {
        try {
            System.out.println(multipart.getSize());
            System.out.println(multipart.getContentType());
            System.out.println(multipart.getOriginalFilename());
            System.out.println(multipart.getBytes());

            ImageFile document = new ImageFile();
            document.setName(multipart.getOriginalFilename());
            document.setFileType(multipart.getContentType());
            document.setSize(multipart.getSize());
            document.setImage(new Binary(BsonBinarySubType.BINARY, multipart.getBytes()));
            document.setImage(new Binary(BsonBinarySubType.BINARY, multipart.getBytes()));

            documentServices.saveOrUpdate(document);
            System.out.println(document.get_id());

            Map<String, String> data = new HashMap<>();
            data.put("status", "done");
            data.put("_id", document.get_id());
            data.put("name", document.getName());
            data.put("size", Long.toString(document.getSize()));
            data.put("image", Base64.getEncoder().encodeToString(document.getImage().getData()));
            data.put("url", "http://localhost:8081/api/v1/file/get/"+document.get_id());

            return new ResponseEntity<>(data, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @RequestMapping("/get/{id}")
    public ResponseEntity<Resource> getPhoto(@PathVariable(name="id") String id) {
        System.out.println(id);
        ImageFile image = imageService.getImageFileById(id);
        System.out.println(image.get_id());

        return ResponseEntity.ok()
                .contentLength(image.getSize())
                .contentType(MediaType.parseMediaType(image.getFileType()))
                .body(new ByteArrayResource(image.getImage().getData()));
    }
}
