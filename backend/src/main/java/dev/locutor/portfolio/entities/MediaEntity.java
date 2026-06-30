package dev.locutor.portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Media")
public class MediaEntity {

    @Id
    @Column(name="Id_Media")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Title_Media")
    private String title;

    @Column(name="Url_Media")
    private String url;

    @Column(name="icon_Media")
    private String icon;

    public MediaEntity() {
        this.id = id;
        this.title = title;
        this.url = url;
        this.icon = icon;
    }

}
