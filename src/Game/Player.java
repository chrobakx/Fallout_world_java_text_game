package Game;

import java.util.Random;

public class Player extends Creature{
    Random random = new Random();
    public int maxHp;
    private int attack;
    private int stimpak = 3;
    private int stimpakHealth = 30;
    private int stimpakDropChance = 50; //Percentage


    public int getStimpak() {
        return stimpak;
    }

    public void setStimpak(int stimpak) {
        this.stimpak = stimpak;
    }

    public int getStimpakHealth() {
        return stimpakHealth;
    }

    public void setStimpakHealth(int stimpakHealth) {
        this.stimpakHealth = stimpakHealth;
    }

    public int getStimpakDropChance() {
        return stimpakDropChance;
    }

    public void setStimpakDropChance(int stimpakDropChance) {
        this.stimpakDropChance = stimpakDropChance;
    }

    public int getMaxHp() {
        maxHp = random.nextInt(10) + 80;
        return maxHp;
    }

    public int getAttack() {
        attack = random.nextInt(45);
        return attack;
    }
}
