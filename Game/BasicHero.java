package Game;

public abstract class BasicHero {
    int id;
    int healthLevel;
    String name;
    String type;
    int attackLevelBase;
    int initiative;

    public BasicHero(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative) {
        this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.type = type;
        this.attackLevelBase = attackLevelBase;
        this.initiative = initiative;

    }

}
