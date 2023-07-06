package units;

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
        return ("ID: " + id + " " + "Health = " + healthLevel + " " + "Name: " + name + " " + "Type: " + type + " "
                + "Damage = " + attackLevelBase + " " + "Initiative = " + initiative + " " + "Heal = " + heal + " "
                + "X = "
                + place.x + " " + "Y = "
                + place.y);
                
     @Override
     public void step(ArrayList<BasicHero> enemies) {
        findNearEnemy(enemies);
        System.out.println("LN" + temp[0] + " ENEMIS NAME " + enemies.get(temp[1].name));
     }          

    }

}
