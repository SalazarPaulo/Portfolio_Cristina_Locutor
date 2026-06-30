package dev.locutor.portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Demos")
public class DemosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Demos")
    private Integer id;

    @Column(name = "Title_Demos")
    private String title;

    @Column(name = "Url_Demos")
    private String url;

    public DemosEntity() {
        this.id = id;
        this.title = title;
        this.url = url;
    }
}
