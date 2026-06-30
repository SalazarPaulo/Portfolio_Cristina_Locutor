package dev.locutor.portfolio.repositories;

import dev.locutor.portfolio.entities.SubtypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("subtypeRepository")
public interface SubtypeRepository
        extends JpaRepository<SubtypeEntity, Integer> {
}
