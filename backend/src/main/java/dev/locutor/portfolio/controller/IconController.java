package dev.locutor.portfolio.controller;

import dev.locutor.portfolio.entities.IconEntity;
import dev.locutor.portfolio.repositories.IconRepository;
import dev.locutor.portfolio.services.impl.IconServiceImplement;
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
@RequestMapping("/icon")
@CrossOrigin(origins = "*")
public class IconController {

    @Autowired
    @Qualifier("iconServiceImplement")
    private IconServiceImplement iconService;

    private IconRepository iconRepository;

    @Autowired
    public IconController(IconRepository iconRepository) {
        this.iconRepository = iconRepository;
    }

    @GetMapping(path="/list", produces = {"application/json"})
    public List<IconEntity> getAllIcon() {
        return iconRepository.findAll();
    }
}
