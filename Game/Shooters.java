package Game;

public abstract class Shooters extends BasicHero {
    public Shooters(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative) {
        super(id, healthLevel, name, type, attackLevelBase, initiative);
    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return ("ID: " + id + " " + "Health = " + healthLevel + " " + "Name: " + name + " " + "Type: " + type + " "
                + "Damage = " + attackLevelBase + " " + "Initiative = " + initiative);
    }
}
