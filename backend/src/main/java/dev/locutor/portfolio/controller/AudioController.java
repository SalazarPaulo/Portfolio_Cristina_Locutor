package dev.locutor.portfolio.controller;

import dev.locutor.portfolio.entities.AudioEntity;
import dev.locutor.portfolio.repositories.AudioRepository;
import dev.locutor.portfolio.services.impl.AudioServiceImplement;
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
@RequestMapping("/audio")
@CrossOrigin(origins = "*")
public class AudioController {
    @Autowired
    @Qualifier("audioServiceImplement")
    private AudioServiceImplement audioService;
    @GetMapping(path = "/list/", produces = {"application/json"})
    public ResponseEntity<List<AudioEntity>> listAudio() {
        try {
            List<AudioEntity> audioList = audioService.listAllAudio();
            return new ResponseEntity<>(audioList, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    private AudioRepository audioRepository;

    @Autowired
    public AudioController(AudioRepository audioRepository) {
        this.audioRepository = audioRepository;
    }

    @GetMapping(path="/list", produces = {"application/json"})
    public List<AudioEntity> getAllAudio() {
        return audioRepository.findAll();
    }

}
