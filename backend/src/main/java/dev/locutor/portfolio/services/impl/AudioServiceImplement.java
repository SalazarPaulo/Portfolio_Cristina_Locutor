package dev.locutor.portfolio.services.impl;

import dev.locutor.portfolio.entities.AudioEntity;
import dev.locutor.portfolio.repositories.AudioRepository;
import dev.locutor.portfolio.services.AudioService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.javapoet.ClassName;
import org.springframework.stereotype.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.persistence.PersistenceContext;
import jakarta.persistence.EntityManager;

import org.hibernate.Session;

@Service("audioServiceImplement")
@Transactional
public class AudioServiceImplement implements AudioService {

    private static final Logger log = LoggerFactory.getLogger(ClassName.class);

    @Autowired
    @Qualifier("audioRepository")
    private AudioRepository audioRepo;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<AudioEntity> listAllAudio() {
        // Guardar un audio para asegurarse de que haya al menos uno en la base de datos
        AudioEntity newAudio = new AudioEntity();
        audioRepo.save(newAudio);

        try {
            // Obtener la lista actualizada de audios
            List<AudioEntity> audios = audioRepo.findAll();

            // Refrescar cada entidad para asegurarse de que está sincronizada con la base de datos
            for (AudioEntity audio : audios) {
                entityManager.unwrap(Session.class).refresh(audio);
            }

            return audios;
        } catch (Exception e) {
            log.error("Error al obtener la lista de audios.", e);
            throw new RuntimeException("Error al obtener la lista de audios.", e);
        }
    }
}

