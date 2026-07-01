package dev.locutor.portfolio.repository;

import java.util.List;

import dev.locutor.portfolio.domain.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<DemoEntity, Integer> {

    List<DemoEntity> findAllByOrderByIdAsc();
}
