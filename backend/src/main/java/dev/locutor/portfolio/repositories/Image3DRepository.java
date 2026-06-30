package dev.locutor.portfolio.repositories;

import dev.locutor.portfolio.entities.Image3DEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("image3DRepository")
public interface Image3DRepository
        extends JpaRepository<Image3DEntity, Integer> {
}
