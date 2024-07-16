package francescocossu.gamevault.repositories;


import francescocossu.gamevault.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface GameRepository extends JpaRepository<Game, UUID> {
    Optional<Game> findByTitle(String title);

    boolean existsByTitle(String title);

    Optional<Game> findByGenre(String[] genres);

}
