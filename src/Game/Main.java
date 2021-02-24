package Game;

import java.util.Scanner;

import static Game.Enemies.getRandomEnemy;
import static Game.Places.getRandomPlace;
import static Game.Actions.print;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var player = new Player();
        var weapons = new Weapons();
        var enemy = new Enemy();
        var leveling = new Leveling();
        System.out.println("\n" +
                "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╭━━━╮╱╱╭╮╭╮╱╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╭╮\n" +
                "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱┃╭━━╯╱╱┃┃┃┃╱╱╱╱╱╭╯╰╮╱╱╱╱╱╱╱╱╱╱┃┃╱╱┃┃\n" +
                "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╮╭╋━━╮┃╰━━┳━━┫┃┃┃╭━━┳╮┣╮╭╯╭╮╭╮╭┳━━┳━┫┃╭━╯┃\n" +
                "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱┃┃┃╭╮┃┃╭━━┫╭╮┃┃┃┃┃╭╮┃┃┃┃┃╱┃╰╯╰╯┃╭╮┃╭┫┃┃╭╮┃\n" +
                "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱┃╰┫╰╯┃┃┃╱╱┃╭╮┃╰┫╰┫╰╯┃╰╯┃╰╮╰╮╭╮╭┫╰╯┃┃┃╰┫╰╯┃\n" +
                "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╰━┻━━╯╰╯╱╱╰╯╰┻━┻━┻━━┻━━┻━╯╱╰╯╰╯╰━━┻╯╰━┻━━╯");
        print("You are one of the 200 vault dwellers from Vault 13. Your Vault got damaged by faulty \n" +
                "water purifier and you had been forced to leave.");

        int playerHealth = player.getMaxHp();

        while (true) {
            int enemyHealth = enemy.getMaxHp();
            Places place = getRandomPlace();
            Enemies enemyList = getRandomEnemy();

            print("\n>On your journey you found " + getRandomPlace() + ". Inside the building is hiding " + enemyList + "\n");

            var wep = new Weapons();
            System.out.println("Weapon inventory: " + wep.getWeaponsList());
            print(">You drew your weapon: " + weapons.randomWeapon());

            print("\n\tYour HP: " + playerHealth + "\t\t\t\tEnemy's HP: " + enemyHealth);
            print("Your current level is:  " + leveling.getLevel() + "" +
                    "\nyour experience points: " + leveling.getCurXP());

            while (enemyHealth > 1) {
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

                    if (playerHealth < 1) {
                        print("\t> You have taken too much damage, you are too weak to go on!");
                        break;
                    }
                } else if (input.equals("2")) {
                    break;
                }
            }
            if (playerHealth < 1) {
                System.out.println("\t>You limp out of the building, weak from the battle");
                break;
            }

           print("---------------------------------------------------------------------------------");
            print(" # " + enemyList + " was defeated! # ");
            print(" # You have " + playerHealth + " HP left. # ");
            leveling.addXp(3);

            print("---------------------------------------------------------------------------------");
            print("What would you like to do?");
            print("1. Continue fighting");
            print("2. Exit the building");

            String input = sc.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                print("Invalid command");
                input = sc.nextLine();
            }

            if (input.equals("1")) {
                print("You continue on your adventure");
            } else {
                print("You exited the place and returned to vault");
                break;
            }
        }
    }
}
