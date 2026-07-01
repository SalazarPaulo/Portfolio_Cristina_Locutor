package dev.locutor.portfolio.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "IMAGE")
public class ImageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_IMAGE")
    private Integer id;

    @Column(name = "TITLE_IMAGE", nullable = false, length = 80)
    private String title;

    @Column(name = "URL_IMAGE", nullable = false, length = 500)
    private String url;

    @Column(name = "TYPE_IMAGE", nullable = false, length = 25)
    private String type;

    @Column(name = "SUBTYPES_IMAGE")
    private Integer subtypeId;
}
