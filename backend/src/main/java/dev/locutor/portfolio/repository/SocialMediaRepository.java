package dev.locutor.portfolio.repository;

import java.util.List;

import dev.locutor.portfolio.domain.SocialMediaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialMediaRepository extends JpaRepository<SocialMediaEntity, Integer> {

    List<SocialMediaEntity> findAllByOrderByIdAsc();
}
