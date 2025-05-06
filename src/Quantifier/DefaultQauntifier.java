package Quantifier;
import java.util.regex.*;


public class DefaultQauntifier {
    public static void main(String[] args) {

        //Greedy Quantifier (Default):
        // By default quantifier "+" is Greedy
        Pattern p = Pattern.compile("R+");

        Matcher m = p.matcher("Rifat");

        while (m.find())
        {
            System.out.println("Pattern found " + m.start() + " to " + (m.end()-1));
        }


        //Reluctant Quantifier (Appending ? after a quantifier)
        Pattern p1 = Pattern.compile("R+?"); // Making an instance of Pattern class
                                                // Here "+" is a Reluctant quantifier because
                                                // a "?' is appended after it.
        Matcher m1 = p1.matcher("Rifat");

        while (m1.find())
        {
            System.out.println("Pattern found " + m1.start() + " to " + (m1.end()-1));
        }


        //Possessive Quantifier (Appending + after a quantifier)
        Pattern p3 = Pattern.compile("R++"); // Making an instance of Pattern class
                                                        // Here "+" is a Possessive quantifier because
                                                        // a "+' is appended after it.

        Matcher m3 = p3.matcher("Rifat");
        while (m3.find())
        {
            System.out.println("Pattern found " + m3.start() + " to " + (m3.end()-1));
        }

    }
}
