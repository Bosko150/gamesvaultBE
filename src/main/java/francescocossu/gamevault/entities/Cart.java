package francescocossu.gamevault.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
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
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue
    private UUID id;
    @OneToOne
    @JsonBackReference
    private User user;
    @OneToMany
    private List<Game> games;
    private double totalPrice;
    private int totalGames;

}
