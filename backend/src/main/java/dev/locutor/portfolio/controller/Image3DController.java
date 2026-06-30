package dev.locutor.portfolio.controller;

import dev.locutor.portfolio.entities.Image3DEntity;
import dev.locutor.portfolio.repositories.Image3DRepository;
import dev.locutor.portfolio.services.impl.Image3DServiceImplement;
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
@RequestMapping("/image3D")
@CrossOrigin(origins = "*")
public class Image3DController {

    @Autowired
    @Qualifier("image3DServiceImplement")
    private Image3DServiceImplement image3DService;

    private Image3DRepository image3DRepository;

    @Autowired
    public Image3DController(Image3DRepository image3DRepository) {
        this.image3DRepository = image3DRepository;
    }

    @GetMapping(path="/list", produces = {"application/json"})
    public List<Image3DEntity> getAllImage3D() {
        return image3DRepository.findAll();
    }
}
