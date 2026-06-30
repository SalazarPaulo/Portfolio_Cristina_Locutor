package dev.locutor.portfolio.services.impl;

import dev.locutor.portfolio.entities.MediaEntity;
import dev.locutor.portfolio.repositories.MediaRepository;
import dev.locutor.portfolio.services.MediaService;
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

@Service("mediaServiceImplement")
@Transactional
public class MediaServiceImplement implements MediaService {

    private static final Logger log = LoggerFactory.getLogger(ClassName.class);

    @Autowired
    @Qualifier("mediaRepository")
    private MediaRepository mediaRepo;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<MediaEntity> listAllMedia() {
        // Guardar un Media para asegurarse de que haya al menos uno en la base de datos
        MediaEntity newMedia = new MediaEntity();
        mediaRepo.save(newMedia);

        try {
            // Obtener la lista actualizada de Medias
            List<MediaEntity> media = mediaRepo.findAll();

            // Refrescar cada entidad para asegurarse de que está sincronizada con la base de datos
            for (MediaEntity med : media) {
                entityManager.unwrap(Session.class).refresh(med);
            }

            return media;
        } catch (Exception e) {
            log.error("Error al obtener la lista de Medias.", e);
            throw new RuntimeException("Error al obtener la lista de Medias.", e);
        }
    }
}

