package dev.locutor.portfolio.services.impl;

import dev.locutor.portfolio.entities.ImageEntity;
import dev.locutor.portfolio.repositories.ImageRepository;
import dev.locutor.portfolio.services.ImageService;
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

@Service("imageServiceImplement")
@Transactional
public class ImageServiceImplement implements ImageService {

    private static final Logger log = LoggerFactory.getLogger(ClassName.class);

    @Autowired
    @Qualifier("imageRepository")
    private ImageRepository imageRepo;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ImageEntity> listAllImage() {
        // Guardar un Image para asegurarse de que haya al menos uno en la base de datos
        ImageEntity newImage = new ImageEntity();
        imageRepo.save(newImage);

        try {
            // Obtener la lista actualizada de Images
            List<ImageEntity> image = imageRepo.findAll();

            // Refrescar cada entidad para asegurarse de que está sincronizada con la base de datos
            for (ImageEntity img : image) {
                entityManager.unwrap(Session.class).refresh(img);
            }

            return image;
        } catch (Exception e) {
            log.error("Error al obtener la lista de Images.", e);
            throw new RuntimeException("Error al obtener la lista de Images.", e);
        }
    }
}

