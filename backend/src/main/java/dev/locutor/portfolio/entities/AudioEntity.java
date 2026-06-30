package dev.locutor.portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Audio")
public class AudioEntity {
    @Id
    @Column(name="Id_Audio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Title_Audio")
    private String title;

    @Column(name="Url_Audio")
    private String url;

    @Column(name="Type_Audio")
    private String type;

    @Column(name="Subtypes_Audio")
    private Integer subtypes;

    public AudioEntity() {
        this.title = title;
        this.url = url;
        this.type = type;
        this.subtypes = subtypes;
    }

}
