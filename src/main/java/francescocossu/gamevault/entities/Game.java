package francescocossu.gamevault.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private String backgroundImg;
    private String shortVideoPath;
    private String description;
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Genre.class)
    private List<Genre> genres;
    private String platform;
    private String developer;
    private String publisher;
    private String releaseDate;
    private String fullPrice;
    private double discountedPrice;
    private String percentageDiscount;
    private String aboutTheGame;
    @ElementCollection
    private List<String> screenshots;
    private String trailer;
    @ElementCollection
    private List<String> systemRequirements;
    @ManyToMany(mappedBy = "games")
    private List<Cart> carts;

}
