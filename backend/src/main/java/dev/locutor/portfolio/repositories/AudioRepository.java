package dev.locutor.portfolio.repositories;

import dev.locutor.portfolio.entities.AudioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
 
@Repository("audioRepository")
public interface AudioRepository
        extends JpaRepository<AudioEntity, Integer> {
}
