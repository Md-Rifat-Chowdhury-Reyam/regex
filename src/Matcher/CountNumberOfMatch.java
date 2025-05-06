package Matcher;
import java.util.regex.*;


public class CountNumberOfMatch {

    public static void main(String[] args) {

        String input = "geek sfor geeks";
        String regex = "geek\\b"; // here \b means word boundary;


        Pattern pa = Pattern.compile(regex);
        Matcher ma = pa.matcher(input);

        boolean b = ma.matches();
        if(b)
        {
            System.out.println("matches : " );
        }
        else
        {
            System.out.println("no match : ");
        }

        int count = 0;
        while(ma.find())
        {
            count++;
            System.out.println();
            System.out.println("Matching number with rifat :" + count);
            System.out.println("start from : " + ma.start());
            System.out.println("end from : " + ma.end());
            System.out.println("Match with : " + ma.group());
            System.out.println("LookingAt() : " + ma.lookingAt());
            System.out.println("Matches : " + ma.matches() );

        }

    }
}
