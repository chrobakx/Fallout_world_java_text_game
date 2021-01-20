package Game;

public enum Enemies {
    FERAL_GHOUL("Feral ghoul"),
    FERAL_GHOUL_ROAMER("Feral ghoul roamer"),
    FERAL_GHOUL_REAVER("Feral ghoul reaver"),
    SUPER_MUTANT("Super mutant"),
    SUPER_MUTANT_MASTER("Super mutant master"),
    SUPER_MUTANT_OVERLORD("Super mutant overlord"),
    SUPER_MUTANT_BEHEMOTH("Super mutant behemoth"),
    CENTAUR("Centaur"),
    WILD_DOG("Wild dog"),
    SCAVENGERS_DOG("Scavenger Dog"),
    GUARD_DOG("Guard dog"),
    VICIOUS_DOG("Vicious dog"),
    MOLE_RAT("Mole rat"),
    YAO_GUAI("Yao guai"),
    DEATHCLAW("Deathclaw"),
    ENCLAVE_DEATHCLAW("Enclave deathclaw"),
    BLOATFLY("Bloatfly"),
    RADROACH("Radroach"),
    GIANT_ANT("Giant ant"),
    GIANT_WORKER_ANT("Giant worker ant"),
    GIANT_SOLDIER_ANT("Giant worker ant"),
    RADSCORPION("Radscorpion"),
    GIANT_RADSCORPION("Giant radscorpion"),
    FIRE_ANT_SOLDIER("Fire ant soldier"),
    FIRE_ANT_WARRIOR("Fire ant warrior"),
    MIRELURK("Mirelurk"),
    MIRELURK_HUNTER("Mirelurk hunter");

    private final String name;

    Enemies(String name) {
        this.name = name;
    }

    public static Enemies getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }

    @Override public String toString() {
        return name;
    }
}
