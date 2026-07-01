package dev.locutor.portfolio.repository;

import java.util.List;

import dev.locutor.portfolio.domain.Model3DEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Model3DRepository extends JpaRepository<Model3DEntity, Integer> {

    List<Model3DEntity> findAllByOrderByIdAsc();
}
