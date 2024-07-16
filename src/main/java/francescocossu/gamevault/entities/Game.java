package francescocossu.gamevault.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String backgroundImg;
    private String shortVideoPath;
    private String description;
    @Enumerated(EnumType.STRING)
    private Genre[] genres;
    private String platform;
    private String developer;
    private String publisher;
    private String releaseDate;
    private String fullPrice;
    private double discountedPrice;
    private String percentageDiscount;
    private String aboutTheGame;
    private String[] screenshots;
    private String trailer;
    private String[] systemRequirements;


}
