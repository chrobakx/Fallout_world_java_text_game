package Game;

import java.util.Scanner;

import static Game.Enemies.getRandomEnemy;
import static Game.Places.getRandomPlace;

public class Actions {
    public static void print(Object o){
        System.out.println(o);
    }

    public static void play() {
        Scanner sc = new Scanner(System.in);
        var player = new Player();
        var weapons = new Weapons();
        var enemy = new Enemy();
        var leveling = new Leveling();
        print("\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╭━━━╮╱╱╭╮╭╮╱╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╭╮\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱┃╭━━╯╱╱┃┃┃┃╱╱╱╱╱╭╯╰╮╱╱╱╱╱╱╱╱╱╱┃┃╱╱┃┃\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╮╭╋━━╮┃╰━━┳━━┫┃┃┃╭━━┳╮┣╮╭╯╭╮╭╮╭┳━━┳━┫┃╭━╯┃\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱┃┃┃╭╮┃┃╭━━┫╭╮┃┃┃┃┃╭╮┃┃┃┃┃╱┃╰╯╰╯┃╭╮┃╭┫┃┃╭╮┃\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱┃╰┫╰╯┃┃┃╱╱┃╭╮┃╰┫╰┫╰╯┃╰╯┃╰╮╰╮╭╮╭┫╰╯┃┃┃╰┫╰╯┃\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╰━┻━━╯╰╯╱╱╰╯╰┻━┻━┻━━┻━━┻━╯╱╰╯╰╯╰━━┻╯╰━┻━━╯");
        print("You are one of the 200 vault dwellers from Vault 13. Your Vault got damaged by faulty \n" +
                "water purifier and you had been forced to leave.");

        int playerHealth = player.getMaxHp();

        GAME:
        while (true) {
            int enemyHealth = enemy.getMaxHp();
            Enemies enemyList = getRandomEnemy();

            print("\n>On your journey you found " + getRandomPlace() + ". Inside the building is hiding " + enemyList + "\n");

            var wep = new Weapons();
            System.out.println("Weapon inventory: " + wep.getWeaponsList());
            print(">You drew your weapon: " + weapons.randomWeapon());

            print("\n\t\t\t  Your HP: " + playerHealth + "\t\t\t\tEnemy's HP: " + enemyHealth);
            print("Your current level is:  " + leveling.getLevel() + "" +
                    "\nyour experience points: " + leveling.getCurXP());

            while (enemyHealth > 1) {
                print("\n\tWhat would you like to do?");
                print("\t1. Attack");
                print("\t2. Use Stimpak");
                print("\t3. Run!");
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
                }else  if (input.equals("2")) {
                    if (player.getStimpak() > 0) {
                        playerHealth += player.getStimpakHealth();
                        player.setStimpak(player.getStimpak() - 1);
                        print("\t> You used a Stimpak, healing yourself for " + player.getStimpakHealth() + "HP."
                                + "\n\t> You now have " + playerHealth + " HP."
                                + "\n\t> You have " + player.getStimpak() + " Stimpak(s) left. \n");
                    } else {
                        print("\t> You have no Stimpak left! Defeat enemies for a chance to get one!\n");
                    }

                } else if (input.equals("3")) {
                    print("\t> You run away from the " + enemyList + "!");
                    continue GAME;
                } else {
                    print("\tInvalid command");
                }
            }
            if (playerHealth < 1) {
                print("\t>Your life ending right here, you fought hard, but the enemy was stronger. ");
                print("#######################");
                print("# Thanks for playing! #");
                print("#######################");
                break;
            }

            print("---------------------------------------------------------------------------------");
            print(" # " + enemyList + " was defeated! # ");
            print(" # You have " + playerHealth + " HP left. # ");
            if (Math.random() * 100 < player.getStimpakDropChance()) {
                player.setStimpak(player.getStimpak() + 1);
                print(" # The " + enemyList + " dropped the Stimpak! # ");
                print(" # You now have " + player.getStimpak() + " Stimpak(s). # ");
            }
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
                print("You exited the place and returned to wasteland");
                break;
            }
        }
    }
}