package Game;

import static Game.Enemies.getRandomEnemies;
import static Game.Places.getRandomPlace;
import static Game.Actions.printText;
import static Game.Random.randomGenerator;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        System.out.println("\n" +
                "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╭━━━╮╱╱╭╮╭╮╱╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╭╮\n" +
                "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱┃╭━━╯╱╱┃┃┃┃╱╱╱╱╱╭╯╰╮╱╱╱╱╱╱╱╱╱╱┃┃╱╱┃┃\n" +
                "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╮╭╋━━╮┃╰━━┳━━┫┃┃┃╭━━┳╮┣╮╭╯╭╮╭╮╭┳━━┳━┫┃╭━╯┃\n" +
                "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱┃┃┃╭╮┃┃╭━━┫╭╮┃┃┃┃┃╭╮┃┃┃┃┃╱┃╰╯╰╯┃╭╮┃╭┫┃┃╭╮┃\n" +
                "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱┃╰┫╰╯┃┃┃╱╱┃╭╮┃╰┫╰┫╰╯┃╰╯┃╰╮╰╮╭╮╭┫╰╯┃┃┃╰┫╰╯┃\n" +
                "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╰━┻━━╯╰╯╱╱╰╯╰┻━┻━┻━━┻━━┻━╯╱╰╯╰╯╰━━┻╯╰━┻━━╯");
        printText("On your journey you found " + getRandomPlace() + ". Inside the building is hiding "
                + getRandomEnemies());
        System.out.println(player.getMaxHp(randomGenerator()));
    }
}
