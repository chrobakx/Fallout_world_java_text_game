package Game;

import java.util.Scanner;

import static Game.Enemies.getRandomEnemies;
import static Game.Places.getRandomPlace;
import static Game.Actions.printText;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var player = new Player();
        var weapons = new Weapons();
        var enemy = new Enemy();
        System.out.println("\n" +
                "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╭━━━╮╱╱╭╮╭╮╱╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╭╮\n" +
                "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱┃╭━━╯╱╱┃┃┃┃╱╱╱╱╱╭╯╰╮╱╱╱╱╱╱╱╱╱╱┃┃╱╱┃┃\n" +
                "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╮╭╋━━╮┃╰━━┳━━┫┃┃┃╭━━┳╮┣╮╭╯╭╮╭╮╭┳━━┳━┫┃╭━╯┃\n" +
                "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱┃┃┃╭╮┃┃╭━━┫╭╮┃┃┃┃┃╭╮┃┃┃┃┃╱┃╰╯╰╯┃╭╮┃╭┫┃┃╭╮┃\n" +
                "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱┃╰┫╰╯┃┃┃╱╱┃╭╮┃╰┫╰┫╰╯┃╰╯┃╰╮╰╮╭╮╭┫╰╯┃┃┃╰┫╰╯┃\n" +
                "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╰━┻━━╯╰╯╱╱╰╯╰┻━┻━┻━━┻━━┻━╯╱╰╯╰╯╰━━┻╯╰━┻━━╯");
        printText("You are one of the 200 vault dwellers from Vault 13. Your Vault got damaged by faulty \n" +
                "water purifier and you had been forced to leave.");
        // printText("On your journey you found " + getRandomPlace() + ". Inside the building is hiding " + getRandomEnemies());
        // printText(player.getMaxHp() + " text");
        //printText(weapons.randomWeapon() + " text");
       // printText(player.getAttack() + " text");
       // printText(enemy.getMaxHp() + enemy.getCurrentHp() + " text");

        printText("\nOn your journey you found " + getRandomPlace() + ". Inside the building is hiding " + getRandomEnemies());
        System.out.println("\n\tYour HP: " + player.getMaxHp() + "\t\t\t\t1Enemy's HP: " + enemy.getMaxHp());

        while (enemy.getMaxHp() > 0) {
            System.out.println("\n\tWhat would you like to do?");
            System.out.println("\t1. Attack");
            System.out.println("\t2. Run!");

            String input = sc.nextLine();

            if (input.equals("1")) {
                int playerHealth = player.getMaxHp() - enemy.getAttack();
                int enemyHealth = enemy.getMaxHp() - player.getAttack();
                System.out.println("\n\tYour HP: " + playerHealth + "\t\t\t\tEnemy's HP: " + enemyHealth);
                System.out.println("\t> You strike the enemy for " + player.getAttack() + " damage.");
                System.out.println("\t> You receive " + enemy.getAttack() + " in retaliation!");
            }

            if (player.getMaxHp() < 1) {
                System.out.println("\t> You have taken too much damage, you are too weak to go on!");
                break;
            }

            if (input.equals("2")) {
                break;
            }
        }
    }
}
