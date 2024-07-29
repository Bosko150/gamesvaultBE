package francescocossu.gamevault.repositories;


import francescocossu.gamevault.entities.Game;
import francescocossu.gamevault.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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

    List<Game> findByTitleContainingIgnoreCase(String title);

    @Query("SELECT g FROM Game g WHERE " +
            "(:title IS NULL OR LOWER(g.title) LIKE LOWER(CONCAT('%', :title, '%'))) " +
            "AND (:genre IS NULL OR :genre MEMBER OF g.genres) " +
            "AND (:minPrice IS NULL OR g.discountedPrice >= :minPrice) " +
            "AND (:maxPrice IS NULL OR g.discountedPrice <= :maxPrice) " +
            "ORDER BY " +
            "CASE WHEN :orderBy = 'Price Ascending' THEN g.discountedPrice END ASC, " +
            "CASE WHEN :orderBy = 'Price Descending' THEN g.discountedPrice END DESC, " +
            "CASE WHEN :orderBy = 'Title' THEN g.title END ASC, " +
            "CASE WHEN :orderBy = 'Release date' THEN g.releaseDate END DESC")
    List<Game> filterGames(@Param("title") String title,
                           @Param("genre") Genre genre,
                           @Param("orderBy") String orderBy,
                           @Param("minPrice") Double minPrice,
                           @Param("maxPrice") Double maxPrice);

}


