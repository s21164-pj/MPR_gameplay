package pl.pjatk.gameplay.service;

import org.springframework.stereotype.Service;
import pl.pjatk.gameplay.model.Player;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    public List<Player> FindAll(){
    List<Player> players = new ArrayList<>();
    Player player1 = new Player(1, "Pawel", "mag", 12, 2);
    Player player2 = new Player(2, "Piotr", "rouge", 10, 3);
    players.add(player1);
    players.add(player2);
    return players;
    /*return List.of(
            new Player(1,"Pawel", )
    );*/
    }
}
