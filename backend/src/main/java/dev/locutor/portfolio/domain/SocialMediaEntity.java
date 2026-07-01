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
@Table(name = "MEDIA")
public class SocialMediaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MEDIA")
    private Integer id;

    @Column(name = "TITLE_MEDIA", nullable = false, length = 80)
    private String title;

    @Column(name = "URL_MEDIA", nullable = false, length = 1000)
    private String url;

    @Column(name = "ICON_MEDIA", nullable = false)
    private Integer iconId;
}
