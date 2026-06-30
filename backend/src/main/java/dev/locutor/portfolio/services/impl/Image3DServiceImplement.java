package dev.locutor.portfolio.services.impl;

import java.util.List;

import dev.locutor.portfolio.entities.Image3DEntity;
import dev.locutor.portfolio.services.Image3DService;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.javapoet.ClassName;

import dev.locutor.portfolio.repositories.Image3DRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;


@Service("image3DServiceImplement")
@Transactional
public class Image3DServiceImplement implements Image3DService {
    private static final Logger log = LoggerFactory.getLogger(ClassName.class);

    @Autowired
    @Qualifier("image3DRepository")
    private Image3DRepository image3DRepo;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Image3DEntity> listAllImage3D() {
        // Guardar un Image3D para asegurarse de que haya al menos uno en la base de datos
        Image3DEntity newImage3D = new Image3DEntity();
        image3DRepo.save(newImage3D);

        try {
            // Obtener la lista actualizada de Image3Ds
            List<Image3DEntity> image3D = image3DRepo.findAll();

            // Refrescar cada entidad para asegurarse de que está sincronizada con la base de datos
            for (Image3DEntity image3 : image3D) {
                entityManager.unwrap(Session.class).refresh(image3);
            }

            return image3D;
        } catch (Exception e) {
            log.error("Error al obtener la lista de Image3Ds.", e);
            throw new RuntimeException("Error al obtener la lista de Image3Ds.", e);
        }
    }
}
