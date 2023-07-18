package units;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Wizards extends BasicHero {

    public Wizards(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int heal,
            int x, int y) {
        super(id, healthLevel, name, type, attackLevelBase, initiative, x, y);
        this.heal = heal;
    }

    public int heal;

    @Override

    public String getInfo() {
        return ("u2661" + healthLevel + " "  + name + " "  + type + " "
                + "Dmg = " + attackLevelBase + " " + "Init = " + initiative + " " + "Heal = " + heal + " "
                + "X = "
                + place.x + " " + "Y = "
                + place.y);
    }

    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> friends) {
        if (this.healthLevel > 0) {

            for (BasicHero basicHero : friends) {
                if (item.healthLevel < 99 & item.healthLevel > 0)
                {
                    item.healthLevel += this.heal;
                     System.out.println(" Вылечил: " + item.name);
                    return;

                }

            }
            
                BasicHero temp = findNearEnemy(enemies);
                temp.getDamage(this.heal);
                System.out.println(" Повредил: " + temp.name);
            

            }

        }

    }
}