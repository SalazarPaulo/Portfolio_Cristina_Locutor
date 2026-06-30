package dev.locutor.portfolio.repositories;

import dev.locutor.portfolio.entities.DemosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("demosRepository")
public interface DemosRepository
        extends JpaRepository<DemosEntity, Integer> {
}
