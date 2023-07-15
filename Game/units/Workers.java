package units;

import java.util.ArrayList;

public class Workers extends BasicHero {
    public Workers(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative,
            int ammoRecover, int x, int y) {
        super(id, healthLevel, name, type, attackLevelBase, initiative, x, y);
        this.ammoRecover = ammoRecover;

    }

    public int ammoRecover;

    @Override
    
    public String getInfo() {
        return ("u2661" + healthLevel + " " + name + " "  + type + " "
                + "Dmg = " + attackLevelBase + " " + "Init = " + initiative + " " + "AmRec = "
                + ammoRecover + " " + "X = " + place.x + " " + "Y = "
                + place.y);

    public boolean busy = false;

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> friends) {
        if (this.healthLevel > 0) this.busy = false;
            return;
        

}

}