package dev.locutor.portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Image")
public class ImageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Image")
    private Integer id;

    @Column(name = "Title_Image")
    private Integer title;

    @Column(name = "Url_Image")
    private Integer url;

    @Column(name = "Type_Image")
    private Integer type;

    @Column(name = "Subtypes_Image")
    private Integer subtype;

    public ImageEntity() {
        this.id = id;
        this.title = title;
        this.url = url;
        this.type = type;
        this.subtype = subtype;
    }
}
