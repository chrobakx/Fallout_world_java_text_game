package Game;

import java.util.Random;
import java.util.Scanner;

public class Enemy extends Creature {
    Random random = new Random();
    public int maxHp = random.nextInt(10) + 80;
    private int attack = random.nextInt(35);
    private int currentHp;

    public int getMaxHp() {
        return maxHp;
    }

    public int getAttack() {
        return attack;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public static void main(String[] args) {
        Enemy enemy = new Enemy();


        while (enemy.getMaxHp() > 0) {
            System.out.println(enemy.maxHp);
            Scanner sc = new Scanner(System.in);
            String attack = sc.nextLine();
            if (attack.equals("1")){
                int i = enemy.maxHp;
                i = i - enemy.getAttack() ;
                System.out.println(i);
            }
        }
    }
}
