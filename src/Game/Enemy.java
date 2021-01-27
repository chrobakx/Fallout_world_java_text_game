package Game;

import java.util.Random;

public class Enemy extends Creature {
    Random random = new Random();
    public int maxHp;
    private int attack;

    public int getMaxHp() {
        maxHp = random.nextInt(10) + 80;
        return maxHp;
    }

    public int getAttack() {
       attack = random.nextInt(25);
        return attack;
    }
}
