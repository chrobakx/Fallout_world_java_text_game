package Game;

public abstract class Creature {
    private int maxHp;
    private int maxAttack;
    private int minAttack;
    private int level;
    private int currentHp;

    public abstract void getMaxHp(int randomGenerator);
}
