package Game;

import java.util.Random;

public class RandomGen {
     public int randomGenerator() { return (int)(Math.random() * 50);}

    public static void generator() {
        Random random = new Random();
        int number = random.nextInt(4);
        System.out.println(number);
    }
}
