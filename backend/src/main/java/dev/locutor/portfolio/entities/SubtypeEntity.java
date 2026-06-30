package dev.locutor.portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Subtype_Description")
public class SubtypeEntity {

    @Id
    @Column(name="Id_Subtype")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Description_Subtype")
    private String description;

    public SubtypeEntity() {
        this.id = id;
        this.description = description;
    }
}
