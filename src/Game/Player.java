package Game;

import java.util.Random;

public class Player extends Creature{
    Random random = new Random();
    private int maxHp = random.nextInt(10) + 80;
    private int attack = random.nextInt(35);
    private int currentHp;

    public int getMaxHp() {
        return maxHp;
    }

    public int getAttack() {
        return attack;
    }

    public int getCurrentHp() {
        int currentHp = getMaxHp() - getAttack();
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }
}
