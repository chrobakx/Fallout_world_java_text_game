package Game;

public abstract class Creature {
    private int maxHp;
    private int attack;
    private int level;
    private int currentHp;

    public abstract int getMaxHp();

    public abstract int getAttack();

    public abstract int getCurrentHp();

}
