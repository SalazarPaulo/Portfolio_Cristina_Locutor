package dev.locutor.portfolio.services.impl;

import dev.locutor.portfolio.entities.SubtypeEntity;
import dev.locutor.portfolio.repositories.SubtypeRepository;
import dev.locutor.portfolio.services.SubtypeService;
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

@Service("subtypeServiceImplement")
@Transactional
public class SubtypeServiceImplement implements SubtypeService {

    private static final Logger log = LoggerFactory.getLogger(ClassName.class);

    @Autowired
    @Qualifier("subtypeRepository")
    private SubtypeRepository subtypeRepo;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<SubtypeEntity> listAllSubtype() {
        // Guardar un Subtype para asegurarse de que haya al menos uno en la base de datos
        SubtypeEntity newSubtype = new SubtypeEntity();
        subtypeRepo.save(newSubtype);

        try {
            // Obtener la lista actualizada de Subtypes
            List<SubtypeEntity> subtype = subtypeRepo.findAll();

            // Refrescar cada entidad para asegurarse de que está sincronizada con la base de datos
            for (SubtypeEntity subty : subtype) {
                entityManager.unwrap(Session.class).refresh(subty);
            }

            return subtype;
        } catch (Exception e) {
            log.error("Error al obtener la lista de Subtypes.", e);
            throw new RuntimeException("Error al obtener la lista de Subtypes.", e);
        }
    }
}

