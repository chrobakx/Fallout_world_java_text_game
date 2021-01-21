package Game;

public enum Places {
    ABANDONED_CABIN("Abandoned cabin"),
    SUPER_DUPER_MART("Super duper mart"),
    RED_ROCKET("Red rocket"),
    ABANDONED_BUILDING("Abandoned building"),
    ABANDONED_FACTORY("Abandoned factory"),
    ATOMATOYS_WAREHOUSE("AtomaToys warehouse"),
    BLAMCO_FACTORY("Blamco factory"),
    CORVEGA_FACTORY("Corvega factory"),
    HOLY_HEART_HOSPITAL("Holy heart hospital"),
    LAKEVILLE_LIBRARY("Lakeville library"),
    MACHINE_PARTS_FACTORY("Machine parts factory"),
    MASS_CHEMICAL_BUILDING("Mass chemical building"),
    NUKA_COLA_PLANT("Nuka cola plant"),
    OFFICE_BUILDING("Office building"),
    OLD_CANDY_FACTORY("Old candy factory"),
    OLD_WAREHOUSE("Old warehouse"),
    RAIDER_CAMP("Raider camp"),
    ROBCO_PLANT("Robco plant"),
    RUINED_LIBRARY("Ruined library");

    private final String name;

    Places(String name) {
        this.name = name;
    }

    public static Places getRandomPlace() {
        return values()[(int) (Math.random() * values().length)];
    }

    @Override public String toString() {
        return name;
    }
}
