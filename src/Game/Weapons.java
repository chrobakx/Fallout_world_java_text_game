package Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Weapons {
    private List<String> weapons = new ArrayList<>();
    Random random = new Random();

    public Weapons() {
        Collections.addAll(weapons, "knife", "spear", "pistol", "shotgun", "assaultRifle", "miniGun"
                , "laserRifle", "plasmaRifle", "gatlingGun", "fatMan");
    }

    public String randomWeapon() {
        String mix = weapons.get(random.nextInt(weapons.size()));
        return mix;
    }

}
