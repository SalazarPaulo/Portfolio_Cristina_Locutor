package dev.locutor.portfolio.controller;

import dev.locutor.portfolio.entities.ImageEntity;
import dev.locutor.portfolio.repositories.ImageRepository;
import dev.locutor.portfolio.services.impl.ImageServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/image")
@CrossOrigin(origins = "*")
public class ImageController {

    @Autowired
    @Qualifier("imageServiceImplement")
    private ImageServiceImplement imageService;

    private ImageRepository imageRepository;

    @Autowired
    public ImageController(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @GetMapping(path="/list", produces = {"application/json"})
    public List<ImageEntity> getAllImage() {
        return imageRepository.findAll();
    }
}
