package Matcher;
import java.util.regex.*;
public class MatcherPatternMethod {


    public static void main(String[] args) {
        String str = "RifatChowdhuryReyam"; //input string compare with regex

        String regex = "R*.C*.R*"; //regex pattern string

        Pattern pa = Pattern.compile(regex); //compile the regex pattern

        //create the mather for input string
        Matcher matx = pa.matcher(str);

        System.out.println("pattern used : " + matx.pattern());




    }
}
