package learn.innopolis.university.task_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestClass {



    public static void main(String[] args) {
        PlayerService service = new PlayerServiceJSON();

        System.out.println("Добавление элементов:\n Aragorn\n Boromir\n Sauron\n Melkor\n");
        service.createPlayer("Aragorn");
        service.createPlayer("Boromir");
        service.createPlayer("Sauron");
        service.createPlayer("Melkor");

        System.out.println("Получение элемента по id = 2");
        System.out.println(service.getPlayerById(2) + "\n");

        System.out.println("Добавление очков по id = 2");
        service.addPoints(2,10);

        System.out.println("Проверка добавления очков");
        System.out.println(service.getPlayerById(2) + "\n");

        System.out.println("Удаление элемента по id = 2");
        service.deletePlayer(2);

        System.out.println("Получение всех элементов и проверка на то, что Id были отредактированы");
        System.out.println(service.getPlayers() + "\n");

        System.out.println("Снова адаление элемента по id = 2");
        service.deletePlayer(2);
        System.out.println("Получение всех элементов и проверка на то, что Id были отредактированы");
        System.out.println(service.getPlayers() + "\n");

        System.out.println("Добавление элемента");
        int id_03 = service.createPlayer("Gandalf");
        System.out.println(service.getPlayers());

    }
}
