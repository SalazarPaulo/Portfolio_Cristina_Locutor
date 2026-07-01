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
@Table(name = "IMAGE3D")
public class Model3DEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_IMAGE3D")
    private Integer id;

    @Column(name = "TITLE_IMAGE3D", nullable = false, length = 80)
    private String title;

    @Column(name = "URL_IMAGE3D", nullable = false, length = 500)
    private String url;
}
