package units;

public class Workers extends BasicHero {
    public Workers(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative,
            int ammoRecover, int x, int y) {
        super(id, healthLevel, name, type, attackLevelBase, initiative, x, y);
        this.ammoRecover = ammoRecover;

    }

    public int ammoRecover;

    @Override
    
    public String getInfo() {
        return ("ID: " + id + " " + "Health = " + healthLevel + " " + "Name: " + name + " " + "Type: " + type + " "
                + "Damage = " + attackLevelBase + " " + "Initiative = " + initiative + " " + "AmmoRecover = "
                + ammoRecover + " " + "X = " + place.x + " " + "Y = "
                + place.y);
    @Override
     public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> friends) {
        findNearEnemy(enemies);
        
     }          

    }
}