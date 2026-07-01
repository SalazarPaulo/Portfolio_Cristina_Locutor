package dev.locutor.portfolio.repository;

import java.util.List;

import dev.locutor.portfolio.domain.IconEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IconRepository extends JpaRepository<IconEntity, Integer> {

    List<IconEntity> findAllByOrderByIdAsc();
}
