import java.util.regex.Pattern;

public class MatchingWithRegexAPI {

    public static void main(String[] args) {
        System.out.println(Pattern.matches("Rifat", "Tafir"));

        System.out.println(Pattern.matches("Reya*m", "Reyaam"));
        System.out.println(Pattern.matches(
                "geeksforge*ks", "geeksforgeeks"));

        System.out.println(Pattern.matches("Rifattt.*", "Rifattt"));


    }
}
