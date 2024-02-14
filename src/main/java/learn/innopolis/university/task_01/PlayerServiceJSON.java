package learn.innopolis.university.task_01;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PlayerServiceJSON implements PlayerService {

    private Collection<Player> players = new ArrayList<>();
    ObjectMapper objectMapper = new ObjectMapper();

    private void savePlayers() {
        try {
            objectMapper.writeValue(new File("src/main/java/learn/innopolis/university/task_01/data/players.json"), players);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Player getPlayerById(int id) {
        for (Player player : players) {
            if (player.getId() == id) {
                return player;
            }
        }
        return null;
    }

    @Override
    public Collection<Player> getPlayers() {
        return new ArrayList<>(players);
    }

    @Override
    public int createPlayer(String nickname) {
        int nextId = players.size() + 1;
        Player newPlayer = new Player(nextId, nickname, 0, false);
        players.add(newPlayer);
        savePlayers();
        return nextId;
    }

    @Override
    public Player deletePlayer(int id) {
        Player playerToDelete = getPlayerById(id);
        if (playerToDelete != null) {
            players.remove(playerToDelete);
            savePlayers();
        }
        return playerToDelete;
    }

    @Override
    public int addPoints(int playerId, int points) {
        Player player = getPlayerById(playerId);
        if (player!= null) {
            player.setPoints(player.getPoints() + points);
             savePlayers();
             return player.getPoints();
        }
        return 0;
    }
}
