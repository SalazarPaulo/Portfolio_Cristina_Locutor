package dev.locutor.portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Image3D")
public class Image3DEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Image3D")
    private Integer id;

    @Column(name = "Title_Image3D")
    private String title;

    @Column(name = "Url_Image3D")
    private String url;

    public Image3DEntity() {
        this.id = id;
        this.title = title;
        this.url = url;
    }
}
