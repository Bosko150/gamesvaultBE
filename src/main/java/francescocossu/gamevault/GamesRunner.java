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
        Elden_Ring.setPlatform("Steam");
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


        /*Game Ghost_of_Tsushima = new Game();
        Ghost_of_Tsushima.setTitle("Ghost of Tsushima");
        Ghost_of_Tsushima.setBackgroundImg("https://gaming-cdn.com/img/products/9093/pcover/9093.jpg?v=1715876608");
        Ghost_of_Tsushima.setGameImg("https://gaming-cdn.com/images/products/9093/616x353/ghost-of-tsushima-director-s-cut-pc-gioco-steam-cover.jpg?v=1715876608");
        Ghost_of_Tsushima.setShortVideoPath("https://gaming-cdn.com/videos/products/9093/800x450/ghost-of-tsushima-director-s-cut-pc-gioco-steam-preview.webm?v=1709748225");
        Ghost_of_Tsushima.setFullPrice("60€");
        Ghost_of_Tsushima.setDiscountedPrice(44.09);
        Ghost_of_Tsushima.setPercentageDiscount("-27%");
        Ghost_of_Tsushima.setDescription("Ghost of Tsushima for PC is an award winning action adventure open world game, with a third-person player perspective. It is set in ancient feudal Japan, but the issues faced by the protagonist will be easily understood by Western, modern players.");
        Ghost_of_Tsushima.setReleaseDate(LocalDate.of(2024, 5, 16));
        Ghost_of_Tsushima.setDeveloper("Sucker Punch Productions");
        Ghost_of_Tsushima.setPublisher("PlayStation PC LLC");
        Ghost_of_Tsushima.setPlatform("Steam");
        Ghost_of_Tsushima.setGenres(List.of(Genre.ADVENTURE, Genre.ACTION, Genre.SINGLEPLAYER));
        Ghost_of_Tsushima.setTrailer("https://youtube.com/embed/t72fTa2wVWk");
        Ghost_of_Tsushima.setScreenshots(List.of("https://gaming-cdn.com/images/products/9093/screenshot/ghost-of-tsushima-director-s-cut-pc-game-steam-wallpaper-1.jpg?v=1715876608",
                "https://gaming-cdn.com/images/products/9093/screenshot/ghost-of-tsushima-director-s-cut-pc-game-steam-wallpaper-2.jpg?v=1715876608",
                "https://gaming-cdn.com/images/products/9093/screenshot/ghost-of-tsushima-director-s-cut-pc-game-steam-wallpaper-3.jpg?v=1715876608",
                "https://gaming-cdn.com/images/products/9093/screenshot/ghost-of-tsushima-director-s-cut-pc-game-steam-wallpaper-4.jpg?v=1715876608",
                "https://gaming-cdn.com/images/products/9093/screenshot/ghost-of-tsushima-director-s-cut-pc-game-steam-wallpaper-5.jpg?v=1715876608")

        );
        Ghost_of_Tsushima.setAboutTheGame("The game’s storyline is a 13th-century Japanese epic, with beautiful, detailed scenery including animals (songbirds including golden ones which lead you not-so-subtly when you get lost or distracted, crickets, and foxes which you can pet) torii gates, and Shinto temples.\n" +
                "\n" +
                "You are samurai lord Jin Sakai, and you are tasked with repelling the so-far-successful Mongol invaders (under Khotun Khan, who is the grandson of the acclaimed Genghis) to reclaim your land and avenge the insult to your home which has been invaded and taken over.\n" +
                "\n" +
                "However, in order to succeed, you have to make some hard decisions: adhere to the strict honourable protocols of samurai, or do the ‘right’ thing morally? As you morph from Jin, the upright samurai, into ‘The Ghost,’ you will gather a motley crew of allies about you, and as you travel, you will uncover their back stories and help them resolve their issues.\n" +
                "\n" +
                "Your allies include Sensei Ishikawa, the renowned samurai archer searching for his missing student; Masako, a grief-stricken mother out for revenge on those who murdered her family; and Yuna, the thief who saved your life at the very beginning of the story, and will do whatever it takes to save her brother from the Mongols.");
        Ghost_of_Tsushima.setSystemRequirements(List.of("OS:Windows 10 64-bit",
                "Processor:Intel Core i3-7100 or AMD Ryzen 3 1200",
                "Memory:8 GB RAM",
                "Graphics:NVIDIA GeForce GTX 960 or AMD Radeon RX 5500 XT",
                "DirectX: Version 11",
                "Storage:75 GB available space",
                "Sound Card: DirectX compatible sound card",
                "Additional Notes:SSD Recommended"));*/

        Game God_of_War = new Game();
        God_of_War.setTitle("God of War");
        God_of_War.setBackgroundImg("https://s3.gaming-cdn.com/img/products/7325/pcover/7325.jpg?v=1668157899");
        God_of_War.setGameImg("https://www.instant-gaming.com/images/products/7325/616x353/7325.jpg?v=1668157899");
        God_of_War.setShortVideoPath("https://www.instant-gaming.com/videos/products/7325/800x450/god-of-war-pc-game-steam-preview.webm?v=1657036406");
        God_of_War.setFullPrice("50€");
        God_of_War.setDiscountedPrice(19.81);
        God_of_War.setPercentageDiscount("-60%");
        God_of_War.setDescription("God of War for PC was teased for months, from about halfway through 2021 until the developers finally put players out of their misery and confirmed the PC release in January 2022! It is the PC-friendly version of the 2018 Gods of War, which was initially only available on PlayStation. The game allows PC gamers to enjoy the intense Norse God action-adventure game. The game is the eighth in the whole cross-platform series and takes place against a background that while not really being open world and more a series of linked locations, is still wide and explorable within those locations. You seldom feel constrained despite the linear game progression.");
        God_of_War.setReleaseDate(LocalDate.of(2022, 1, 20));
        God_of_War.setDeveloper("Santa Monica Studio");
        God_of_War.setPublisher("Sony Interactive Entertainment");
        God_of_War.setPlatform("Steam");
        God_of_War.setGenres(List.of(Genre.ADVENTURE, Genre.ACTION, Genre.FANTASY));
        God_of_War.setTrailer("https://www.youtube.com/embed/K0u_kAWLJOA");
        God_of_War.setScreenshots(List.of("https://s1.gaming-cdn.com/images/products/7325/screenshot/god-of-war-pc-game-steam-europe-wallpaper-1.jpg?v=1650985585",
                "https://s1.gaming-cdn.com/images/products/7325/screenshot/god-of-war-pc-game-steam-europe-wallpaper-2.jpg?v=1650985585",
                "https://s1.gaming-cdn.com/images/products/7325/screenshot/god-of-war-pc-game-steam-europe-wallpaper-3.jpg?v=1650985585",
                "https://s1.gaming-cdn.com/images/products/7325/screenshot/god-of-war-pc-game-steam-europe-wallpaper-4.jpg?v=1650985585",
                "https://s1.gaming-cdn.com/images/products/7325/screenshot/god-of-war-pc-game-steam-europe-wallpaper-5.jpg?v=1650985585")

        );
        God_of_War.setAboutTheGame("The game’s plot plays out against the background of Norse gods in this iteration, rather than the Ancient Greece of the original games, and it is loosely set in Medieval Scandinavia in the realm of Midgard, which is the Norse equivalent of the lands inhabited by the earliest humans when the world was young. There are two protagonists in the game, one of whom is playable. Kratos – a former Greek God of War and only playable character – is accompanied by his young son, Atreus, who looks to be anywhere between eight years old and twelve or so. The two of them are on an honour quest, to dispose of Faye’s (Atreus’s mother) ashes according to her deathbed wish, to have her remains scattered on the highest peak of the nine realms. Of course, there would be no story if everything went smoothly, and so, their quest is disrupted by monsters and gods who have other ideas about who should be able to dispose of their earthly remains on the sacred peak. The monsters start off large and scary and steadily get larger and scarier, giving you plenty of scope to improve your skills and then try them out. The combat is wonderful: bloody, brutal and – thanks to the physics engine – satisfying! Almost equally satisfying and rare in a game better known for skull-shattering crunches and broken bones, is the arc between Kratos and Atreus. When they set off, they are almost strangers to each other, both feeling that the other expects more of them than they give. This arc progresses along with the game, ending with a much closer, more respectful and loving relationship between the two. And all without impacting the joyous blood-shed!");
        God_of_War.setSystemRequirements(List.of("OS: Windows 7 64-bit",
                "Processor: Intel Core i5-2300 2.8 GHz / AMD FX-6300 3.5 GHz",
                "Memory:8 GB RAM",
                "Graphics: NVIDIA GeForce GTX 760 / AMD Radeon R7 260x",
                "DirectX: Version 11",
                "Storage: 50 GB available space",
                "Sound Card: DirectX compatible sound card",
                "Additional Notes: Requires Steam account to activate"));


        Game Cyberpunk_2077 = new Game();
        Cyberpunk_2077.setTitle("Cyberpunk 2077");
        Cyberpunk_2077.setBackgroundImg("https://s1.gaming-cdn.com/img/products/840/pcover/840.jpg?v=1663862900");
        Cyberpunk_2077.setGameImg("https://s1.gaming-cdn.com/images/products/840/616x353/cyberpunk-2077-pc-game-gog-com-cover.jpg?v=1663862900");
        Cyberpunk_2077.setShortVideoPath("https://s1.gaming-cdn.com/videos/products/840/800x450/cyberpunk-2077-pc-game-gog-com-preview.webm?v=1657028199");
        Cyberpunk_2077.setFullPrice("60€");
        Cyberpunk_2077.setDiscountedPrice(22.51);
        Cyberpunk_2077.setPercentageDiscount("-62%");
        Cyberpunk_2077.setDescription("Cyberpunk 2077 for PC is a role-playing video game, based on the table game of the same name, and the third in the video game series. Players take turns in moving their pieces/ characters around the map and learn how to best manage their settlements so as to achieve all their aims, defeat their enemies and get along with those they cannot immediately defeat!");
        Cyberpunk_2077.setReleaseDate(LocalDate.of(2022, 5, 28));
        Cyberpunk_2077.setDeveloper("CD PROJEKT RED");
        Cyberpunk_2077.setPublisher("CD PROJEKT RED");
        Cyberpunk_2077.setPlatform("Steam");
        Cyberpunk_2077.setGenres(List.of(Genre.ADVENTURE, Genre.ACTION, Genre.FPS, Genre.RPG));
        Cyberpunk_2077.setTrailer("https://www.youtube.com/embed/8X2kIfS6fb8");
        Cyberpunk_2077.setScreenshots(List.of("https://s1.gaming-cdn.com/images/products/840/screenshot/cyberpunk-2077-pc-game-gog-com-wallpaper-1.jpg?v=1663862900",
                "https://s1.gaming-cdn.com/images/products/840/screenshot/cyberpunk-2077-pc-game-gog-com-wallpaper-2.jpg?v=1663862900",
                "https://s1.gaming-cdn.com/images/products/840/screenshot/cyberpunk-2077-pc-game-gog-com-wallpaper-3.jpg?v=1663862900",
                "https://s1.gaming-cdn.com/images/products/840/screenshot/cyberpunk-2077-pc-game-gog-com-wallpaper-4.jpg?v=1663862900",
                "https://s1.gaming-cdn.com/images/products/840/screenshot/cyberpunk-2077-pc-game-gog-com-wallpaper-5.jpg?v=1663862900")

        );
        Cyberpunk_2077.setAboutTheGame("Set fifty-seven years after the table-top game upon which it is based, Cyberpunk 2020, the graphics are exquisitely rendered with characters, scenery and even actions and movements so realistic that they could be mistaken for movie footage.");
        Cyberpunk_2077.setSystemRequirements(List.of("OS: Windows 10 64-bit",
                "Processor: Intel Core i5-3570K 3.4 GHz / AMD Ryzen 5 1400",
                "Memory: 8 GB RAM",
                "Graphics: NVIDIA GeForce GTX 780 3GB / AMD Radeon RX 470 4GB",
                "DirectX: Version 12",
                "Storage: 70 GB available space",
                "Sound Card: DirectX compatible sound card",
                "Additional Notes: Requires Steam account to activate"));


        Game The_Witcher_3 = new Game();
        The_Witcher_3.setTitle("The Witcher 3: Wild Hunt");
        The_Witcher_3.setBackgroundImg("https://s2.gaming-cdn.com/img/products/268/pcover/268.jpg?v=1650526691");
        The_Witcher_3.setGameImg("https://s2.gaming-cdn.com/images/products/268/616x353/the-witcher-3-wild-hunt-pc-game-gog-com-cover.jpg?v=1650526691");
        The_Witcher_3.setShortVideoPath("https://s2.gaming-cdn.com/videos/products/268/800x450/the-witcher-3-wild-hunt-pc-game-gog-com-preview.webm?v=1657359894");
        The_Witcher_3.setFullPrice("30€");
        The_Witcher_3.setDiscountedPrice(10.54);
        The_Witcher_3.setPercentageDiscount("-65%");
        The_Witcher_3.setDescription("You are Geralt of Rivia, mercenary monster slayer. Before you stands a war-torn, monster-infested continent you can explore at will. Your current contract? Tracking down Ciri — the Child of Prophecy, a living weapon that can alter the shape of the world.");
        The_Witcher_3.setReleaseDate(LocalDate.of(2015, 5, 19));
        The_Witcher_3.setDeveloper("CD PROJEKT RED");
        The_Witcher_3.setPublisher("CD PROJEKT RED");
        The_Witcher_3.setPlatform("Steam");
        The_Witcher_3.setGenres(List.of(Genre.ADVENTURE, Genre.ACTION, Genre.FANTASY, Genre.RPG));
        The_Witcher_3.setTrailer("https://www.youtube.com/embed/c0i88t0Kacs");
        The_Witcher_3.setScreenshots(List.of("https://s2.gaming-cdn.com/images/products/268/screenshot/the-witcher-3-wild-hunt-pc-game-gog-com-wallpaper-1.jpg?v=1657359894",
                "https://s2.gaming-cdn.com/images/products/268/screenshot/the-witcher-3-wild-hunt-pc-game-gog-com-wallpaper-2.jpg?v=1657359894",
                "https://s2.gaming-cdn.com/images/products/268/screenshot/the-witcher-3-wild-hunt-pc-game-gog-com-wallpaper-3.jpg?v=1657359894",
                "https://s2.gaming-cdn.com/images/products/268/screenshot/the-witcher-3-wild-hunt-pc-game-gog-com-wallpaper-4.jpg?v=1657359894",
                "https://s2.gaming-cdn.com/images/products/268/screenshot/the-witcher-3-wild-hunt-pc-game-gog-com-wallpaper-5.jpg?v=1657359894")

        );
        The_Witcher_3.setAboutTheGame("Behold the dark fantasy world of the Continent like never before! This edition of The Witcher 3: Wild Hunt has been enhanced with numerous visual and technical improvements, including vastly improved level of detail, a range of community created and newly developed mods for the game, real-time ray tracing, and more — all implemented with the power of modern PCs in mind.");
        The_Witcher_3.setSystemRequirements(List.of("OS: Windows 7 64-bit",
                "Processor: Intel Core i5-2500K or AMD FX-6300",
                "Memory: 8 GB RAM",
                "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260X",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage: 50 GB available space"));

        Game Skyrim = new Game();
        Skyrim.setTitle("The Elder Scrolls V: Skyrim Special Edition");
        Skyrim.setBackgroundImg("https://s1.gaming-cdn.com/img/products/1512/pcover/1512.jpg?v=1666705850");
        Skyrim.setGameImg("https://www.instant-gaming.com/images/products/13322/616x353/13322.jpg?v=1670857179");
        Skyrim.setShortVideoPath("https://www.instant-gaming.com/videos/products/13322/800x450/the-elder-scrolls-v-skyrim-anniversary-upgrade-xbox-one-xbox-series-x-s-xbox-series-x-s-xbox-one-game-microsoft-store-europe-preview.webm?v=1670857078");
        Skyrim.setFullPrice("40€");
        Skyrim.setDiscountedPrice(8.54);
        Skyrim.setPercentageDiscount("-79%");
        Skyrim.setDescription("The Elder Scrolls V: Skyrim Special Edition is a remastered version of the 2011 game The Elder Scrolls V: Skyrim, the fifth installment in The Elder Scrolls series, following The Elder Scrolls IV: Oblivion. The Special Edition includes the original game and add-ons with all-new features like remastered art and effects, volumetric god rays, dynamic depth of field, screen-space reflections, and more. Skyrim Special Edition also brings the power of mods to the PC and consoles. New quests, environments, characters, dialogue, armor, weapons and more – with Mods, there are no limits to what you can experience.");
        Skyrim.setReleaseDate(LocalDate.of(2016, 10, 28));
        Skyrim.setDeveloper("Bethesda Game Studios");
        Skyrim.setPublisher("Bethesda Softworks");
        Skyrim.setPlatform("Steam");
        Skyrim.setGenres(List.of(Genre.ADVENTURE, Genre.ACTION, Genre.FANTASY, Genre.RPG));
        Skyrim.setTrailer("https://www.youtube.com/embed/lTjRZ__-278");
        Skyrim.setScreenshots(List.of("https://s1.gaming-cdn.com/images/products/13322/screenshot/the-elder-scrolls-v-skyrim-special-edition-special-edition-pc-game-steam-wallpaper-1.jpg?v=1670857179",
                "https://s1.gaming-cdn.com/images/products/13322/screenshot/the-elder-scrolls-v-skyrim-special-edition-special-edition-pc-game-steam-wallpaper-2.jpg?v=1670857179",
                "https://s1.gaming-cdn.com/images/products/13322/screenshot/the-elder-scrolls-v-skyrim-special-edition-special-edition-pc-game-steam-wallpaper-3.jpg?v=1670857179",
                "https://s1.gaming-cdn.com/images/products/13322/screenshot/the-elder-scrolls-v-skyrim-special-edition-special-edition-pc-game-steam-wallpaper-4.jpg?v=1670857179",
                "https://s1.gaming-cdn.com/images/products/13322/screenshot/the-elder-scrolls-v-skyrim-special-edition-special-edition-pc-game-steam-wallpaper-5.jpg?v=1670857179")

        );
        Skyrim.setAboutTheGame("Winner of more than 200 Game of the Year Awards, The Elder Scrolls V: Skyrim Special Edition brings the epic fantasy to life in stunning detail. The Special Edition includes the critically acclaimed game and add-ons with all-new features like remastered art and effects, volumetric god rays, dynamic depth of field, screen-space reflections, and more.");
        Skyrim.setSystemRequirements(List.of("OS: Windows 7/8.1/10 (64-bit versions)",
                "Processor: Intel Core i5-750, 2.67 GHz or AMD Phenom II X4 955, 3.2 GHz",
                "Memory: 8 GB RAM",
                "Graphics: NVIDIA GeForce GTX 470 (1GB VRAM) or AMD Radeon HD 7870 (2GB VRAM)",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage: 12 GB available space"));


        Game Helldivers_2 = new Game();
        Helldivers_2.setTitle("Helldivers 2");
        Helldivers_2.setBackgroundImg("https://gaming-cdn.com/img/products/9575/pcover/9575.jpg?v=1714742438");
        Helldivers_2.setGameImg("https://gaming-cdn.com/images/products/9575/616x353/helldivers-2-pc-game-steam-europe-cover.jpg?v=1714742438");
        Helldivers_2.setShortVideoPath("https://gaming-cdn.com/videos/products/9575/800x450/helldivers-2-pc-game-steam-europe-preview.webm?v=1706789189");
        Helldivers_2.setFullPrice("40€");
        Helldivers_2.setDiscountedPrice(27.69);
        Helldivers_2.setPercentageDiscount("-31%");
        Helldivers_2.setDescription("The Galaxy’s Last Line of Offence.\n" +
                "\n" +
                "Enlist in the Helldivers and join the fight for freedom across a hostile galaxy in a fast, frantic, and ferocious third-person shooter.");
        Helldivers_2.setReleaseDate(LocalDate.of(2024, 2, 8));
        Helldivers_2.setDeveloper("Arrowhead Game Studios");
        Helldivers_2.setPublisher("PlayStation Mobile, Inc.");
        Helldivers_2.setPlatform("Steam");
        Helldivers_2.setGenres(List.of(Genre.ACTION, Genre.MULTIPLAYER));
        Helldivers_2.setTrailer("https://www.youtube.com/embed/oD3pxbG9YYI?si=XfyYtHhL5pCvpYr4");
        Helldivers_2.setScreenshots(List.of("https://gaming-cdn.com/images/products/9575/screenshot/helldivers-2-pc-game-steam-europe-wallpaper-1.jpg?v=1714742438",
                "https://gaming-cdn.com/images/products/9575/screenshot/helldivers-2-pc-game-steam-europe-wallpaper-2.jpg?v=1714742438",
                "https://gaming-cdn.com/images/products/9575/screenshot/helldivers-2-pc-game-steam-europe-wallpaper-3.jpg?v=1714742438",
                "https://gaming-cdn.com/images/products/9575/screenshot/helldivers-2-pc-game-steam-europe-wallpaper-4.jpg?v=1714742438",
                "https://gaming-cdn.com/images/products/9575/screenshot/helldivers-2-pc-game-steam-europe-wallpaper-5.jpg?v=1714742438")

        );
        Helldivers_2.setAboutTheGame("Freedom. Peace. Democracy. Your Super Earth-born rights. The key pillars of our civilization.\n" +
                "Of our very existence.\n" +
                "But the war rages on. And everything is once again under threat.\n" +
                "Join the greatest military force the galaxy has ever seen and make this a safe and free place to live.");
        Helldivers_2.setSystemRequirements(List.of("OS:Windows 10",
                "Processor:Intel Core i7-4790K or AMD Ryzen 5 1500X",
                "Memory:8 GB RAM",
                "Graphics:NVIDIA GeForce GTX 1050 Ti or AMD Radeon RX 470",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage:100 GB available space"));


        Game V_Rising = new Game();
        V_Rising.setTitle("V Rising");
        V_Rising.setBackgroundImg("https://gaming-cdn.com/img/products/11030/pcover/1920x620/11030.jpg?v=1715247025");
        V_Rising.setGameImg("https://gaming-cdn.com/images/products/11030/616x353/v-rising-pc-game-steam-cover.jpg?v=1721390400");
        V_Rising.setShortVideoPath("https://gaming-cdn.com/videos/products/11030/800x450/v-rising-pc-game-steam-preview.webm?v=1715249046");
        V_Rising.setFullPrice("35€");
        V_Rising.setDiscountedPrice(18.78);
        V_Rising.setPercentageDiscount("-46%");
        V_Rising.setDescription("Experience a Vampire Survival Action RPG adventure like no other.\n" +
                "\n" +
                "Awaken as a weakened Vampire after centuries of slumber. Hunt for blood to regain your strength while hiding from the scorching sun to survive. Rebuild your castle and convert humans into your loyal servants in a quest to raise your Vampire empire. Make allies or enemies online or play solo locally, fend off holy soldiers, and wage war in a world of conflict. Seize your destiny! Defy Dracula! Rule the night!");
        V_Rising.setReleaseDate(LocalDate.of(2024, 5, 8));
        V_Rising.setDeveloper("Stunlock Studios");
        V_Rising.setPublisher("Stunlock Studios");
        V_Rising.setPlatform("Steam");
        V_Rising.setGenres(List.of(Genre.SINGLEPLAYER, Genre.ACTION, Genre.ADVENTURE));
        V_Rising.setTrailer("https://www.youtube.com/embed/aB_2ZRn9F_k?si=lhk_iuzFMhH2_PJc");
        V_Rising.setScreenshots(List.of("https://gaming-cdn.com/images/products/11030/screenshot/v-rising-pc-game-steam-wallpaper-1.jpg?v=1715247025",
                "https://gaming-cdn.com/images/products/11030/screenshot/v-rising-pc-game-steam-wallpaper-2.jpg?v=1715247025",
                "https://gaming-cdn.com/images/products/11030/screenshot/v-rising-pc-game-steam-wallpaper-3.jpg?v=1715247025",
                "https://gaming-cdn.com/images/products/11030/screenshot/v-rising-pc-game-steam-wallpaper-4.jpg?v=1715247025",
                "https://gaming-cdn.com/images/products/11030/screenshot/v-rising-pc-game-steam-wallpaper-5.jpg?v=1715247025")

        );
        V_Rising.setAboutTheGame("Explore a vast world teeming with mythical horrors and danger. Travel through lush forests, open countryside, and dark caverns to discover valuable resources, meeting friends and foes alike along the way. Traverse the world with vampire comrades or hunt solo as you pillage villages, raid bandits, and delve into the domains of supernatural beasts.");
        V_Rising.setSystemRequirements(List.of("OS:Windows 10",
                "Processor:Intel Core i7-4790K or AMD Ryzen 5 1500X",
                "Memory:8 GB RAM",
                "Graphics:NVIDIA GeForce GTX 750 Ti (Maxwell or newer), 2 GB or AMD Radeon R7 360, 2 GB",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage:7 GB available space"));


        Game NBA_2k25 = new Game();
        NBA_2k25.setTitle("NBA 2k25");
        NBA_2k25.setBackgroundImg("https://gaming-cdn.com/img/products/17194/pcover/1920x620/17194.jpg?v=1721141445");
        NBA_2k25.setGameImg("https://www.instant-gaming.com/images/products/17194/616x353/17194.jpg?v=1721141445");
        NBA_2k25.setShortVideoPath("https://www.instant-gaming.com/videos/products/17194/800x450/nba-2k25-pc-game-steam-preview.webm?v=1721140822");
        NBA_2k25.setFullPrice("70€");
        NBA_2k25.setDiscountedPrice(51.39);
        NBA_2k25.setPercentageDiscount("-27%");
        NBA_2k25.setDescription("Command every court with authenticity and realism Powered by ProPLAY, giving you ultimate control over how you play in NBA 2K25. Define your legacy in MyCAREER, MyTEAM, MyNBA, and The W. Express yourself with an array of customization options and explore an all-new City rich with opportunity.");
        NBA_2k25.setReleaseDate(LocalDate.of(2024, 9, 6));
        NBA_2k25.setDeveloper("Visual Concepts");
        NBA_2k25.setPublisher("2k");
        NBA_2k25.setPlatform("Steam");
        NBA_2k25.setGenres(List.of(Genre.SPORTS, Genre.SINGLEPLAYER, Genre.MULTIPLAYER));
        NBA_2k25.setTrailer("https://www.youtube.com/embed/ShJbIrfCO9o?si=OGHPlGPlr_9KBfHt");
        NBA_2k25.setScreenshots(List.of("https://gaming-cdn.com/images/products/17194/screenshot/nba-2k25-pc-game-steam-wallpaper-1.jpg?v=1721141445",
                "https://gaming-cdn.com/images/products/17194/screenshot/nba-2k25-pc-game-steam-wallpaper-2.jpg?v=1721141445",
                "https://gaming-cdn.com/images/products/17194/screenshot/nba-2k25-pc-game-steam-wallpaper-3.jpg?v=1721141445",
                "https://gaming-cdn.com/images/products/17194/screenshot/nba-2k25-pc-game-steam-wallpaper-4.jpg?v=1721141445",
                "https://gaming-cdn.com/images/products/17194/screenshot/nba-2k25-pc-game-steam-wallpaper-5.jpg?v=1721141445")

        );
        NBA_2k25.setAboutTheGame("Build a dynasty that transcends eras, and redefine what it means to be the best as a General Manager in MyNBA. Explore the unique challenges that come with overseeing an NBA front office and cherish the ultimate reward of winning a championship, or multiple. Choose from six Eras, including an all-new Era, and become the next mastermind to change the game forever.");
        NBA_2k25.setSystemRequirements(List.of("OS:Windows 10",
                "Processor:Intel Core i3-9100 or AMD Ryzen 3 1200",
                "Memory:8 GB RAM",
                "Graphics:NVIDIA GeForce GTX 960 4 GB or AMD Radeon RX 570 4 GB or Intel Arc A580",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage:150 GB available space"));


        Game FIFA_23 = new Game();
        FIFA_23.setTitle("FIFA 23");
        FIFA_23.setBackgroundImg("https://gaming-cdn.com/img/products/10545/pcover/1920x620/10545.jpg?v=1703155498");
        FIFA_23.setGameImg("https://www.instant-gaming.com/images/products/10545/616x353/10545.jpg?v=1703155498");
        FIFA_23.setShortVideoPath("https://www.instant-gaming.com/videos/products/10545/800x450/fifa-23-pc-game-ea-app-preview.webm?v=1666702746");
        FIFA_23.setFullPrice("70€");
        FIFA_23.setDiscountedPrice(20.39);
        FIFA_23.setPercentageDiscount("-71%");
        FIFA_23.setDescription("FIFA 23 for PC is the latest in an immense line of football based games. From humble beginnings in 1993 with the release of FIFA International Soccer, this game franchise has been produced in over 18 languages in 51 countries, selling over 325 million copies – an impressive record for any video game series.");
        FIFA_23.setReleaseDate(LocalDate.of(2022, 10, 1));
        FIFA_23.setDeveloper("EA Vancouver");
        FIFA_23.setPublisher("Electronic Arts");
        FIFA_23.setPlatform("Steam");
        FIFA_23.setGenres(List.of(Genre.SPORTS, Genre.SINGLEPLAYER, Genre.MULTIPLAYER));
        FIFA_23.setTrailer("https://www.youtube.com/embed/0tIW1X2dv0c");
        FIFA_23.setScreenshots(List.of("https://s1.gaming-cdn.com/images/products/10545/screenshot/fifa-23-pc-game-origin-wallpaper-1.jpg?v=1666702746",
                "https://s1.gaming-cdn.com/images/products/10545/screenshot/fifa-23-pc-game-origin-wallpaper-2.jpg?v=1666702746",
                "https://s1.gaming-cdn.com/images/products/10545/screenshot/fifa-23-pc-game-origin-wallpaper-3.jpg?v=1666702746",
                "https://s1.gaming-cdn.com/images/products/10545/screenshot/fifa-23-pc-game-origin-wallpaper-4.jpg?v=1666702746",
                "https://s1.gaming-cdn.com/images/products/10545/screenshot/fifa-23-pc-game-origin-wallpaper-5.jpg?v=1666702746")

        );
        FIFA_23.setAboutTheGame("This game continues the sterling work of previous games in the franchise and this includes the inclusiveness seen on the real field, with women’s teams making a strong appearance.\n" +
                "\n" +
                "There are even domestic leagues, such as Barclays FA Women’s Super League and Division 1 Arkema, which will allow you to play through career mode as a female player for the first time.");
        FIFA_23.setSystemRequirements(List.of("OS: Windows 10 64-bit",
                "Processor: Intel Core i5 6600k or AMD Ryzen 5 1600",
                "Memory: 8 GB RAM",
                "Graphics: NVIDIA GeForce GTX 1050 Ti or AMD Radeon RX 570",
                "DirectX: Version 12",
                "Network: Broadband Internet connection",
                "Storage: 100 GB available space"));


        Game Atomic_Heart = new Game();
        Atomic_Heart.setTitle("Atomic Heart");
        Atomic_Heart.setBackgroundImg("https://s3.gaming-cdn.com/img/products/2587/pcover/2587.jpg?v=16787071535");
        Atomic_Heart.setGameImg("https://www.instant-gaming.com/images/products/2587/616x353/2587.jpg?v=16787071535");
        Atomic_Heart.setShortVideoPath("https://www.instant-gaming.com/videos/products/2587/800x450/atomic-heart-pc-game-steam-preview.webm?v=1663602384");
        Atomic_Heart.setFullPrice("60€");
        Atomic_Heart.setDiscountedPrice(41.25);
        Atomic_Heart.setPercentageDiscount("-31%");
        Atomic_Heart.setDescription("Atomic Heart for PC is a first-person shooter set in a Soviet-era research facility. The game is set in a Soviet-era research facility, where the player must explore the facility and solve puzzles to progress through the game. The game is set in a Soviet-era research facility, where the player must explore the facility and solve puzzles to progress through the game.");
        Atomic_Heart.setReleaseDate(LocalDate.of(2023, 2, 20));
        Atomic_Heart.setDeveloper("Mundfish");
        Atomic_Heart.setPublisher("Focus Entertainment");
        Atomic_Heart.setPlatform("Steam");
        Atomic_Heart.setGenres(List.of(Genre.ACTION, Genre.ADVENTURE, Genre.RPG, Genre.FANTASY));
        Atomic_Heart.setTrailer("https://www.youtube.com/embed/_tEgeZrOOHM");
        Atomic_Heart.setScreenshots(List.of("https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-1.jpg?v=1663602384",
                "https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-2.jpg?v=1663602384",
                "https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-3.jpg?v=1663602384",
                "https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-4.jpg?v=1663602384",
                "https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-5.jpg?v=1663602384")

        );
        Atomic_Heart.setAboutTheGame("Welcome to a utopian world of wonders and perfection, in which humans live in harmony with their loyal and fervent robots. Well, that's how it used to be. With the launch of the latest robot-control system mere days away, only a tragic accident or a global conspiracy could disrupt it… The unstoppable course of technology along with secret experiments have brought rise to mutant creatures.");
        Atomic_Heart.setSystemRequirements(List.of("OS: Windows 7 64-bit",
                "Processor: Intel Core i5-2500K or AMD FX-6300",
                "Memory: 8 GB RAM",
                "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260X",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage: 90 GB available space"));


        Game Monster_Hunter_Rise = new Game();
        Monster_Hunter_Rise.setTitle("Monster Hunter Rise");
        Monster_Hunter_Rise.setBackgroundImg("https://s3.gaming-cdn.com/img/products/7893/pcover/7893.jpg?v=1666607273");
        Monster_Hunter_Rise.setGameImg("https://www.instant-gaming.com/images/products/7893/616x353/7893.jpg?v=1666607273");
        Monster_Hunter_Rise.setShortVideoPath("https://www.instant-gaming.com/videos/products/7893/800x450/monster-hunter-rise-pc-game-steam-preview.webm?v=1666185577");
        Monster_Hunter_Rise.setFullPrice("40€");
        Monster_Hunter_Rise.setDiscountedPrice(13.07);
        Monster_Hunter_Rise.setPercentageDiscount("-67%");
        Monster_Hunter_Rise.setDescription("Monster Hunter Rise is an action role-playing game developed and published by Capcom. It is the fifth mainline entry in the Monster Hunter series, and the first to be released for the Nintendo Switch.");
        Monster_Hunter_Rise.setReleaseDate(LocalDate.of(2021, 3, 26));
        Monster_Hunter_Rise.setDeveloper("Capcom");
        Monster_Hunter_Rise.setPublisher("Capcom");
        Monster_Hunter_Rise.setPlatform("Steam");
        Monster_Hunter_Rise.setGenres(List.of(Genre.ACTION, Genre.MULTIPLAYER, Genre.RPG, Genre.FANTASY));
        Monster_Hunter_Rise.setTrailer("https://www.youtube.com/embed/TdCec2GRg-w");
        Monster_Hunter_Rise.setScreenshots(List.of("https://gaming-cdn.com/images/products/7893/screenshot/monster-hunter-rise-pc-game-steam-wallpaper-1.jpg?v=1666607273",
                "https://gaming-cdn.com/images/products/7893/screenshot/monster-hunter-rise-pc-game-steam-wallpaper-2.jpg?v=1666607273",
                "https://gaming-cdn.com/images/products/7893/screenshot/monster-hunter-rise-pc-game-steam-wallpaper-3.jpg?v=1666607273",
                "https://gaming-cdn.com/images/products/7893/screenshot/monster-hunter-rise-pc-game-steam-wallpaper-4.jpg?v=1666607273",
                "https://gaming-cdn.com/images/products/7893/screenshot/monster-hunter-rise-pc-game-steam-wallpaper-5.jpg?v=1666607273")

        );
        Monster_Hunter_Rise.setAboutTheGame("The story begins with your graduation from the Monster Hunter academy. You are immediately taken to Kamura Village and filled in on the back story, which is that there has not been a monster outbreak or attack for about fifty years in the Village. But the signs are ominous that a ‘Rampage’ is about to occur, so you and your fellow hunters must prepare as best you can – with some help from the old hands, of course.");
        Monster_Hunter_Rise.setSystemRequirements(List.of("OS: Windows 7 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
                "Processor: Intel Core i5-2500K or AMD FX-6300",
                "Memory: 8 GB RAM",
                "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260x with 2GB Video RAM",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage: 30 GB available space",
                "Additional Notes: 720p @ 30fps"));


        Game Monster_Hunter_World = new Game();
        Monster_Hunter_World.setTitle("Monster Hunter World");
        Monster_Hunter_World.setBackgroundImg("https://s2.gaming-cdn.com/img/products/2155/pcover/2155.jpg?v=1650371419");
        Monster_Hunter_World.setGameImg("https://www.instant-gaming.com/images/products/5858/616x353/5858.jpg?v=1651505652");
        Monster_Hunter_World.setShortVideoPath("https://www.instant-gaming.com/videos/products/5858/800x450/monster-hunter-world-pc-game-steam-preview.webm?v=1657033336");
        Monster_Hunter_World.setFullPrice("30€");
        Monster_Hunter_World.setDiscountedPrice(10.72);
        Monster_Hunter_World.setPercentageDiscount("-64%");
        Monster_Hunter_World.setDescription("Welcome to a new world! Take on the role of a hunter and slay ferocious monsters in a living, breathing ecosystem where you can use the landscape and its diverse inhabitants to get the upper hand. Hunt alone or in co-op with up to three other players, and use materials collected from fallen foes to craft new gear and take on even bigger, badder beasts!");
        Monster_Hunter_World.setReleaseDate(LocalDate.of(2018, 1, 26));
        Monster_Hunter_World.setDeveloper("Capcom");
        Monster_Hunter_World.setPublisher("Capcom");
        Monster_Hunter_World.setPlatform("Steam");
        Monster_Hunter_World.setGenres(List.of(Genre.ACTION, Genre.MULTIPLAYER, Genre.RPG, Genre.FANTASY));
        Monster_Hunter_World.setTrailer("https://www.youtube.com/embed/Ro6r15wzp2o");
        Monster_Hunter_World.setScreenshots(List.of("https://s1.gaming-cdn.com/images/products/5858/screenshot/monster-hunter-world-pc-game-steam-wallpaper-1.jpg?v=1651505652",
                "https://s1.gaming-cdn.com/images/products/5858/screenshot/monster-hunter-world-pc-game-steam-wallpaper-2.jpg?v=1651505652",
                "https://s1.gaming-cdn.com/images/products/5858/screenshot/monster-hunter-world-pc-game-steam-wallpaper-3.jpg?v=1651505652",
                "https://s1.gaming-cdn.com/images/products/5858/screenshot/monster-hunter-world-pc-game-steam-wallpaper-4.jpg?v=1651505652",
                "https://s1.gaming-cdn.com/images/products/5858/screenshot/monster-hunter-world-pc-game-steam-wallpaper-5.jpg?v=1651505652")

        );
        Monster_Hunter_World.setAboutTheGame("As a hunter, you'll take on quests to hunt monsters in a variety of habitats.\n" +
                "Take down these monsters and receive materials that you can use to create stronger weapons and armor in order to hunt even more dangerous monsters.\n");
        Monster_Hunter_World.setSystemRequirements(List.of("OS: Windows 7 SP1 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
                "Processor: Intel Core i5-4460, 2.70GHz or AMD FX-6300 or better",
                "Memory: 8 GB RAM",
                "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260x with 2GB Video RAM",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage: 52 GB available space"));


        Game Alan_Wake = new Game();
        Alan_Wake.setTitle("Alan Wake");
        Alan_Wake.setBackgroundImg("https://gaming-cdn.com/img/products/11051/pcover/1920x620/11051.jpg?v=1697553204");
        Alan_Wake.setGameImg("https://www.instant-gaming.com/images/products/11051/616x353/11051.jpg?v=1697553204");
        Alan_Wake.setShortVideoPath("https://gaming-cdn.com/videos/products/7493/800x450/alan-wake-2-pc-game-preview.webm?v=1698310922");
        Alan_Wake.setFullPrice("12€");
        Alan_Wake.setDiscountedPrice(2.04);
        Alan_Wake.setPercentageDiscount("-84%");
        Alan_Wake.setDescription("When the wife of the best-selling writer Alan Wake disappears on their vacation, his search turns up pages from a thriller he doesn’t even remember writing. A Dark Presence stalks the small town of Bright Falls, pushing Wake to the brink of sanity in his fight to unravel the mystery and save his love.");
        Alan_Wake.setReleaseDate(LocalDate.of(2012, 2, 16));
        Alan_Wake.setDeveloper("Remedy Entertainment");
        Alan_Wake.setPublisher("Remedy Entertainment");
        Alan_Wake.setPlatform("Steam");
        Alan_Wake.setGenres(List.of(Genre.HORROR, Genre.ADVENTURE, Genre.SINGLEPLAYER));
        Alan_Wake.setTrailer("https://www.youtube.com/embed/sSB4QcQMm6E?si=6n_JrOAj4-ATF787");
        Alan_Wake.setScreenshots(List.of("https://gaming-cdn.com/images/products/57/screenshot/alan-wake-pc-game-steam-europe-wallpaper-1.jpg?v=1662712133",
                "https://gaming-cdn.com/images/products/57/screenshot/alan-wake-pc-game-steam-europe-wallpaper-2.jpg?v=1662712133",
                "https://gaming-cdn.com/images/products/57/screenshot/alan-wake-pc-game-steam-europe-wallpaper-3.jpg?v=1662712133",
                "https://gaming-cdn.com/images/products/57/screenshot/alan-wake-pc-game-steam-europe-wallpaper-4.jpg?v=1662712133",
                "https://gaming-cdn.com/images/products/57/screenshot/alan-wake-pc-game-steam-europe-wallpaper-5.jpg?v=1662712133")

        );
        Alan_Wake.setAboutTheGame("Presented in the style of a TV series, Alan Wake features the trademark Remedy storytelling and pulse-pounding action sequences. As players dive deeper and deeper into the mystery, they’ll face overwhelming odds, plot twists, and cliffhangers. It’s only by mastering the Fight With Light combat mechanic that they can stay one step ahead of the darkness that spreads across Bright Falls.");
        Alan_Wake.setSystemRequirements(List.of("OS *:Windows XP SP2",
                "Processor:Dual Core 2GHz Intel or 2.8GHz AMD",
                "Memory:2 GB RAM",
                "Graphics:DirectX 10 compatible with 512MB RAM",
                "DirectX:9.0c",
                "Hard Drive:8 GB HD space",
                "Sound:DirectX 9.0c compatible"));


        Game Alan_Wake_2 = new Game();
        Alan_Wake_2.setTitle("Alan Wake 2");
        Alan_Wake_2.setBackgroundImg("https://gaming-cdn.com/img/products/11051/pcover/1920x620/11051.jpg?v=1697553204");
        Alan_Wake_2.setGameImg("https://gaming-cdn.com/images/products/7493/616x353/alan-wake-2-pc-game-cover.jpg?v=1701276070");
        Alan_Wake_2.setShortVideoPath("https://gaming-cdn.com/videos/products/7493/800x450/alan-wake-2-pc-game-preview.webm?v=1698310922");
        Alan_Wake_2.setFullPrice("50€");
        Alan_Wake_2.setDiscountedPrice(39.99);
        Alan_Wake_2.setPercentageDiscount("-20%");
        Alan_Wake_2.setDescription("Alan Wake 2 for PC is a survival horror action-adventure game, the sequel to the first game of the same name. This sequel has taken a staggering thirteen years, the original having been produced in 2010. Like the first game, this one is played from a third person perspective and, uniquely, has some detective elements to it.");
        Alan_Wake_2.setReleaseDate(LocalDate.of(2023, 10, 27));
        Alan_Wake_2.setDeveloper("Remedy Entertainment");
        Alan_Wake_2.setPublisher("Epic Games");
        Alan_Wake_2.setPlatform("Steam");
        Alan_Wake_2.setGenres(List.of(Genre.HORROR, Genre.ADVENTURE, Genre.SINGLEPLAYER));
        Alan_Wake_2.setTrailer("https://www.youtube.com/embed/MEWgOlTIW4Y?si=TkaEb_nDIrqI61_M");
        Alan_Wake_2.setScreenshots(List.of("https://gaming-cdn.com/images/products/7493/screenshot/alan-wake-2-pc-game-wallpaper-1.jpg?v=1701276070",
                "https://gaming-cdn.com/images/products/7493/screenshot/alan-wake-2-pc-game-wallpaper-2.jpg?v=1701276070",
                "https://gaming-cdn.com/images/products/7493/screenshot/alan-wake-2-pc-game-wallpaper-3.jpg?v=1701276070",
                "https://gaming-cdn.com/images/products/7493/screenshot/alan-wake-2-pc-game-wallpaper-4.jpg?v=1701276070",
                "https://gaming-cdn.com/images/products/7493/screenshot/alan-wake-2-pc-game-wallpaper-5.jpg?v=1701276070")

        );
        Alan_Wake_2.setAboutTheGame("Thirteen years after bestselling thriller writer Alan Wake vanishes in mysterious circumstances, a string of creepy murders has occurred in Bright Falls, Washington. An newish FBI agent is sent to Bright Falls to investigate the killings, but soon she finds herself tangled in a supernatural horror story written by Wake as he tries to escape from his otherworldly captivity.");
        Alan_Wake_2.setSystemRequirements(List.of("OS: Windows 7 64-bit",
                "Processor: Intel Core i5-2500K or AMD FX-6300",
                "Memory: 8 GB RAM",
                "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260X",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage: 90 GB available space"));


        Game Sea_of_Thieves = new Game();
        Sea_of_Thieves.setTitle("Sea of Thieves 2024 Edition");
        Sea_of_Thieves.setBackgroundImg("https://gaming-cdn.com/img/products/967/pcover/1920x620/967.jpg?v=1718271152");
        Sea_of_Thieves.setGameImg("https://www.instant-gaming.com/images/products/11555/616x353/11555.jpg?v=1716279083");
        Sea_of_Thieves.setShortVideoPath("https://www.instant-gaming.com/videos/products/11555/800x450/sea-of-thieves-2024-edition-pc-xbox-one-xbox-series-x-s-2023-edition-xbox-one-pc-xbox-series-x-s-game-microsoft-store-europe-preview.webm?v=1657031159");
        Sea_of_Thieves.setFullPrice("40€");
        Sea_of_Thieves.setDiscountedPrice(27.47);
        Sea_of_Thieves.setPercentageDiscount("-31%");
        Sea_of_Thieves.setDescription("Sea of Thieves offers the essential pirate experience, from sailing and fighting to exploring and looting – everything you need to live the pirate life and become a legend in your own right. With no set roles, you have complete freedom to approach the world, and other players, however you choose.");
        Sea_of_Thieves.setReleaseDate(LocalDate.of(2020, 6, 3));
        Sea_of_Thieves.setDeveloper("Rare Ltd");
        Sea_of_Thieves.setPublisher("Xbox Game Studios");
        Sea_of_Thieves.setPlatform("Steam");
        Sea_of_Thieves.setGenres(List.of(Genre.FANTASY, Genre.ADVENTURE, Genre.MULTIPLAYER));
        Sea_of_Thieves.setTrailer("https://www.youtube.com/embed/xKLpWOEEUxc?si=5v-kHJ9fIpz3GucE");
        Sea_of_Thieves.setScreenshots(List.of("https://gaming-cdn.com/images/products/11555/screenshot/sea-of-thieves-2024-edition-pc-xbox-one-xbox-series-x-s-2023-edition-xbox-one-pc-xbox-series-x-s-game-microsoft-store-europe-wallpaper-1.jpg?v=1716279083",
                "https://gaming-cdn.com/images/products/11555/screenshot/sea-of-thieves-2024-edition-pc-xbox-one-xbox-series-x-s-2023-edition-xbox-one-pc-xbox-series-x-s-game-microsoft-store-europe-wallpaper-2.jpg?v=1716279083",
                "https://gaming-cdn.com/images/products/11555/screenshot/sea-of-thieves-2024-edition-pc-xbox-one-xbox-series-x-s-2023-edition-xbox-one-pc-xbox-series-x-s-game-microsoft-store-europe-wallpaper-3.jpg?v=1716279083",
                "https://gaming-cdn.com/images/products/11555/screenshot/sea-of-thieves-2024-edition-pc-xbox-one-xbox-series-x-s-2023-edition-xbox-one-pc-xbox-series-x-s-game-microsoft-store-europe-wallpaper-4.jpg?v=1716279083",
                "https://gaming-cdn.com/images/products/11555/screenshot/sea-of-thieves-2024-edition-pc-xbox-one-xbox-series-x-s-2023-edition-xbox-one-pc-xbox-series-x-s-game-microsoft-store-europe-wallpaper-5.jpg?v=1716279083")

        );
        Sea_of_Thieves.setAboutTheGame("Explore a vast open world filled with unspoiled islands and underwater kingdoms. Take on quests to hunt for lost loot, forge a reputation with the Trading Companies and battle foes from Phantoms and Ocean Crawlers to Megalodons and the mighty Kraken. Try your hand at fishing, make maps to your own buried treasure or choose from hundreds of other optional goals and side-quests!");
        Sea_of_Thieves.setSystemRequirements(List.of("OS:Windows 10",
                "Processor:Intel Core i7-4790K or AMD Ryzen 5 1500X",
                "Memory:8 GB RAM",
                "Graphics:NVIDIA GeForce GTX 1050 Ti or AMD Radeon RX 470",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage:100 GB available space"));


        Game No_Mans_Sky = new Game();
        No_Mans_Sky.setTitle("No Man's Sky");
        No_Mans_Sky.setBackgroundImg("https://gaming-cdn.com/img/products/414/pcover/1920x620/414.jpg?v=1721211784");
        No_Mans_Sky.setGameImg("https://www.instant-gaming.com/images/products/414/616x353/414.jpg?v=1721211784");
        No_Mans_Sky.setShortVideoPath("https://www.instant-gaming.com/videos/products/414/800x450/no-man-s-sky-pc-mac-game-steam-preview.webm?v=1657027955");
        No_Mans_Sky.setFullPrice("50€");
        No_Mans_Sky.setDiscountedPrice(17.70);
        No_Mans_Sky.setPercentageDiscount("-70%");
        No_Mans_Sky.setDescription("No Man’s Sky for PC is an action-adventure survival game in which the player takes the form of a crash-landed alien humanoid who is supplied with the basics of what he or she needs to survive and even thrive. Equipped with a multi-tool, the player can follow the on-screen advice from an entity named Atlas.");
        No_Mans_Sky.setReleaseDate(LocalDate.of(2016, 8, 12));
        No_Mans_Sky.setDeveloper("Hello Games");
        No_Mans_Sky.setPublisher("Hello Games");
        No_Mans_Sky.setPlatform("Steam");
        No_Mans_Sky.setGenres(List.of(Genre.ADVENTURE, Genre.ACTION, Genre.MULTIPLAYER));
        No_Mans_Sky.setTrailer("https://www.youtube.com/embed/SsX2hK6yBPU?si=b92sQunLdRGfD7KG");
        No_Mans_Sky.setScreenshots(List.of("https://gaming-cdn.com/images/products/414/screenshot/no-man-s-sky-pc-mac-game-steam-wallpaper-1.jpg?v=1721211784",
                "https://gaming-cdn.com/images/products/414/screenshot/no-man-s-sky-pc-mac-game-steam-wallpaper-2.jpg?v=1721211784",
                "https://gaming-cdn.com/images/products/414/screenshot/no-man-s-sky-pc-mac-game-steam-wallpaper-3.jpg?v=1721211784",
                "https://gaming-cdn.com/images/products/414/screenshot/no-man-s-sky-pc-mac-game-steam-wallpaper-4.jpg?v=1721211784",
                "https://gaming-cdn.com/images/products/414/screenshot/no-man-s-sky-pc-mac-game-steam-wallpaper-5.jpg?v=1721211784")

        );
        No_Mans_Sky.setAboutTheGame("When released in 2016, the game was hailed as something unique and wonderful, though critics complained because many of the promised features were not present. However, the developers have made good on those promises since that first release and those promised features, such as multi player capability, extra building features, etc, are now available.");
        No_Mans_Sky.setSystemRequirements(List.of("OS:Windows 10",
                "Processor:Intel Core i7-4790K or AMD Ryzen 5 1500X",
                "Memory:8 GB RAM",
                "Graphics:NVIDIA GeForce GTX 1050 Ti or AMD Radeon RX 470",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage:100 GB available space"));


        Game Dead_Space = new Game();
        Dead_Space.setTitle("Dead Space");
        Dead_Space.setBackgroundImg("https://gaming-cdn.com/img/products/9094/pcover/1920x620/9094.jpg?v=1705415154");
        Dead_Space.setGameImg("https://gaming-cdn.com/images/products/9094/616x353/dead-space-pc-game-ea-app-cover.jpg?v=1705415154");
        Dead_Space.setShortVideoPath("https://gaming-cdn.com/videos/products/9094/800x450/dead-space-pc-game-ea-app-preview.webm?v=1673528669");
        Dead_Space.setFullPrice("60€");
        Dead_Space.setDiscountedPrice(18.58);
        Dead_Space.setPercentageDiscount("-69%");
        Dead_Space.setDescription("Dead Space for PC is a remake of the 2008 original horror survival video game of the same name, which was followed by sequels: Dead Space 2 (2011) and Dead Space 3 (2013) and a spin-off ‘universe’ called Dead Space Franchise which included more games, films and graphic novels/ comic books.");
        Dead_Space.setReleaseDate(LocalDate.of(2023, 1, 27));
        Dead_Space.setDeveloper("MOTIVE");
        Dead_Space.setPublisher("Electronic Arts");
        Dead_Space.setPlatform("Steam");
        Dead_Space.setGenres(List.of(Genre.HORROR, Genre.ACTION, Genre.SINGLEPLAYER));
        Dead_Space.setTrailer("https://www.youtube.com/embed/2f7sJyIDU-Q?si=KtdH10LC5ot64JPC");
        Dead_Space.setScreenshots(List.of("https://gaming-cdn.com/images/products/9094/screenshot/dead-space-pc-game-ea-app-wallpaper-1.jpg?v=1705415154",
                "https://gaming-cdn.com/images/products/9094/screenshot/dead-space-pc-game-ea-app-wallpaper-2.jpg?v=1705415154",
                "https://gaming-cdn.com/images/products/9094/screenshot/dead-space-pc-game-ea-app-wallpaper-3.jpg?v=1705415154",
                "https://gaming-cdn.com/images/products/9094/screenshot/dead-space-pc-game-ea-app-wallpaper-4.jpg?v=1705415154",
                "https://gaming-cdn.com/images/products/9094/screenshot/dead-space-pc-game-ea-app-wallpaper-5.jpg?v=1705415154")

        );
        Dead_Space.setAboutTheGame("Set in the year 2508, a dystopian space age future in which the Earth’s resources have been plundered, forcing widespread exploration through the galaxy. Planetcrackers, mining ships that plunder barren planets for their resources, are everywhere and the oldest of these, Ishimura, is illegally mining the planet Aegis VII, which is otherwise lightly populated with colonists.\n" +
                "Meanwhile, some time ago, back on Earth, an alien artefact called the Marker was found and has formed the basis of a new religion, Unitology, under the leadership of Michael Altman – one of the original researchers on the Marker. Later, Aegis VII is found to have a replica of the Marker, this one called the Red Marker, created by Earth Government (who were responsible for the creation and concealment of several Red Markers on various planets.\n" +
                "Unitologists and Earth Government officials form two warring factions in the game. However, experiments in weaponizing the Marker – and its copies – has resulted in what is essentially a zombie army – an infection that turns corpses into undead beings known as Necromorphs – and they begin to emerge just as the colonists and Ishimura crew begin to suffer mental health issues and hallucinations.\n" +
                "Arriving on schedule a while later, the maintenance ship, Kellion arrives to find that most people – all colonists and many Ishimura crew have been turned into Necromorphs. The protagonist is Isaac Clarke whose girlfriend, Nicole Brennan, was the medical officer on the Ishimura and he is frantic to find out what has happened to her.");
        Dead_Space.setSystemRequirements(List.of("OS:Windows 10",
                "Processor:Intel Core i7-4790K or AMD Ryzen 5 1500X",
                "Memory:8 GB RAM",
                "Graphics:NVIDIA GeForce GTX 1050 Ti or AMD Radeon RX 470",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage:100 GB available space"));


        Game Baldurs_Gate_3 = new Game();
        Baldurs_Gate_3.setTitle("Baldur's Gate 3");
        Baldurs_Gate_3.setBackgroundImg("https://gaming-cdn.com/img/products/4804/pcover/1920x620/4804.jpg?v=1710239606");
        Baldurs_Gate_3.setGameImg("https://www.instant-gaming.com/images/products/4804/616x353/4804.jpg?v=1710239606");
        Baldurs_Gate_3.setShortVideoPath("https://www.instant-gaming.com/videos/products/4804/800x450/baldur-s-gate-3-pc-game-gog-com-preview.webm?v=1677240334");
        Baldurs_Gate_3.setFullPrice("60€");
        Baldurs_Gate_3.setDiscountedPrice(53.39);
        Baldurs_Gate_3.setPercentageDiscount("-11%");
        Baldurs_Gate_3.setDescription("Baldur’s Gate III for PC is an action adventure role playing game, the third in the series, and based, like the others in the series upon Dungeons and Dragons, the cult 80s boardgame that has recently seen a resurgence both online and in-person. You can play alone, or multiplayer in the co-op mode, enjoying the well-rendered characters and amazing graphics that have take a lot of excellent inspiration from the fifth (current) edition of the books.");
        Baldurs_Gate_3.setReleaseDate(LocalDate.of(2023, 8, 3));
        Baldurs_Gate_3.setDeveloper("Larian Studios");
        Baldurs_Gate_3.setPublisher("Larian Studios");
        Baldurs_Gate_3.setPlatform("Steam");
        Baldurs_Gate_3.setGenres(List.of(Genre.RPG, Genre.ADVENTURE, Genre.STRATEGY));
        Baldurs_Gate_3.setTrailer("https://www.youtube.com/embed/OcP0WdH7rTs?si=BrKi8K5vMJYc3ZH9");
        Baldurs_Gate_3.setScreenshots(List.of("https://gaming-cdn.com/images/products/4804/screenshot/baldur-s-gate-3-pc-game-gog-com-wallpaper-1.jpg?v=1710239606",
                "https://gaming-cdn.com/images/products/4804/screenshot/baldur-s-gate-3-pc-game-gog-com-wallpaper-2.jpg?v=1710239606",
                "https://gaming-cdn.com/images/products/4804/screenshot/baldur-s-gate-3-pc-game-gog-com-wallpaper-3.jpg?v=1710239606",
                "https://gaming-cdn.com/images/products/4804/screenshot/baldur-s-gate-3-pc-game-gog-com-wallpaper-4.jpg?v=1710239606",
                "https://gaming-cdn.com/images/products/4804/screenshot/baldur-s-gate-3-pc-game-gog-com-wallpaper-5.jpg?v=1710239606")

        );
        Baldurs_Gate_3.setAboutTheGame("Explore the world thoroughly, and one advantage of having your odd-ball companions is that collectively they have all – or very nearly all – the answers to any questions you might have. For example, should you pick a mushroom, wondering if it is edible, one of your companions will know the difference between the tasty and the fatal!");
        Baldurs_Gate_3.setSystemRequirements(List.of("OS:Windows 10",
                "Processor:Intel I5 4690 / AMD FX 8350",
                "Memory:8 GB RAM",
                "Graphics:Nvidia GTX 970 / RX 480 (4GB+ of VRAM)",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage:150 GB available space"));


        Game Minecraft = new Game();
        Minecraft.setTitle("Minecraft");
        Minecraft.setBackgroundImg("https://gaming-cdn.com/img/products/442/pcover/1920x620/442.jpg?v=1716387513");
        Minecraft.setGameImg("https://gaming-cdn.com/images/products/442/616x353/minecraft-java-and-bedrock-edition-java-and-bedrock-edition-pc-game-cover.jpg?v=1716387513");
        Minecraft.setShortVideoPath("https://gaming-cdn.com/videos/products/442/800x450/minecraft-java-and-bedrock-edition-java-and-bedrock-edition-pc-game-preview.webm?v=1657026831");
        Minecraft.setFullPrice("30€");
        Minecraft.setDiscountedPrice(12.58);
        Minecraft.setPercentageDiscount("-58%");
        Minecraft.setDescription("Minecraft for PC is the best-selling video game of all time. That alone should be enough to sell you on it, but here’s a bit more information about why you should start playing right now. It is a sandbox game in which players must mine, build, and craft to create their own ideal world.");
        Minecraft.setReleaseDate(LocalDate.of(2011, 11, 19));
        Minecraft.setDeveloper("Mojang Studios");
        Minecraft.setPublisher("Xbox Game Studios");
        Minecraft.setPlatform("Steam");
        Minecraft.setGenres(List.of(Genre.MULTIPLAYER, Genre.RPG, Genre.STRATEGY));
        Minecraft.setTrailer("https://www.youtube.com/embed/MmB9b5njVbA?si=2qmTTD0DJYldV-SJ");
        Minecraft.setScreenshots(List.of("https://gaming-cdn.com/images/products/442/screenshot/minecraft-java-and-bedrock-edition-java-and-bedrock-edition-pc-game-wallpaper-1.jpg?v=1716387513",
                "https://gaming-cdn.com/images/products/442/screenshot/minecraft-java-and-bedrock-edition-java-and-bedrock-edition-pc-game-wallpaper-2.jpg?v=1716387513",
                "https://gaming-cdn.com/images/products/442/screenshot/minecraft-java-and-bedrock-edition-java-and-bedrock-edition-pc-game-wallpaper-3.jpg?v=1716387513",
                "https://gaming-cdn.com/images/products/442/screenshot/minecraft-java-and-bedrock-edition-java-and-bedrock-edition-pc-game-wallpaper-4.jpg?v=1716387513",
                "https://gaming-cdn.com/images/products/442/screenshot/minecraft-java-and-bedrock-edition-java-and-bedrock-edition-pc-game-wallpaper-5.jpg?v=1716387513")

        );
        Minecraft.setAboutTheGame("The premise of the game is laughably simple: you arrive in the game with nothing more than your hands and a limited inventory. You mine to gather materials which you then use to make tools and build houses and other buildings.");
        Minecraft.setSystemRequirements(List.of("OS:Windows 10",
                "Pentium 4 1.6GHz / Athlon XP 1600+",
                "Memory:500 MB",
                "Graphics:GeForce 4 MX 440 / Radeon HD 3200",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage:1 GB"));


        Game Terraria = new Game();
        Terraria.setTitle("Terraria");
        Terraria.setBackgroundImg("https://gaming-cdn.com/img/products/932/pcover/1920x620/932.jpg?v=1683791474");
        Terraria.setGameImg("https://www.instant-gaming.com/images/products/932/616x353/932.jpg?v=1683791474");
        Terraria.setShortVideoPath("https://www.instant-gaming.com/videos/products/932/800x450/terraria-pc-mac-game-steam-preview.webm?v=1657041780");
        Terraria.setFullPrice("10€");
        Terraria.setDiscountedPrice(6.69);
        Terraria.setPercentageDiscount("-31%");
        Terraria.setDescription("Terraria for PC is a 2D exploration sand box game in which the player seeks to lay out the world according to their own choices – and their skills at combat, crafting and resource gathering too!");
        Terraria.setReleaseDate(LocalDate.of(2011, 5, 16));
        Terraria.setDeveloper("Re-Logic");
        Terraria.setPublisher("Re-Logic");
        Terraria.setPlatform("Steam");
        Terraria.setGenres(List.of(Genre.RPG, Genre.MULTIPLAYER, Genre.ADVENTURE));
        Terraria.setTrailer("https://www.youtube.com/embed/H77Zfzy4LWw?si=eQUP8RX1I_B4yjME");
        Terraria.setScreenshots(List.of("https://gaming-cdn.com/images/products/932/screenshot/terraria-pc-mac-game-steam-wallpaper-1.jpg?v=1683791474",
                "https://gaming-cdn.com/images/products/932/screenshot/terraria-pc-mac-game-steam-wallpaper-2.jpg?v=1683791474",
                "https://gaming-cdn.com/images/products/932/screenshot/terraria-pc-mac-game-steam-wallpaper-3.jpg?v=1683791474",
                "https://gaming-cdn.com/images/products/932/screenshot/terraria-pc-mac-game-steam-wallpaper-4.jpg?v=1683791474",
                "https://gaming-cdn.com/images/products/932/screenshot/terraria-pc-mac-game-steam-wallpaper-5.jpg?v=1683791474")

        );
        Terraria.setAboutTheGame("Create a character and enter the world – beware nightfall and the arrival of the zombies, so your first task will almost always be building yourself some kind of shelter. It does get genuinely dark at night in the game, so make sure you remember to find, buy or create some kind of light source.\n" +
                "\n" +
                "Much of your time will be spent underground – after you’ve found your way into the underworld through one of the sparse entry points in the game – mining for the iron/ lead and tin/ copper as well as the loot (the latter from the chests you will stumble across, randomly situated within the game) which can be crafted into more tools, better products and more sophisticated items with which to build even more advanced buildings, machines etc.\n");
        Terraria.setSystemRequirements(List.of("OS:Windows 10",
                "Pentium 4 1.6GHz / Athlon XP 1600+",
                "Memory:500 MB",
                "Graphics:GeForce 4 MX 440 / Radeon HD 3200",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage:1 GB"));


        Game Final_Fantasy_XIV = new Game();
        Final_Fantasy_XIV.setTitle("Final Fantasy XIV: Dawntrail");
        Final_Fantasy_XIV.setBackgroundImg("https://gaming-cdn.com/img/products/216/pcover/1920x620/216.jpg?v=1719952982");
        Final_Fantasy_XIV.setGameImg("https://www.instant-gaming.com/images/products/16518/616x353/16518.jpg?v=1719997293");
        Final_Fantasy_XIV.setShortVideoPath("https://www.instant-gaming.com/videos/products/16518/800x450/final-fantasy-xiv-dawntrail-collector-s-edition-collector-s-edition-pc-game-europe-preview.webm?v=1711617536");
        Final_Fantasy_XIV.setFullPrice("50€");
        Final_Fantasy_XIV.setDiscountedPrice(38.49);
        Final_Fantasy_XIV.setPercentageDiscount("-23%");
        Final_Fantasy_XIV.setDescription("Blue seas, clear skies, and boundless possibilities await in Dawntrail, the newest expansion pack for the critically acclaimed FINAL FANTASY XIV Online! Explore uncharted territories with familiar faces as you discover new tribes, confront formidable threats, and expand your horizons as hope's light dawns once more.");
        Final_Fantasy_XIV.setReleaseDate(LocalDate.of(2024, 7, 2));
        Final_Fantasy_XIV.setDeveloper("Square Enix");
        Final_Fantasy_XIV.setPublisher("Square Enix");
        Final_Fantasy_XIV.setPlatform("Steam");
        Final_Fantasy_XIV.setGenres(List.of(Genre.MULTIPLAYER, Genre.RPG, Genre.ADVENTURE));
        Final_Fantasy_XIV.setTrailer("https://www.youtube.com/embed/7BghYTigv8E?si=TP0mfG9DQHm1Ps2f");
        Final_Fantasy_XIV.setScreenshots(List.of("https://gaming-cdn.com/images/products/16518/screenshot/final-fantasy-xiv-dawntrail-collector-s-edition-collector-s-edition-pc-game-europe-wallpaper-1.jpg?v=1719997293",
                "https://gaming-cdn.com/images/products/16518/screenshot/final-fantasy-xiv-dawntrail-collector-s-edition-collector-s-edition-pc-game-europe-wallpaper-2.jpg?v=1719997293",
                "https://gaming-cdn.com/images/products/16518/screenshot/final-fantasy-xiv-dawntrail-collector-s-edition-collector-s-edition-pc-game-europe-wallpaper-2.jpg?v=1719997293",
                "https://gaming-cdn.com/images/products/16518/screenshot/final-fantasy-xiv-dawntrail-collector-s-edition-collector-s-edition-pc-game-europe-wallpaper-4.jpg?v=1719997293",
                "https://gaming-cdn.com/images/products/16518/screenshot/final-fantasy-xiv-dawntrail-collector-s-edition-collector-s-edition-pc-game-europe-wallpaper-5.jpg?v=1719997293")

        );
        Final_Fantasy_XIV.setAboutTheGame("Blue seas, clear skies, and boundless possibilities await in Dawntrail, the newest expansion pack for the critically acclaimed FINAL FANTASY XIV Online! Explore uncharted territories with familiar faces as you discover new tribes, confront formidable threats, and expand your horizons as hope's light dawns once more.");
        Final_Fantasy_XIV.setSystemRequirements(List.of("OS:Windows 10",
                "Processor:Intel Core i7-4790K or AMD Ryzen 5 1500X",
                "Memory:8 GB RAM",
                "Graphics:NVIDIA GeForce GTX 1050 Ti or AMD Radeon RX 470",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage:100 GB available space"));


        Game Remnant_2 = new Game();
        Remnant_2.setTitle("Remnant 2");
        Remnant_2.setBackgroundImg("https://gaming-cdn.com/img/products/13288/pcover/1920x620/13288.jpg?v=1696579119");
        Remnant_2.setGameImg("https://www.instant-gaming.com/images/products/13288/616x353/13288.jpg?v=1696579119");
        Remnant_2.setShortVideoPath("https://www.instant-gaming.com/videos/products/13288/800x450/remnant-2-pc-game-steam-preview.webm?v=1681902180");
        Remnant_2.setFullPrice("50€");
        Remnant_2.setDiscountedPrice(17.45);
        Remnant_2.setPercentageDiscount("-65%");
        Remnant_2.setDescription("Remnant II is the sequel to the best-selling game Remnant: From the Ashes that pits survivors of humanity against new deadly creatures and god-like bosses across terrifying worlds. Play solo or co-op with two other friends to explore the depths of the unknown to stop an evil from destroying reality itself. To succeed, players will need to rely on their own skills and those of their team to overcome the toughest challenges and to stave off humanity’s extinction.");
        Remnant_2.setReleaseDate(LocalDate.of(2023, 7, 25));
        Remnant_2.setDeveloper("Gunfire Games");
        Remnant_2.setPublisher("Gearbox Publishing");
        Remnant_2.setPlatform("Steam");
        Remnant_2.setGenres(List.of(Genre.RPG, Genre.FANTASY, Genre.ADVENTURE));
        Remnant_2.setTrailer("https://www.youtube.com/embed/zU6_2QnhP3U?si=rFqv6jsMql_wqM_e");
        Remnant_2.setScreenshots(List.of("https://gaming-cdn.com/images/products/13288/screenshot/remnant-2-pc-game-steam-wallpaper-1.jpg?v=1696579119",
                "https://gaming-cdn.com/images/products/13288/screenshot/remnant-2-pc-game-steam-wallpaper-2.jpg?v=1696579119",
                "https://gaming-cdn.com/images/products/13288/screenshot/remnant-2-pc-game-steam-wallpaper-3.jpg?v=1696579119",
                "https://gaming-cdn.com/images/products/13288/screenshot/remnant-2-pc-game-steam-wallpaper-4.jpg?v=1696579119",
                "https://gaming-cdn.com/images/products/13288/screenshot/remnant-2-pc-game-steam-wallpaper-5.jpg?v=1696579119")

        );
        Remnant_2.setAboutTheGame("A mix of methodical and frenetic ranged/melee combat returns with cunning enemies and large scale boss battles. Choose specific gear and weapons to optimize for the different biomes and battles ahead. Bosses will bring high-level players to team up to overcome the challenge and try to obtain the biggest rewards. Players can travel alone or with friends as a team through strange new worlds and beyond, overrun by mythical creatures and deadly foes while trying to stay alive. There are multiple worlds to explore with different types of creatures, weapons, and items. Utilize and upgrade discovered items to take on tougher challenges");
        Remnant_2.setSystemRequirements(List.of("OS:Windows 10",
                "Processor:Intel Core i7-4790K or AMD Ryzen 5 1500X",
                "Memory:8 GB RAM",
                "Graphics:NVIDIA GeForce GTX 1050 Ti or AMD Radeon RX 470",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage:100 GB available space"));


        Game Lunacid = new Game();
        Lunacid.setTitle("Lunacid");
        Lunacid.setBackgroundImg("https://gaming-cdn.com/img/products/15344/pcover/1920x620/15344.jpg?v=1700473159");
        Lunacid.setGameImg("https://www.instant-gaming.com/images/products/15344/616x353/15344.jpg?v=1700473159");
        Lunacid.setShortVideoPath("https://www.instant-gaming.com/videos/products/15344/800x450/lunacid-pc-game-steam-preview.webm?v=1699624112");
        Lunacid.setFullPrice("14€");
        Lunacid.setDiscountedPrice(13.47);
        Lunacid.setPercentageDiscount("-2%");
        Lunacid.setDescription("Lunacid is a first person dungeon crawler inspired by old FROMSOFT games like Shadow Tower and King’s Field.");
        Lunacid.setReleaseDate(LocalDate.of(2023, 10, 31));
        Lunacid.setDeveloper("KIRA LLC");
        Lunacid.setPublisher("KIRA LLC");
        Lunacid.setPlatform("Steam");
        Lunacid.setGenres(List.of(Genre.RPG, Genre.ADVENTURE, Genre.SINGLEPLAYER));
        Lunacid.setTrailer("https://www.youtube.com/embed/k4I-RJvP6mY?si=SlW777O0wvwNqFXo");
        Lunacid.setScreenshots(List.of("https://gaming-cdn.com/images/products/15344/screenshot/lunacid-pc-game-steam-wallpaper-1.jpg?v=1700473159",
                "https://gaming-cdn.com/images/products/15344/screenshot/lunacid-pc-game-steam-wallpaper-2.jpg?v=1700473159",
                "https://gaming-cdn.com/images/products/15344/screenshot/lunacid-pc-game-steam-wallpaper-3.jpg?v=1700473159",
                "https://gaming-cdn.com/images/products/15344/screenshot/lunacid-pc-game-steam-wallpaper-4.jpg?v=1700473159",
                "https://gaming-cdn.com/images/products/15344/screenshot/lunacid-pc-game-steam-wallpaper-5.jpg?v=1700473159")

        );
        Lunacid.setAboutTheGame("Long ago a great beast arose from the sea and covered the earth in a poison fog. Now those deemed undesirable are thrown into a great well, which has become a pit of chaos and disease. You awaken in a moonlit subterranean world, having been thrown into the Great Well for crimes unknown. The only way out is to go further down and confront the sleeping old one below. On the way there will be many creatures and secrets to discover.");
        Lunacid.setSystemRequirements(List.of("OS:Windows 10",
                "Processor:Intel Core i7-4790K or AMD Ryzen 5 1500X",
                "Memory:8 GB RAM",
                "Graphics:NVIDIA GeForce GTX 1050 Ti or AMD Radeon RX 470",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage:100 GB available space"));

        Game Hollow_Knight = new Game();
        Hollow_Knight.setTitle("Hollow Knight");
        Hollow_Knight.setBackgroundImg("https://gaming-cdn.com/img/products/2198/pcover/1920x620/2198.jpg?v=1705490619");
        Hollow_Knight.setGameImg("https://www.instant-gaming.com/images/products/2198/616x353/2198.jpg?v=1705490619");
        Hollow_Knight.setShortVideoPath("https://www.instant-gaming.com/videos/products/2198/800x450/hollow-knight-pc-mac-game-steam-preview.webm?v=1657036179");
        Hollow_Knight.setFullPrice("15€");
        Hollow_Knight.setDiscountedPrice(8.52);
        Hollow_Knight.setPercentageDiscount("-42%");
        Hollow_Knight.setDescription("Beneath the fading town of Dirtmouth sleeps an ancient, ruined kingdom. Many are drawn below the surface, searching for riches, or glory, or answers to old secrets.\n" +
                "Hollow Knight is a classically styled 2D action adventure across a vast interconnected world. Explore twisting caverns, ancient cities and deadly wastes; battle tainted creatures and befriend bizarre bugs; and solve ancient mysteries at the kingdom's heart.");
        Hollow_Knight.setReleaseDate(LocalDate.of(2017, 2, 24));
        Hollow_Knight.setDeveloper("Team Cherry");
        Hollow_Knight.setPublisher("Team Cherry");
        Hollow_Knight.setPlatform("Steam");
        Hollow_Knight.setGenres(List.of(Genre.ACTION, Genre.ADVENTURE, Genre.SINGLEPLAYER));
        Hollow_Knight.setTrailer("https://www.youtube.com/embed/UAO2urG23S4?si=XDXLZvCmExwGU_Nb");
        Hollow_Knight.setScreenshots(List.of("https://gaming-cdn.com/images/products/2198/screenshot/hollow-knight-pc-mac-game-steam-wallpaper-1.jpg?v=1705490619",
                "https://gaming-cdn.com/images/products/2198/screenshot/hollow-knight-pc-mac-game-steam-wallpaper-2.jpg?v=1705490619",
                "https://gaming-cdn.com/images/products/2198/screenshot/hollow-knight-pc-mac-game-steam-wallpaper-3.jpg?v=1705490619",
                "https://gaming-cdn.com/images/products/2198/screenshot/hollow-knight-pc-mac-game-steam-wallpaper-4.jpg?v=1705490619",
                "https://gaming-cdn.com/images/products/2198/screenshot/hollow-knight-pc-mac-game-steam-wallpaper-5.jpg?v=1705490619")

        );
        Hollow_Knight.setAboutTheGame("The world of Hollow Knight is brought to life in vivid, moody detail, its caverns alive with bizarre and terrifying creatures, each animated by hand in a traditional 2D style.\n" +
                "Every new area you’ll discover is beautifully unique and strange, teeming with new creatures and characters. Take in the sights and uncover new wonders hidden off of the beaten path.\n" +
                "\n" +
                "If you like classic gameplay, cute but creepy characters, epic adventure and beautiful, gothic worlds, then Hollow Knight awaits!\n");
        Hollow_Knight.setSystemRequirements(List.of("OS:Windows 10",
                "Processor:Intel Core i7-4790K or AMD Ryzen 5 1500X",
                "Memory:8 GB RAM",
                "Graphics:NVIDIA GeForce GTX 1050 Ti or AMD Radeon RX 470",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage:100 GB available space"));


        Game Stray = new Game();
        Stray.setTitle("Stray");
        Stray.setBackgroundImg("https://gaming-cdn.com/img/products/8260/pcover/1920x620/8260.jpg?v=1720773587");
        Stray.setGameImg("https://www.instant-gaming.com/images/products/8260/616x353/8260.jpg?v=1720773587");
        Stray.setShortVideoPath("https://www.instant-gaming.com/videos/products/8260/800x450/stray-pc-game-steam-europe-and-us-and-canada-preview.webm?v=1657103371");
        Stray.setFullPrice("20€");
        Stray.setDiscountedPrice(17.99);
        Stray.setPercentageDiscount("-36%");
        Stray.setDescription("Stray for PC is an action adventure game in which the player takes on the third person persona of a stray cat who stumbles into a mysterious walled city. The walled city is based on the real Kowloon Walled City in Hong Kong, a now-demolished area that lent itself well to strangeness, mystery and a touch of rebellion – the reason, perhaps, for the real life demolition.");
        Stray.setReleaseDate(LocalDate.of(2022, 7, 19));
        Stray.setDeveloper("BlueTwelve Studio");
        Stray.setPublisher("Annapurna Interactive");
        Stray.setPlatform("Steam");
        Stray.setGenres(List.of(Genre.ADVENTURE, Genre.SINGLEPLAYER));
        Stray.setTrailer("https://www.youtube.com/embed/4uP2MyUL49s?si=zz4_GmLQ9da_Yswi");
        Stray.setScreenshots(List.of("https://gaming-cdn.com/images/products/8260/screenshot/stray-pc-game-steam-europe-and-us-and-canada-wallpaper-1.jpg?v=1720773587",
                "https://gaming-cdn.com/images/products/8260/screenshot/stray-pc-game-steam-europe-and-us-and-canada-wallpaper-2.jpg?v=1720773587",
                "https://gaming-cdn.com/images/products/8260/screenshot/stray-pc-game-steam-europe-and-us-and-canada-wallpaper-3.jpg?v=1720773587",
                "https://gaming-cdn.com/images/products/8260/screenshot/stray-pc-game-steam-europe-and-us-and-canada-wallpaper-4.jpg?v=1720773587",
                "https://gaming-cdn.com/images/products/8260/screenshot/stray-pc-game-steam-europe-and-us-and-canada-wallpaper-5.jpg?v=1720773587")

        );
        Stray.setAboutTheGame("The game’s beginning is the same for all players: you start out above ground, travelling in a group of four other cats (your friends? Your family? Who knows!) and accidentally tumble down into the walled city.\n" +
                "\n" +
                "It doesn’t take long for you to find an apparently derelict laboratory and load up a drone, called B-12 (like the vitamin) with an AI consciousness which explains that it used to help a scientist but has suffered catastrophic memory loss for unknown reasons. The memory loss is something from which it is still slowly recovering. You take the B-12 with you, as he (it?) is useful for a number of reasons (for more about which, see below), tethering him to you with a cute little backpack.");
        Stray.setSystemRequirements(List.of("OS:Windows 10",
                "Processor:Intel Core i7-4790K or AMD Ryzen 5 1500X",
                "Memory:8 GB RAM",
                "Graphics:NVIDIA GeForce GTX 1050 Ti or AMD Radeon RX 470",
                "DirectX: Version 11",
                "Network: Broadband Internet connection",
                "Storage:100 GB available space"));


        gameService.saveGame(Elden_Ring);
        gameService.saveGame(Terraria);
        gameService.saveGame(Final_Fantasy_XIV);
        /*gameService.saveGame(Ghost_of_Tsushima);*/
        gameService.saveGame(God_of_War);
        gameService.saveGame(Cyberpunk_2077);
        gameService.saveGame(The_Witcher_3);
        gameService.saveGame(Skyrim);
        gameService.saveGame(Helldivers_2);
        gameService.saveGame(NBA_2k25);
        gameService.saveGame(FIFA_23);
        gameService.saveGame(Atomic_Heart);
        gameService.saveGame(Monster_Hunter_World);
        gameService.saveGame(Monster_Hunter_Rise);
        gameService.saveGame(Alan_Wake);
        gameService.saveGame(Alan_Wake_2);
        gameService.saveGame(Sea_of_Thieves);
        gameService.saveGame(No_Mans_Sky);
        gameService.saveGame(Dead_Space);
        gameService.saveGame(Baldurs_Gate_3);
        gameService.saveGame(Minecraft);
        gameService.saveGame(Lunacid);
        gameService.saveGame(Remnant_2);
        gameService.saveGame(Hollow_Knight);
        gameService.saveGame(Stray);


    }
}
