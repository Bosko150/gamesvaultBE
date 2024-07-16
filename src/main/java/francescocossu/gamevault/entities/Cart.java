package francescocossu.gamevault.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @JsonBackReference
    private User user;
    @OneToMany
    private List<Game> games;
    private double totalPrice;
    private int totalGames;

}
