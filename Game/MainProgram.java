package Game;

import java.util.ArrayList;
import java.util.Random;

import units.BasicHero;
import units.Farmer;
import units.Magician;
import units.Monk;
import units.Robber;
import units.Sniper;
import units.Spearman;
import units.Сrossbowman;

public class Main {
    public static void main(String[] args) {
        BasicHero tuck = new Monk("Tuck");
        BasicHero merlin = new Magician("Merlin");
        BasicHero robin = new Sniper("Robin");
        BasicHero robert = new Сrossbowman("Robert");
        BasicHero oliver = new Farmer("Oliver");
        BasicHero steven = new Robber("Steven");
        BasicHero daniel = new Spearman("Daniel");

        /*
         * System.out.println(Tuck.getInfo());
         * System.out.println(Merlin.getInfo());
         * System.out.println(Robin.getInfo());
         * System.out.println(Robert.getInfo());
         * System.out.println(Oliver.getInfo());
         * System.out.println(Steven.getInfo());
         * System.out.println(Daniel.getInfo());
         */

        ArrayList<BasicHero> allHeroes = new ArrayList<>();
        allHeroes.add(tuck);
        allHeroes.add(merlin);
        allHeroes.add(robin);
        allHeroes.add(robert);
        allHeroes.add(oliver);
        allHeroes.add(steven);
        allHeroes.add(daniel);

        ArrayList<BasicHero> team_1 = new ArrayList<>();
        ArrayList<BasicHero> team_2 = new ArrayList<>();

        for (int i = 0; i < allHeroes.length; i++) {
            int j = new Random().nextInt(7);
            
            switch (j) {
                case 0:
                    team_1.add(new Magician("Hendalf"), 0, new Random().nextInt(0, 50));
                    team_2.add(new Magician("Hendalf"), 9, new Random().nextInt(0, 50));
                    break;
                case 1:
                    team_1.add(new Monk("Petr"), 0, new Random().nextInt(0, 50));
                    team_2.add(new Monk("Petr"), 9, new Random().nextInt(0, 50));
                    break;
                case 2:
                    team_1.add(new Crossbowman("Taras"), 0, new Random().nextInt(0, 50));
                    team_2.add(new Crossbowman("Taras"), 9, new Random().nextInt(0, 50));
                    break;
                case 3:
                    team_1.add(new Sniper("Cris"), 0, new Random().nextInt(0, 50));
                    team_2.add(new Sniper("Cris"), 9, new Random().nextInt(0, 50));
                    break;
                case 4:
                    team_1.add(new Farmer("Boris"), 0, new Random().nextInt(0, 50));
                    team_2.add(new Farmer("Boris"), 9, new Random().nextInt(0, 50));
                    break;
                case 5:
                    team_1.add(new Robber("Sergey"), 0, new Random().nextInt(0, 50));
                    team_2.add(new Robber("Sergey"), 9, new Random().nextInt(0, 50));
                    break;
                default:
                    team_1.add(new Spearman("Mihail"), 0, new Random().nextInt(0, 50));
                    team_2.add(new Spearman("Mihail"), 9, ynew Random().nextInt(0, 50);

            }
            team_1.add(allHeroes.get(newRandom()).nextInt(0, allHeroes.size()));
            team_2.add(allHeroes.get(newRandom()).nextInt(0, allHeroes.size()));
        }
        System.out.println(" команда 1: ");
        team_1.forEach(i -> System.out.println(i.getInfo()));
        System.out.println(" команда 2: ");
        team_2.forEach(i -> System.out.println(i.getInfo()));

        System.out.println("Team_1 Enemies: ");
        team_1.forEach(n -> n.step(team_2));
        System.out.println("Team_2 Enemies: ");
        team_2.forEach(n -> n.step(team_1));

    }

}
