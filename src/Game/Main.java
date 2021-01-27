package Game;

import java.util.Scanner;

import static Game.Enemies.getRandomEnemies;
import static Game.Places.getRandomPlace;
import static Game.Actions.print;

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
        print("You are one of the 200 vault dwellers from Vault 13. Your Vault got damaged by faulty \n" +
                "water purifier and you had been forced to leave.");
        // printText("On your journey you found " + getRandomPlace() + ". Inside the building is hiding " + getRandomEnemies());
        // printText(player.getMaxHp() + " text");
        //printText(weapons.randomWeapon() + " text");
       // printText(player.getAttack() + " text");
       // printText(enemy.getMaxHp() + enemy.getCurrentHp() + " text");

        print("\n>On your journey you found " + getRandomPlace() + ". Inside the building is hiding " + getRandomEnemies());
        print(">You drew your weapon: " + weapons.randomWeapon());

        int enemyHealth = enemy.getMaxHp();
        int playerHealth = player.getMaxHp();

        print("\n\tYour HP: " + playerHealth + "\t\t\t\tEnemy's HP: " + enemyHealth);

        while (enemyHealth > 0) {
            print("\n\tWhat would you like to do?");
            print("\t1. Attack");
            print("\t2. Run!");
            System.out.print(">");

            String input = sc.nextLine();
            int enemyAttack = enemy.getAttack();
            int playerAttack = player.getAttack();

            print("\n\tYour HP: " + playerHealth + "\t\t\t\tEnemy's HP: " + enemyHealth);

            if (input.equals("1")) {
                enemyHealth = enemyHealth - playerAttack;
                playerHealth = playerHealth - enemyAttack;

                print("\t> You strike the enemy for " + playerAttack + " damage.");
                print("\t> You receive " + enemyAttack + " in retaliation!");
            }

            if (playerHealth < 1) {
                print("\t> You have taken too much damage, you are too weak to go on!");
                break;
            }

            if (input.equals("2")) {
                break;
            }
        }
    }
}
