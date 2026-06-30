package dev.locutor.portfolio.controller;

import dev.locutor.portfolio.entities.SubtypeEntity;
import dev.locutor.portfolio.repositories.SubtypeRepository;
import dev.locutor.portfolio.services.impl.SubtypeServiceImplement;
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
@RequestMapping("/subtype")
@CrossOrigin(origins = "*")
public class SubtypeController {

    @Autowired
    @Qualifier("subtypeServiceImplement")
    private SubtypeServiceImplement subtypeService;

    private SubtypeRepository subtypeRepository;

    @Autowired
    public SubtypeController(SubtypeRepository subtypeRepository) {
        this.subtypeRepository = subtypeRepository;
    }

    @GetMapping(path="/list", produces = {"application/json"})
    public List<SubtypeEntity> getAllSubtype() {
        return subtypeRepository.findAll();
    }
}
