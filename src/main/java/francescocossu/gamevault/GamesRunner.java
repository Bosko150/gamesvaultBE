package francescocossu.gamevault;


import francescocossu.gamevault.entities.Game;
import francescocossu.gamevault.entities.Genre;
import francescocossu.gamevault.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class GamesRunner implements ApplicationRunner {

    @Autowired
    private GameService gameService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Game Elden_Ring = new Game();
        Elden_Ring.setTitle("Elden Ring");
        Elden_Ring.setBackgroundImg("https://s1.gaming-cdn.com/img/products/4824/pcover/4824.jpg?v=1650985585");
        Elden_Ring.setGameImg("https://www.instant-gaming.com/images/products/4824/616x353/4824.jpg?v=1650985585");
        Elden_Ring.setShortVideoPath("https://s1.gaming-cdn.com/videos/products/4824/800x450/elden-ring-pc-game-steam-europe-preview.webm?v=1657036138");
        Elden_Ring.setFullPrice("60€");
        Elden_Ring.setDiscountedPrice(39.22);
        Elden_Ring.setPercentageDiscount("-34%");
        Elden_Ring.setDescription("Elden Ring for PC is an action role playing game (ARPG) written by superstars George R R Martin (the author of the Song of Ice and Fire series of books which begat television show Game of Thrones) and Hidetaka Miyazake (who is famed for many popular video games: from the Souls series, to Bloodborne, to Sekiro amongst many others).");
        Elden_Ring.setReleaseDate(LocalDate.of(2022, 1, 21));
        Elden_Ring.setDeveloper("FromSoftware");
        Elden_Ring.setPublisher("Bandai Namco");
        Elden_Ring.setGenres(List.of(Genre.ADVENTURE, Genre.ACTION, Genre.RPG, Genre.FANTASY));
        Elden_Ring.setTrailer("https://www.youtube.com/embed/E3Huy2cdih0");
        Elden_Ring.setScreenshots(List.of("https://s1.gaming-cdn.com/images/products/4824/screenshot/elden-ring-pc-game-steam-europe-wallpaper-1.jpg?v=1650985585",
                "https://s1.gaming-cdn.com/images/products/4824/screenshot/elden-ring-pc-game-steam-europe-wallpaper-2.jpg?v=1650985585",
                "https://s1.gaming-cdn.com/images/products/4824/screenshot/elden-ring-pc-game-steam-europe-wallpaper-3.jpg?v=1650985585",
                "https://s1.gaming-cdn.com/images/products/4824/screenshot/elden-ring-pc-game-steam-europe-wallpaper-4.jpg?v=1650985585",
                "https://s1.gaming-cdn.com/images/products/4824/screenshot/elden-ring-pc-game-steam-europe-wallpaper-5.jpg?v=1650985585")

        );
        Elden_Ring.setAboutTheGame("The Elden Ring has been destroyed and its shards have scattered throughout the lands, forming the Great Runes. Some of these shards have fallen into the hands of the children of Queen Marika the Eternal, and the promise of even more power has corrupted each of the six demi-gods.\n\n" +
                "The people who live on the land, used to enjoy the Grace of the Ring, given by the Erdtree, which showed with a kind of golden glow in the eyes – this glow has faded, indicating the loss of Grace, and those who remain are now called ‘the Tarnished.’ You are one of them, an exile from the Lands Between, because of the loss of Grace – and now it is your job to find the shards, restore the Ring and become Elden Lord, returning good to the land.\n\n" +
                "The Lands Between is a vast open world system so you can wander through the six regions (one per boss/ demi-god) in the Lands Between:\n" +
                "exploring castles, fortresses, catacombs, caves, grassy plains, suffocating swamps, spiralling mountains and so much more.\n\n" +
                "Each demi-god (being one of the Queen’s children) rules their section of the land, and eventually defeating them is the equivalent of a boss battle. All defeated enemies are transformed into spirits who can then be summoned to help you out when you need it. This summoning is also available in multiplayer mode – although in this case you call up other players to give you a hand!\n\n" +
                "For unexplained reasons, you have a spectral horse to ride as you wrest the shards from the demi-gods and hope to impress the Erdtree into restoring your Grace.");
        Elden_Ring.setSystemRequirements(List.of("OS: Windows 7 64-bit",
                "Processor: Intel Core i5-2300 2.8 GHz / AMD FX-6300 3.5 GHz",
                "Memory: 8 GB RAM",
                "Graphics: NVIDIA GeForce GTX 760 / AMD Radeon R7 260x",
                "DirectX: Version 11",
                "Storage: 50 GB available space",
                "Sound Card: DirectX compatible sound card",
                "Additional Notes: Requires Steam account to activate"));
        gameService.saveGame(Elden_Ring);

    }
}
