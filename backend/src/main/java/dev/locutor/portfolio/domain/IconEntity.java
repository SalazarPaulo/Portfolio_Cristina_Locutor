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
@Table(name = "ICON")
public class IconEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ICON")
    private Integer id;

    @Column(name = "TITLE_ICON", nullable = false, length = 80)
    private String title;

    @Column(name = "URL_ICON", nullable = false, length = 500)
    private String url;

    @Column(name = "TYPE_ICON", nullable = false, length = 25)
    private String type;
}
