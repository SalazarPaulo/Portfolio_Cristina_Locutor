package dev.locutor.portfolio.repositories;

import dev.locutor.portfolio.entities.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("imageRepository")
public interface ImageRepository
        extends JpaRepository<ImageEntity, Integer> {
}
