package Pattern;
import java.util.regex.*;

public class PatternMethodWithMatcher {
    public static void main(String[] args) {

        String st1 = "I am Rifat";
        String st2 = "You may call me reyam";

        String regex = "(?i)you";// regex pattern match the case-insensitive to "you"

        //compile the regex pattern
        Pattern pa = Pattern.compile(regex);

        //create mather for input string
        Matcher mat = pa.matcher(st1);
        Matcher mat2 = pa.matcher(st2);

        // find the regex pattern and print

       if (mat.find())
        {
            System.out.println("find the and match " + mat.group());
        }
       else
       {
           System.out.println( " not match in first string ");
       }

       if (mat2.find())
       {
           System.out.println("find and match =" + mat2.group());
       }
       else
       {
           System.out.println("not found any match");
       }


    }
}
