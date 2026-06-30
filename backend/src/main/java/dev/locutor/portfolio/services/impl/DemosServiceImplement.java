package dev.locutor.portfolio.services.impl;

import dev.locutor.portfolio.entities.DemosEntity;
import dev.locutor.portfolio.repositories.DemosRepository;
import dev.locutor.portfolio.services.DemosService;
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

@Service("demosServiceImplement")
@Transactional
public class DemosServiceImplement implements DemosService {

    private static final Logger log = LoggerFactory.getLogger(ClassName.class);

    @Autowired
    @Qualifier("demosRepository")
    private DemosRepository demosRepo;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<DemosEntity> listAllDemos() {
        // Guardar un Demos para asegurarse de que haya al menos uno en la base de datos
        DemosEntity newDemos = new DemosEntity();
        demosRepo.save(newDemos);

        try {
            // Obtener la lista actualizada de Demoss
            List<DemosEntity> demos = demosRepo.findAll();

            // Refrescar cada entidad para asegurarse de que está sincronizada con la base de datos
            for (DemosEntity demo : demos) {
                entityManager.unwrap(Session.class).refresh(demo);
            }

            return demos;
        } catch (Exception e) {
            log.error("Error al obtener la lista de Demoss.", e);
            throw new RuntimeException("Error al obtener la lista de Demoss.", e);
        }
    }
}

