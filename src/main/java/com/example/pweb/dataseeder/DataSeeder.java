package com.example.pweb.dataseeder;

import com.example.pweb.entities.*;
import com.example.pweb.repositories.*;
import jakarta.persistence.Column;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {
    private final PlayerRepository playerRepository;
    private final MatchRepository matchRepository;
    private final TeamRepository teamRepository;
    private final EventRepository eventRepository;
    private final LeagueRepository leagueRepository;
    private final RoleRepository roleRepository;


    @Override
    public void run(String... args) throws Exception {
        Role admin = new Role(ERole.ROLE_ADMIN);
        Role user = new Role(ERole.ROLE_USER);
        Role mod = new Role(ERole.ROLE_MODERATOR);
        roleRepository.saveAll(List.of(admin, mod, user));

        Player saka = new Player("Bukayo Saka", "Saka", "England", 29, 12, 10, 5, 0);
        Player haaland = new Player("Erling Haaland", "Haaland", "Norway", 26, 28, 5, 4, 0);
        Player kane = new Player("Harry Kane", "Kane", "England", 29, 22, 2, 5, 0);
        Player rashford = new Player("Marcus Rashford", "Rashford", "England", 28, 15, 3, 2, 0);
        Player toney = new Player("Ivan Toney", "Toney", "England", 27, 17, 4, 9, 0);
        Player martinelli = new Player("Gabriel Martinelli", "Martinelli", "Brazil", 29, 13, 3, 3, 0);
        Player salah = new Player("Mohamed Salah", "Salah", "Egypt", 28, 12, 7, 2, 0);
        Player watkins = new Player("Ollie Watkins", "Watkins", "England", 28, 11, 5, 1, 0);
        Player almiron = new Player("Miguel Almiron", "Almiron", "Paraguay", 25, 11, 1, 2, 0);
        Player foden = new Player("Phil Foden", "Foden", "England", 24, 9, 4, 1, 0);
        Player wilson = new Player("Callum Wilson", "Wilson", "England", 21, 10, 3, 3, 0);
        Player fernandes = new Player("Bruno Fernandes", "Fernandes", "Portugal", 27, 5, 6, 6, 0);
        Player son = new Player("Heung-Min Son", "Son", "South Korea", 27, 6, 4, 1, 0);
        Player macAllister = new Player("Alexis Mac Allister", "Mac Allister", "Argentina", 24, 8, 1, 7, 0);
        Player march = new Player("Solly March", "March", "England", 27, 7, 5, 2, 0);
        Player buendia = new Player("Emiliano Buendia", "Buendia", "Argentina", 29, 5, 1, 0, 0);
        Player firmino = new Player("Roberto Firmino", "Firmino", "Brazil", 21, 8, 4, 0, 0);
        Player jensen = new Player("Mathias Jensen", "Jensen", "Denmark", 29, 5, 5, 3, 0);
        Player mitrovic = new Player("Aleksandar Mitrovic", "Mitrovic", "Serbia", 21, 11, 1, 6, 0);
        Player reid = new Player("Bobby Reid", "Fulham", "Jamaica", 27, 4, 1, 7, 0);
        Player havertz = new Player("Kai Havertz", "Havertz", "Germany", 28, 7, 1, 4, 0);
        Player sterling = new Player("Raheem Sterling", "Sterling", "England", 20, 4, 2, 3, 0);
        Player zaha = new Player("Wilfried Zaha", "Zaha", "Ivory Coast", 24, 6, 2, 4, 0);
        Player eze = new Player("Eberechi Eze", "Eze", "England", 29, 4, 3, 3, 0);
        Player rodrigo = new Player("Rodrigo", "Rodrigo", "Spain", 22, 11, 1, 3, 0);
        Player harrison = new Player("Jack Harrison", "Harrison", "England", 27, 4, 6, 2, 0);
        Player podence = new Player("Daniel Podence", "Podence", "Portugal", 27, 6, 0, 5, 0);
        Player neves = new Player("Ruben Neves", "Neves", "Portugal", 28, 5, 0, 10, 0);
        Player ings = new Player("Danny Ings", "Ings", "England", 27, 8, 0, 3, 0);
        Player benrahma = new Player("Mohamed Said Benrahma", "Benrahma", "Algeria", 26, 4, 3, 0, 0);
        Player gray = new Player("Demarai Gray", "Gray", "England", 27, 4, 1, 2, 0);
        Player mcNeil = new Player("Dwight McNeil", "McNeil", "England", 27, 3, 2, 5, 0);
        Player johnson = new Player("Brennan Johnson", "Johnson", "Wales", 29, 8, 2, 6, 0);
        Player awoniyi = new Player("Taiwo Awoniyi", "Awoniyi", "Nigeria", 18, 4, 0, 0, 0);
        Player billing = new Player("Philip Billing", "Billing", "Denmark", 28, 6, 1, 5, 0);
        Player solanke = new Player("Dominic Solanke", "Solanke", "England", 24, 4, 4, 1, 0);
        Player barnes = new Player("Harvey Barnes", "Barnes", "England", 28, 10, 1, 2, 0);
        Player maddison = new Player("James Maddison", "Maddison", "England", 22, 9, 6, 8, 0);
        Player wardProwse = new Player("James Ward-Prowse", "Ward-Prowse", "England", 29, 7, 2, 5, 0);
        Player adams = new Player("Che Adams", "Adams", "Scotland", 25, 5, 3, 1, 0);

        Team arsenal = new Team("Arsenal", 72, "England", 70, 27);
        Team manCity = new Team("Manchester City", 64, "England", 71, 26);
        Team newcastle = new Team("Newcastle", 53, "England", 46, 20);
        Team manUnited = new Team("Manchester United", 53, "England", 42, 37);
        Team spurs = new Team("Tottenham", 50, "England", 53, 41);
        Team brighton = new Team("Brighton", 46, "England", 51, 34);
        Team astonVilla = new Team("Aston Villa", 44, "England", 39, 40);
        Team liverpool = new Team("Liverpool", 43, "England", 48, 33);
        Team brentford = new Team("Brentford", 43, "England", 46, 38);
        Team fulham = new Team("Fulham", 39, "England", 39, 39);
        Team chelsea = new Team("Chelsea", 39, "England", 29, 30);
        Team crystalPalace = new Team("Crystal Palace", 30, "England", 24, 39);
        Team leeds = new Team("Leeds", 29, "England", 38, 49);
        Team wolves = new Team("Wolves", 28, "England", 23, 42);
        Team westHam = new Team("West Ham", 27, "England", 26, 39);
        Team everton = new Team("Everton", 27, "England", 23, 41);
        Team notts = new Team("Nottingham", 27, "England", 24, 52);
        Team bmouth = new Team("Bournemouth", 27, "England", 27, 57);
        Team leicester = new Team("Leicester", 25, "England", 40, 51);
        Team southampton = new Team("Southampton", 23, "England", 23, 47);

//        manUnited.setPlayerList(List.of(rashford, fernandes));
        rashford.setTeam(manUnited);
        fernandes.setTeam(manUnited);
//        spurs.setPlayerList(List.of(kane, son));
        kane.setTeam(spurs);
        son.setTeam(spurs);
//        liverpool.setPlayerList(List.of(salah, firmino));
        salah.setTeam(liverpool);
        firmino.setTeam(liverpool);
//        chelsea.setPlayerList(List.of(havertz, sterling));
        havertz.setTeam(chelsea);
        sterling.setTeam(chelsea);
//        wolves.setPlayerList(List.of(podence, neves));
        podence.setTeam(wolves);
        neves.setTeam(wolves);
//        notts.setPlayerList(List.of(johnson, awoniyi));
        johnson.setTeam(notts);
        awoniyi.setTeam(notts);
//        southampton.setPlayerList(List.of(wardProwse, adams));
        wardProwse.setTeam(southampton);
        adams.setTeam(southampton);

//        everton - spurs
        Match match1 = new Match(1, 1, "03-04-2023 22:00");
        match1.setHomeTeam(everton);
        match1.setAwayTeam(spurs);

        Player keane = new Player("Michael Keane", "Keane", "England", 6, 1, 1, 0, 0);
//        everton.setPlayerList(List.of(gray, mcNeil, keane));
        gray.setTeam(everton);
        mcNeil.setTeam(everton);
        keane.setTeam(everton);

        Event event1_1 = new Event(EventType.GOAL.getCode(), 68, 2);
        event1_1.setPlayerInvolved(kane);

        Event event1_2 = new Event(EventType.GOAL.getCode(), 90, 1);
        event1_2.setPlayerInvolved(keane);

        match1.setEventList(List.of(event1_2, event1_1));


//       newcastle - manUtd
        Match match2 = new Match(2, 0, "02-04-2023 18:30");
        match2.setHomeTeam(newcastle);
        match2.setAwayTeam(manUnited);

        Player willock = new Player("Joe Willock", "Willock", "England", 27, 3, 4, 1, 0);
//        newcastle.setPlayerList(List.of(almiron, wilson, willock));
        almiron.setTeam(newcastle);
        wilson.setTeam(newcastle);
        willock.setTeam(newcastle);

        Event event2_1 = new Event(EventType.GOAL.getCode(), 65, 1);
        event2_1.setPlayerInvolved(willock);

        Event event2_2 = new Event(EventType.GOAL.getCode(), 88, 1);
        event2_2.setPlayerInvolved(wilson);

        match2.setEventList(List.of(event2_1, event2_2));


//        westHam - southampton
        Match match3 = new Match(1, 0, "02-04-2023 16:00");
        match3.setHomeTeam(westHam);
        match3.setAwayTeam(southampton);

        Player aguerd = new Player("Nayef Aguerd", "Aguerd", "Morocco", 12, 1, 0, 3, 0);
//        westHam.setPlayerList(List.of(ings, benrahma, aguerd));
        ings.setTeam(westHam);
        benrahma.setTeam(westHam);
        aguerd.setTeam(westHam);

        Event event3_1 = new Event(EventType.GOAL.getCode(), 25, 1);
        event3_1.setPlayerInvolved(aguerd);

        match3.setEventList(List.of(event3_1));


//        chelsea - astonVilla
        Match match4 = new Match(0, 2, "01-04-2023 19:30");
        match4.setHomeTeam(chelsea);
        match4.setAwayTeam(astonVilla);

        Player mcGinn = new Player("John McGinn", "McGinn", "Scotland", 25, 1, 2, 5, 0);
//        astonVilla.setPlayerList(List.of(watkins, buendia, mcGinn));
        watkins.setTeam(astonVilla);
        buendia.setTeam(astonVilla);
        mcGinn.setTeam(astonVilla);

        Event event4_1 = new Event(EventType.GOAL.getCode(), 18, 2);
        event4_1.setPlayerInvolved(watkins);

        Event event4_2 = new Event(EventType.GOAL.getCode(), 56, 2);
        event4_2.setPlayerInvolved(mcGinn);

        match4.setEventList(List.of(event4_1, event4_2));


//        bmouth - fulham
        Match match5 = new Match(2, 1, "01-04-2023 17:00");
        match5.setHomeTeam(bmouth);
        match5.setAwayTeam(fulham);

        Player pereira = new Player("Andreas Pereira", "Pereira", "Brazil", 28, 3, 6, 8, 0);
//        fulham.setPlayerList(List.of(mitrovic, reid, pereira));
        mitrovic.setTeam(fulham);
        reid.setTeam(fulham);
        pereira.setTeam(fulham);

        Player tavernier = new Player("Marcus Tavernier", "Tavernier", "England", 19, 4, 4, 1, 0);
//        bmouth.setPlayerList(List.of(billing, solanke, tavernier));
        billing.setTeam(bmouth);
        solanke.setTeam(bmouth);
        tavernier.setTeam(bmouth);

        Event event5_1 = new Event(EventType.GOAL.getCode(), 16, 2);
        event5_1.setPlayerInvolved(pereira);

        Event event5_2 = new Event(EventType.GOAL.getCode(), 50, 1);
        event5_2.setPlayerInvolved(tavernier);

        Event event5_3 = new Event(EventType.GOAL.getCode(), 79, 1);
        event5_3.setPlayerInvolved(solanke);

        match5.setEventList(List.of(event5_1, event5_2, event5_3));


//        arsenal - leeds
        Match match6 = new Match(4, 1, "01-04-2023 17:00");
        match6.setHomeTeam(arsenal);
        match6.setAwayTeam(leeds);

        Player jesus = new Player("Gabriel Jesus", "Jesus", "Brazil", 17, 7, 5, 4, 0);
        Player white = new Player("Ben White", "White", "England", 29, 2, 3, 4, 0);
        Player xhaka = new Player("Granit Xhaka", "Xhaka", "Switzerland", 29, 5, 5, 3, 0);
//        arsenal.setPlayerList(List.of(saka, martinelli, jesus, white, xhaka));
        saka.setTeam(arsenal);
        martinelli.setTeam(arsenal);
        jesus.setTeam(arsenal);
        white.setTeam(arsenal);
        xhaka.setTeam(arsenal);

        Player kristensen = new Player("Rasmus Kristensen", "Kristensen", "Denmark", 18, 2, 1, 4, 0);
//        leeds.setPlayerList(List.of(rodrigo, harrison, kristensen));
        rodrigo.setTeam(leeds);
        harrison.setTeam(leeds);
        kristensen.setTeam(leeds);

        Event event6_1 = new Event(EventType.GOAL.getCode(), 35, 1);
        event6_1.setPlayerInvolved(jesus);

        Event event6_2 = new Event(EventType.GOAL.getCode(), 47, 1);
        event6_2.setPlayerInvolved(white);

        Event event6_3 = new Event(EventType.GOAL.getCode(), 55, 1);
        event6_3.setPlayerInvolved(jesus);

        Event event6_4 = new Event(EventType.GOAL.getCode(), 76, 2);
        event6_4.setPlayerInvolved(kristensen);

        Event event6_5 = new Event(EventType.GOAL.getCode(), 84, 1);
        event6_5.setPlayerInvolved(xhaka);

        match6.setEventList(List.of(event6_1, event6_2, event6_3, event6_4, event6_5));


//        brighton - brentford
        Match match7 = new Match(3, 3, "01-04-2023 17:00");
        match7.setHomeTeam(brighton);
        match7.setAwayTeam(brentford);

        Player mitoma = new Player("Kaoru Mitoma", "Mitoma", "Japan", 22, 7, 4, 0, 0);
        Player welbeck = new Player("Danny Welbeck", "Welbeck", "England", 21, 3, 2, 0, 0);
//        brighton.setPlayerList(List.of(macAllister, march, mitoma, welbeck));
        macAllister.setTeam(brighton);
        march.setTeam(brighton);
        mitoma.setTeam(brighton);
        welbeck.setTeam(brighton);

        Player jansson = new Player("Pontus Jansson", "Jansson", "Sweden", 11, 1, 0, 0, 0);
        Player pinnock = new Player("Ethan Pinnock", "Pannock", "Jamaica", 21, 2, 0, 0 , 0);
//        brentford.setPlayerList(List.of(toney, jensen, jansson, pinnock));
        toney.setTeam(brentford);
        jensen.setTeam(brentford);
        jansson.setTeam(brentford);
        pinnock.setTeam(brentford);

        Event event7_1 = new Event(EventType.GOAL.getCode(), 10, 2);
        event7_1.setPlayerInvolved(jansson);

        Event event7_2 = new Event(EventType.GOAL.getCode(), 21, 1);
        event7_2.setPlayerInvolved(mitoma);

        Event event7_3 = new Event(EventType.GOAL.getCode(), 22, 2);
        event7_3.setPlayerInvolved(toney);

        Event event7_4 = new Event(EventType.GOAL.getCode(), 28, 1);
        event7_4.setPlayerInvolved(welbeck);

        Event event7_5 = new Event(EventType.GOAL.getCode(), 49, 2);
        event7_5.setPlayerInvolved(pinnock);

        Event event7_6 = new Event(EventType.GOAL.getCode(), 90, 1);
        event7_6.setPlayerInvolved(macAllister);

        match7.setEventList(List.of(event7_1, event7_2, event7_3, event7_4, event7_5, event7_6));


//        palace - leicester
        Match match8 = new Match(2, 1, "01-04-2023 17:00");
        match8.setHomeTeam(crystalPalace);
        match8.setAwayTeam(leicester);

        Player pereiraR = new Player("Ricardo Pereira", "Pereira", "Portugal", 7, 1, 1, 1, 0);
        Player iversen = new Player("Daniel Iversen", "Iversen", "Denmark", 3, 0, 0, 0, 0);
//        leicester.setPlayerList(List.of(barnes, maddison, pereiraR, iversen));
        barnes.setTeam(leicester);
        maddison.setTeam(leicester);
        pereiraR.setTeam(leicester);
        iversen.setTeam(leicester);

        Player mateta = new Player("Jean-Philippe Mateta", "Mateta", "France", 1, 2, 0, 0, 0);
//        crystalPalace.setPlayerList(List.of(zaha, eze, mateta));
        zaha.setTeam(crystalPalace);
        eze.setTeam(crystalPalace);
        mateta.setTeam(crystalPalace);

        Event event8_1 = new Event(EventType.GOAL.getCode(), 56, 2);
        event8_1.setPlayerInvolved(pereiraR);

        Event event8_2 = new Event(EventType.OWN_GOAL.getCode(), 59, 1);
        event8_2.setPlayerInvolved(iversen);

        Event event8_3 = new Event(EventType.GOAL.getCode(), 94, 1);
        event8_3.setPlayerInvolved(mateta);

        match8.setEventList(List.of(event8_1, event8_2, event8_3));


//        notts - wolves
        Match match9 = new Match(1, 1, "01-04-2023 17:00");
        match9.setHomeTeam(notts);
        match9.setAwayTeam(wolves);

        Event event9_1 = new Event(EventType.GOAL.getCode(), 38, 1);
        event9_1.setPlayerInvolved(johnson);

        Event event9_2 = new Event(EventType.GOAL.getCode(), 83, 2);
        event9_2.setPlayerInvolved(podence);

        match9.setEventList(List.of(event9_1, event9_2));

//        manCity - liverpool

        Match match10 = new Match(4, 1, "01-04-2023 14:30");
        match10.setHomeTeam(manCity);
        match10.setAwayTeam(liverpool);

        Player alvarez = new Player("Julian Alvarez", "Alvarez", "Argentina", 21, 6, 0, 0, 0);
        Player deBruyne = new Player("Kevin De Bruyne", "De Bruyne", "Belgium", 26, 5, 13, 1, 0);
        Player gundogan = new Player("Ilkay Gundogan", "Gundogan", "Germany", 25, 4, 3, 0, 0);
        Player grealish = new Player("Jack Grealish", "Grealish", "England", 22, 4, 5, 2, 0);
//        manCity.setPlayerList(List.of(haaland, foden, alvarez, deBruyne, gundogan, grealish));
        haaland.setTeam(manCity);
        foden.setTeam(manCity);
        alvarez.setTeam(manCity);
        deBruyne.setTeam(manCity);
        gundogan.setTeam(manCity);
        grealish.setTeam(manCity);

        Event event10_1 = new Event(EventType.GOAL.getCode(), 17, 2);
        event10_1.setPlayerInvolved(salah);

        Event event10_2 = new Event(EventType.GOAL.getCode(), 27, 1);
        event10_2.setPlayerInvolved(alvarez);

        Event event10_3 = new Event(EventType.GOAL.getCode(), 46, 1);
        event10_3.setPlayerInvolved(deBruyne);

        Event event10_4 = new Event(EventType.GOAL.getCode(), 53, 1);
        event10_4.setPlayerInvolved(gundogan);

        Event event10_5 = new Event(EventType.GOAL.getCode(), 74, 1);
        event10_5.setPlayerInvolved(grealish);

        match10.setEventList(List.of(event10_1, event10_2, event10_3, event10_4, event10_5));


        League premierLeague = new League("Premier League", "England");
        premierLeague.setTeamList(List.of(arsenal, manCity, newcastle, manUnited, spurs, liverpool, astonVilla, brighton, brentford, fulham, chelsea, crystalPalace, wolves, everton, notts, bmouth, leicester, southampton, westHam, leeds));
        premierLeague.setMatchList(List.of(match1, match2, match3, match4, match5, match6, match7, match8, match9, match10));
        premierLeague.setTopGoalscorers(List.of(haaland, kane, toney, rashford, martinelli, saka, salah, watkins, almiron, mitrovic, rodrigo));


        teamRepository.saveAll(List.of(arsenal, manCity, newcastle, manUnited,
                spurs, astonVilla, brighton, liverpool, brentford, fulham,
                chelsea, crystalPalace, leeds, southampton, bmouth,
                leicester, westHam, everton, notts, wolves));

        playerRepository.saveAll(List.of(saka, haaland, kane, rashford, toney,
                martinelli, salah, watkins, almiron, foden, wilson, fernandes, son,
                macAllister, march, buendia, firmino, jensen, mitrovic, reid,
                havertz, sterling, zaha, eze, rodrigo, harrison, podence, neves,
                ings, benrahma, gray, mcNeil, johnson, awoniyi, billing, solanke,
                barnes, maddison, wardProwse, adams, keane, willock, aguerd,
                mcGinn, pereira, tavernier, jesus, white, xhaka, mitoma, welbeck,
                jansson, pinnock, pereiraR, iversen, mateta, alvarez, deBruyne,
                gundogan, grealish, kristensen));


        eventRepository.saveAll(List.of(event1_1, event1_2, event2_1, event2_2,
                event3_1, event4_1, event4_2, event5_1, event5_2, event5_3,
                event6_1, event6_2, event6_3, event6_4, event6_5, event7_1,
                event7_2, event7_3, event7_4, event7_5, event7_6, event8_1,
                event8_2, event8_3, event9_1, event9_2, event10_1, event10_2,
                event10_3, event10_4, event10_5));

        matchRepository.saveAll(List.of(match1, match2, match3, match4, match5,
                match6, match7, match8, match9, match10));

        leagueRepository.saveAll(List.of(premierLeague));

    }
}
