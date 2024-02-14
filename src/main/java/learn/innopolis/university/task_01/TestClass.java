package learn.innopolis.university.task_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestClass {



    public static void main(String[] args) {

        System.out.println("Добавление элементов");
        PlayerService service = new PlayerServiceJSON();
        int id = service.createPlayer("Aragorn");
        int id_01 = service.createPlayer("Boromir");
        int id_02 = service.createPlayer("Sauron");

        System.out.println("Получение элемента по id");
        System.out.println(service.getPlayerById(id));
        System.out.println("Добавление очков по id");
        service.addPoints(id,10);
        System.out.println("Получение элемента по id");
        System.out.println(service.getPlayerById(id));
        System.out.println("Получение элемента по id");
        System.out.println(service.getPlayers());
        System.out.println("Удаление элемента по id");
        service.deletePlayer(id);
        System.out.println("Получение всех элементов");
        System.out.println(service.getPlayers());
        System.out.println("Удаление элемента по id_02");
        service.deletePlayer(id_02);
        System.out.println("Получение всех элементов");
        System.out.println(service.getPlayers());

        int id_03 = service.createPlayer("Gandalf");
        System.out.println(service.getPlayers());

    }
}
