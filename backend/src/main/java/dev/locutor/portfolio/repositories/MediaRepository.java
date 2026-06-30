package dev.locutor.portfolio.repositories;

import dev.locutor.portfolio.entities.MediaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("mediaRepository")
public interface MediaRepository
        extends JpaRepository<MediaEntity, Integer> {
}
