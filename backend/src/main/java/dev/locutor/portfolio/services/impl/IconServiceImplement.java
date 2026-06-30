package dev.locutor.portfolio.services.impl;

import java.util.List;

import dev.locutor.portfolio.entities.IconEntity;
import dev.locutor.portfolio.services.IconService;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.javapoet.ClassName;

import dev.locutor.portfolio.repositories.IconRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

@Service("iconServiceImplement")
@Transactional
public class IconServiceImplement implements IconService {
    
    private static final Logger log = LoggerFactory.getLogger(ClassName.class);

    @Autowired
    @Qualifier("iconRepository")
    private IconRepository iconRepo;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<IconEntity> listAllIcon() {
        // Guardar un Icon para asegurarse de que haya al menos uno en la base de datos
        IconEntity newIcon = new IconEntity();
        iconRepo.save(newIcon);

        try {
            // Obtener la lista actualizada de Icons
            List<IconEntity> icon = iconRepo.findAll();

            // Refrescar cada entidad para asegurarse de que está sincronizada con la base de datos
            for (IconEntity ico : icon) {
                entityManager.unwrap(Session.class).refresh(ico);
            }

            return icon;
        } catch (Exception e) {
            log.error("Error al obtener la lista de Icons.", e);
            throw new RuntimeException("Error al obtener la lista de Icons.", e);
        }
    }
}
