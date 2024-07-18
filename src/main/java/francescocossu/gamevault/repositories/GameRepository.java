package francescocossu.gamevault.repositories;


import francescocossu.gamevault.entities.Game;
import francescocossu.gamevault.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface GameRepository extends JpaRepository<Game, UUID> {
    Optional<Game> findByTitle(String title);

    boolean existsByTitle(String title);

    List<Game> findByGenresIn(List<Genre> genres);

    Optional<Game> findByDeveloper(String developer);

    Optional<Game> findByPublisher(String publisher);

}
