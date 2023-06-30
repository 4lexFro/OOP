package Game;

public class Workers extends BasicHero {
    public Workers(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative,
            int ammoRecover) {
        super(id, healthLevel, name, type, attackLevelBase, initiative);
        this.ammoRecover = ammoRecover;

    }

    public int ammoRecover;
}