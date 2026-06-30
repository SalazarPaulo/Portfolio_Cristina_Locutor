package dev.locutor.portfolio.controller;

import dev.locutor.portfolio.entities.DemosEntity;
import dev.locutor.portfolio.repositories.DemosRepository;
import dev.locutor.portfolio.services.impl.DemosServiceImplement;
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
@RequestMapping("/demos")
@CrossOrigin(origins = "*")
public class DemosController {

    @Autowired
    @Qualifier("demosServiceImplement")
    private DemosServiceImplement demosService;

    private DemosRepository demosRepository;

    @Autowired
    public DemosController(DemosRepository demosRepository) {
        this.demosRepository = demosRepository;
    }

    @GetMapping(path="/list", produces = {"application/json"})
    public List<DemosEntity> getAllDemos() {
        return demosRepository.findAll();
    }
}
