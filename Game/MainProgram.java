package Game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import units.BasicHero;
import units.Farmer;
import units.Magician;
import units.Monk;
import units.Robber;
import units.Sniper;
import units.Spearman;
import units.Сrossbowman;

public class MainProgram {
    static ArrayList<BasicHero> unitedTeam = new ArrayList<>();
    static ArrayList<BasicHero> team_1 = new ArrayList<>();
    static ArrayList<BasicHero> team_2 = new ArrayList<>();

    public static void main(String[] args) {
        BasicHero tuck = new Monk("Tuck");
        BasicHero merlin = new Magician("Merlin");
        BasicHero robin = new Sniper("Robin");
        BasicHero robert = new Сrossbowman("Robert");
        BasicHero oliver = new Farmer("Oliver");
        BasicHero steven = new Robber("Steven");
        BasicHero daniel = new Spearman("Daniel");

        

        ArrayList<BasicHero> allHeroes = new ArrayList<>();
        allHeroes.add(tuck);
        allHeroes.add(merlin);
        allHeroes.add(robin);
        allHeroes.add(robert);
        allHeroes.add(oliver);
        allHeroes.add(steven);
        allHeroes.add(daniel);

        //ArrayList<BasicHero> team_1 = new ArrayList<>();
        //ArrayList<BasicHero> team_2 = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            int j = new Random().nextInt(7);
            
            switch (j) {
                case 0:
                    team_1.add(new Magician("Hendalf"), 1, i);
                    team_2.add(new Magician("Hendalf"), 10, i);
                    break;
                case 1:
                    team_1.add(new Monk("Petr"), 1, i);
                    team_2.add(new Monk("Petr"), 10, i);
                    break;
                case 2:
                    team_1.add(new Crossbowman("Taras"), 1, i);
                    team_2.add(new Crossbowman("Taras"), 10, i);
                    break;
                case 3:
                    team_1.add(new Sniper("Cris"), 1, i);
                    team_2.add(new Sniper("Cris"), 10, i);
                    break;
                case 4:
                    team_1.add(new Farmer("Boris"), 1, i);
                    team_2.add(new Farmer("Boris"), 10, new Random().nextInt(0, 50));
                    break;
                case 5:
                    team_1.add(new Robber("Sergey"), 1, i);
                    team_2.add(new Robber("Sergey"), 10, i);
                    break;
                default:
                    team_1.add(new Spearman("Mihail"), 1, i);
                    team_2.add(new Spearman("Mihail"), 10, i);

            }
            team_1.add(allHeroes.get(newRandom()).nextInt(0, allHeroes.size()));
            team_2.add(allHeroes.get(newRandom()).nextInt(0, allHeroes.size()));
        }

        
        unitedTeam.addAll(team_1);
        unitedTeam.addAll(team_2);
        unitedTeam.sort((o1, 02) -> o2.getInitiative() - o1.getInitiative());
        

        team_1.forEach(item -> System.out.println(item.getInfo()));
        
        team_2.forEach(item -> System.out.println(item.getInfo()));

        View.view();

        for (BasicHero item : unitedTeam) {
            if (team_1.contains(item)) {
                item.step(team_1,team_2);
            }
            else {
                item.step(team_2,team_1);
            }  
                    
        }
        View.view();
        
}
