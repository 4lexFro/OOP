package units;

import java.util.ArrayList;

public abstract class Infantry extends BasicHero {

  public Infantry(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int x,
      int y) {
    super(id, healthLevel, name, type, attackLevelBase, initiative, x, y);
  }

  @Override

  public String getInfo() {
    return ("u2661" + healthLevel + " "  + name + " "  + type + " "
        + "Dmg = " + attackLevelBase + " " + "Init = " + initiative + " " + "X = " + place.x + " " + "Y = "
        + place.y);
  }

  @Override
     public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> friends) {
        
     }
}
