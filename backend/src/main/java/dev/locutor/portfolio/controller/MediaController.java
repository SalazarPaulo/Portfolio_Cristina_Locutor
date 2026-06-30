package dev.locutor.portfolio.controller;

import dev.locutor.portfolio.entities.MediaEntity;
import dev.locutor.portfolio.repositories.MediaRepository;
import dev.locutor.portfolio.services.impl.MediaServiceImplement;
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
@RequestMapping("/media")
@CrossOrigin(origins = "*")
public class MediaController {

    @Autowired
    @Qualifier("mediaServiceImplement")
    private MediaServiceImplement mediaService;

    private MediaRepository mediaRepository;

    @Autowired
    public MediaController(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    @GetMapping(path="/list", produces = {"application/json"})
    public List<MediaEntity> getAllMedia() {
        return mediaRepository.findAll();
    }
}
