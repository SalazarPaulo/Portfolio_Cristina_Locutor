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
@Table(name = "AUDIO")
public class AudioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AUDIO")
    private Integer id;

    @Column(name = "TITLE_AUDIO", nullable = false, length = 80)
    private String title;

    @Column(name = "URL_AUDIO", nullable = false, length = 500)
    private String url;

    @Column(name = "TYPE_AUDIO", nullable = false, length = 25)
    private String type;

    @Column(name = "DESCRIPTION_AUDIO", length = 500)
    private String description;

    @Column(name = "SUBTYPES_AUDIO")
    private Integer subtypeId;
}
