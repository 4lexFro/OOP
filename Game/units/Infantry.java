package units;

public abstract class Infantry extends BasicHero {

  public Infantry(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int x,
      int y) {
    super(id, healthLevel, name, type, attackLevelBase, initiative, x, y);
  }

  @Override

  public String getInfo() {
    return ("ID: " + id + " " + "Health = " + healthLevel + " " + "Name: " + name + " " + "Type: " + type + " "
        + "Damage = " + attackLevelBase + " " + "Initiative = " + initiative + " " + "X = " + place.x + " " + "Y = "
        + place.y);
  }

  @Override
     public void step(ArrayList<BasicHero> enemies) {
        int [] temp = findNearEnemy(enemies);
        System.out.println("LN" + temp[0] + " ENEMIS NAME " + enemies.get(temp[1].name));
     }
}
