package Game;

public class Leveling {
    private int curXP = 0;

    private int level = 0;
    private int reqXP = 0;
    int[] currentLevel = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    int[] requiredXP = { 0, 6, 17, 36, 65, 105, 158, 224, 305, 402 };
    public void addXp(int reward) {
        curXP += reward;
        while (level < requiredXP.length && requiredXP[level] < curXP) {
            ++level;
            System.out.println(" #############################");
            System.out.println(" # You have reached level " + level + "! # ");
            System.out.println(" #############################");
        }
    }

   /* public void leveling() {
        int maxLevel = 200;
        int maxLevelXP = 1000000;
        for (int currentLevel = 1; currentLevel < maxLevel; currentLevel += 1) {
            float x = currentLevel / (float) maxLevel;
            double y = Math.pow(x, 2.61);
            int requiredXP = (int) (y * maxLevelXP);
            System.out.println("Level " + currentLevel + " XP: " + requiredXP);
        }
    }*/

    public int getLevel() {
        return level;
    }

    public int getCurXP() {
        return curXP;
    }
}
