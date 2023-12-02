package com.example.SpringReactMongoProject.Service;

import com.example.SpringReactMongoProject.Entity.ImageFile;
import com.example.SpringReactMongoProject.Repo.ImageFileRepo;
import org.springframework.stereotype.Service;

@Service
public class ImageFileServices {

    private final ImageFileRepo repo;

    public ImageFileServices(ImageFileRepo repo) {
        this.repo = repo;
    }

    public void saveOrUpdate(ImageFile imageFiles) {
        repo.save(imageFiles);
    }

    public Iterable<ImageFile> listAll() {
        return this.repo.findAll();
    }

    public void deleteImageFile(String id) {
        repo.deleteById(id);
    }

    public ImageFile getImageFileById(String ImageFileId) {
        return repo.findById(ImageFileId).get();
    }
}
