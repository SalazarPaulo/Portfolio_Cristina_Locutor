package dev.locutor.portfolio.repository;

import java.util.List;

import dev.locutor.portfolio.domain.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity, Integer> {

    List<ImageEntity> findAllByOrderByIdAsc();
}
