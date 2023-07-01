package Game;

public class Workers extends BasicHero {
    public Workers(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative,
            int ammoRecover) {
        super(id, healthLevel, name, type, attackLevelBase, initiative);
        this.ammoRecover = ammoRecover;

    }

    public int ammoRecover;

    @Override
    public void step() {

    }

    public String getInfo() {
        return ("ID: " + id + " " + "Health = " + healthLevel + " " + "Name: " + name + " " + "Type: " + type + " "
                + "Damage = " + attackLevelBase + " " + "Initiative = " + initiative + " " + "AmmoRecover = "
                + ammoRecover);

    }
}