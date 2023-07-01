package Game;

import java.util.Objects;

public abstract class Wizards extends BasicHero {

    public Wizards(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int heal) {
        super(id, healthLevel, name, type, attackLevelBase, initiative);
        this.heal = heal;
    }

    public int heal;

    @Override
    public void step() {

    }

    public String getInfo() {
        return ("ID: " + id + " " + "Health = " + healthLevel + " " + "Name: " + name + " " + "Type: " + type + " "
                + "Damage = " + attackLevelBase + " " + "Initiative = " + initiative + " " + "Heal = " + heal);

    }

}
