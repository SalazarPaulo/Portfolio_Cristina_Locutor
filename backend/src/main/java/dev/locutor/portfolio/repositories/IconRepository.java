package dev.locutor.portfolio.repositories;

import dev.locutor.portfolio.entities.IconEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("iconRepository")
public interface IconRepository
        extends JpaRepository<IconEntity, Integer> {
}
