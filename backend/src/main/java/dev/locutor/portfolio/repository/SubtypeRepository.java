package dev.locutor.portfolio.repository;

import java.util.List;

import dev.locutor.portfolio.domain.SubtypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubtypeRepository extends JpaRepository<SubtypeEntity, Integer> {

    List<SubtypeEntity> findAllByOrderByIdAsc();
}
