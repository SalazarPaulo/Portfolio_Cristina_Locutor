package dev.locutor.portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Icon")
public class IconEntity {

    @Id
    @GeneratedValue()
    @Column(name = "Id_Icon")
    private Integer id;

    @Column(name = "Title_Icon")
    private String title;

    @Column(name = "Url_Icon")
    private String url;

    @Column(name = "Type_Icon")
    private String type;

    public IconEntity() {
        this.id = id;
        this.title = title;
        this.url = url;
        this.type = type;
    }
}
