package Game;

import java.util.ArrayList;
import java.util.Random;

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
                    team_1.add(new Magician("Hendalf"));
                    break;
                case 1:
                    team_1.add(new Monk("Petr"));
                    break;
                case 2:
                    team_1.add(new Crossbowman("Taras"));
                    break;
                case 3:
                    team_1.add(new Sniper("Cris"));
                    break;
                case 4:
                    team_1.add(new Farmer("Boris"));
                    break;
                case 5:
                    team_1.add(new Robber("Sergey"));
                    break;
                default:
                    team_1.add(new Spearman("Mihail"));

            }
            team_1.add(allHeroes.get(newRandom()).nextInt(0, allHeroes.size()));
            team_2.add(allHeroes.get(newRandom()).nextInt(0, allHeroes.size()));
        }
        System.out.println(" команда 1: ");
        team_1.forEach(i -> System.out.println(i.getInfo()));
        System.out.println(" команда 2: ");
        team_2.forEach(i -> System.out.println(i.getInfo()));

    }

}
