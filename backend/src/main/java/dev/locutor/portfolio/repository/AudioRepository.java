package dev.locutor.portfolio.repository;

import java.util.List;

import dev.locutor.portfolio.domain.AudioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudioRepository extends JpaRepository<AudioEntity, Integer> {

    List<AudioEntity> findAllByOrderByIdAsc();
}
