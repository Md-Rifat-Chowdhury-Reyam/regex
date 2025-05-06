package Quantifier;
import java.util.regex.*;


public class ExampleQauntifier {
    public static void main(String[] args) {

        //Greedy Quantifier (Default):
        // By default quantifier "+" is Greedy
        Pattern p = Pattern.compile("R+");

        Matcher m = p.matcher("Rifat");

        while (m.find()) {
            System.out.println("Pattern found " + m.start() + " to " + (m.end() - 1));
        }

        System.out.println();

        //Reluctant Quantifier (Appending ? after a quantifier)
        Pattern p1 = Pattern.compile("R+?"); // Making an instance of Pattern class
        // Here "+" is a Reluctant quantifier because
        // a "?' is appended after it.
        Matcher m1 = p1.matcher("RRfRat");

        while (m1.find()) {
            System.out.println("Pattern found " + m1.start() + " to " + (m1.end() - 1));
        }

        System.out.println();

        //Possessive Quantifier (Appending + after a quantifier)
        Pattern p3 = Pattern.compile("R++"); // Making an instance of Pattern class
        // Here "+" is a Possessive quantifier because
        // a "+' is appended after it.

        Matcher m3 = p3.matcher("Rifat");
        while (m3.find()) {
            System.out.println("Pattern found " + m3.start() + " to " + (m3.end() - 1));
        }

        System.out.println();


        // Create a pattern with Greedy quantifier
        Pattern pg = Pattern.compile("g+g");

        // Create same pattern with possessive quantifier
        Pattern pp = Pattern.compile("g++g");

        System.out.println("Using Greedy Quantifier");
        Matcher mg = pg.matcher("ggg");



        while (mg.find()) {
            System.out.println("Pattern found from " + mg.start() +
                    " to " + (mg.end() - 1));

        }

        System.out.println("\nUsing Possessive Quantifier");
        Matcher mp = pp.matcher("ggg");


        while (mp.find()) {
            System.out.println("Pattern found from " + mp.start() +
                    " to " + (mp.end() - 1));


        }
    }
}
