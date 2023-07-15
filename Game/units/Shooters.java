package units;

import java.util.ArrayList;

public abstract class Shooters extends BasicHero {
    public Shooters(int id, int healthLevel, String name, String type, int attackLevelBase, int arrows, int initiative,
            int x,
            int y) {
        super(id, healthLevel, name, type, attackLevelBase, initiative, x, y);
        this.arrows = arrows;
    }

    protected int arrows;

    @Override

    public String getInfo() {
        return ("u2661" + healthLevel + " "  + name + " "  + type + " "
                + "Dmg = " + attackLevelBase + " " + "ARROWS = " + arrows + " " + "Init = " + initiative + " "
                + "X = " + place.x + " "
                + "Y = "
                + place.y);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> friends) {
        if (this.healthLevel <= 0 || this.arrows == 0)
            return;
        BasicHero temp = findNearEnemy(enemies);
        temp.healthLevel = temp.healthLevel - this.attackLevelBase;

        for (BasicHero item : friends) {
            if (item.type.contains("Farmer") && !((Farmer) (item)).busy && item.healthLevel > 0) {
                (Farmer) (item).busy = true;
                return;

            }

        }

        this.arrows--;
    }

}
