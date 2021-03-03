package Game;

import java.util.*;
import java.util.stream.Stream;

public class Weapons {

    //Create a weapon list from wich you will take a random drop based on the level you have.
    //Then make a switch loop for chosen weapon and use appropriate amount for it
    //Make enemies drop random ammunition for different weapon.
    private List<String> weaponsList = new ArrayList<>();

    private String[] weapList = {"knife", "spear", "pistol", "shotgun", "assaultRifle", "miniGun"
            , "laserRifle", "plasmaRifle", "gatlingGun", "fatMan"};

    private int pistolAmmo = 0;
    private int shotgunAmmo = 0;
    private int rifleAmmo = 0;
    private int miniGunAmmo = 0;
    private int laserAmmo = 0;
    private int plasmaAmmo = 0;
    private int fatManAmmoAmmo = 0;

    Random random = new Random();

    public Weapons() {
        Collections.addAll(weaponsList, "knife", "spear", "pistol", "shotgun", "assaultRifle", "miniGun"
                , "laserRifle", "plasmaRifle", "gatlingGun", "fatMan");
    }

    public String randomWeapon() {
        String mix = weaponsList.get(random.nextInt(weaponsList.size()));
        return mix;
    }

    public List<String> getWeaponsList() {

        return weaponsList;
    }
    public String[] getWeapList() {
        return weapList;
    }

    public int getPistolAmmo() {
        pistolAmmo = pistolAmmo +  random.nextInt(3);
        return pistolAmmo;
    }

    public void setPistolAmmo(int pistolAmmo) {
        this.pistolAmmo = pistolAmmo;
    }

    public int getShotgunAmmo() {
        shotgunAmmo = shotgunAmmo + random.nextInt(2);
        return shotgunAmmo;
    }

    public void setShotgunAmmo(int shotgunAmmo) {
        this.shotgunAmmo = shotgunAmmo;
    }

    public int getRifleAmmo() {
        rifleAmmo = rifleAmmo + random.nextInt(2);
        return rifleAmmo;
    }

    public void setRifleAmmo(int rifleAmmo) {
        this.rifleAmmo = rifleAmmo;
    }

    public int getMiniGunAmmo() {
        miniGunAmmo = miniGunAmmo + random.nextInt(2);
        return miniGunAmmo;
    }

    public void setMiniGunAmmo(int miniGunAmmo) {
        this.miniGunAmmo = miniGunAmmo;
    }

    public int getLaserAmmo() {
        laserAmmo = laserAmmo + random.nextInt(2);
        return laserAmmo;
    }

    public void setLaserAmmo(int laserAmmo) {
        this.laserAmmo = laserAmmo;
    }

    public int getPlasmaAmmo() {
        plasmaAmmo = plasmaAmmo + random.nextInt(2);
        return plasmaAmmo;
    }

    public void setPlasmaAmmo(int plasmaAmmo) {
        this.plasmaAmmo = plasmaAmmo;
    }

    public int getFatManAmmoAmmo() {
        fatManAmmoAmmo = fatManAmmoAmmo + random.nextInt(2);
        return fatManAmmoAmmo;
    }

    public void setFatManAmmoAmmo(int fatManAmmoAmmo) {
        this.fatManAmmoAmmo = fatManAmmoAmmo;
    }

    public static void main(String[] args) {
        var wep = new Weapons();
       // System.out.println(wep.getWeaponsList());
        System.out.println(Arrays.toString(wep.getWeapList()));
       // Stream.of(wep.getWeapList()).forEach(System.out::println);
        for (String s : wep.getWeaponsList()) {
            if (s.contains("pistol")) {
                wep.getPistolAmmo();
                System.out.println(wep.getPistolAmmo());
            } else if (s.contains("shotgun")) {
                wep.getShotgunAmmo();
                System.out.println(wep.getShotgunAmmo());
            } else if (s.contains("assaultRifle")) {
                wep.getRifleAmmo();
                System.out.println(wep.getRifleAmmo());
            } else if (s.contains("miniGun")) {
                wep.getMiniGunAmmo();
                System.out.println(wep.getMiniGunAmmo());
            } else if (s.contains("laserRifle")) {
                wep.getLaserAmmo();
                System.out.println(wep.getLaserAmmo());
            } else if (s.contains("plasmaRifle")) {
                wep.getPlasmaAmmo();
                System.out.println(wep.getPlasmaAmmo());
            } else if (s.contains("gatlingGun")) {
                wep.getPlasmaAmmo();
                System.out.println(wep.getPlasmaAmmo());
            } else if (s.contains("fatMan")) {
                wep.getFatManAmmoAmmo();
                System.out.println(wep.getFatManAmmoAmmo());
            }
        }
    }
}
