package francescocossu.gamevault.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue
    private UUID id;
    private String title;
    private String gameImg;
    private String backgroundImg;
    @Column(columnDefinition = "TEXT")
    private String shortVideoPath;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Genre.class)
    private List<Genre> genres;
    private String platform;
    private String developer;
    private String publisher;
    private LocalDate releaseDate;
    private String fullPrice;
    private double discountedPrice;
    private String percentageDiscount;
    @Column(columnDefinition = "TEXT")
    private String aboutTheGame;
    @ElementCollection
    private List<String> screenshots;
    @Column(columnDefinition = "TEXT")
    private String trailer;
    @ElementCollection
    private List<String> systemRequirements;
    @JsonIgnore
    @ManyToMany(mappedBy = "games")
    private List<Cart> carts;

}
