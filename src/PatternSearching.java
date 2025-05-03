import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSearching {
    public static void main(String[] args) {

        //custom pattern
        Pattern p = Pattern.compile("E");

        Matcher m = p.matcher("IntelliJ IDEEA Community Edition ");
        while (m.find())
        {
            System.out.println("patten found in " + m.start() + " to " + (m.end() - 1) );
        }

        System.out.println(Pattern.matches("[a-z]", "g"));
        System.out.println(Pattern.matches("[a-zA-Z]", "gf"));
    }
}
