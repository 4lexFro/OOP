package units;

import java.util.ArrayList;

public abstract class Infantry extends BasicHero {

  public Infantry(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int x,
      int y) {
    super(id, healthLevel, name, type, attackLevelBase, initiative, x, y);
  }

  @Override

  public String getInfo() {
    return ("u2661" + healthLevel + " " + name + " " + type + " "
        + "Dmg = " + attackLevelBase + " " + "Init = " + initiative + " " + "X = " + place.x + " " + "Y = "
        + place.y);
  }

  @Override
  public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> friends) {
    if (this.healthLevel <= 0)
      return;

    BasicHero temp = findNearEnemy(enemies);

    if (this.place.calcDistance(temp.place) < 2) {

      temp.getDamage(this.attackLevelBase);
      return;
    }

    if (this.place.x < temp.place.x) {
      this.place.x += 1;
    } else {
      this.place.x -= 1;
    }
    Coordinates tmpc = new Coordinates(place.x, place.y);

    if (Math.abs(this.place.x - temp.place.x) > Math.abs(this.place.y - temp.place.y)) {
      if (this.place.x < temp.place.x) {
        tmpc.x += 1;
        
      } else {
        tmpc.x -= 1;
      }

    } else {
      if (this.place.y < temp.place.y) {
        tmpc.y += 1;
      } else {
        tmpc.y -= 1;
      }
    }

    boolean flag = false;
    for (BasicHero item : friends) {
      if (item.place.x == tmpc.x & item.place.y == tmpc.y & item.healthLevel > 0) flag = true;
    }
    if (flag) return;
    this.place.x = tmpc.x;
    this.place.y = tmpc.y;

  }
}