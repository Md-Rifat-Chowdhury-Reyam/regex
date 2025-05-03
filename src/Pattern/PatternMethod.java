package Pattern;

import java.util.regex.*;

public class PatternMethod {
    public static void main(String[] args) {
        String regEx = "(.*)(.*)(.*)";

        //want to search
        String Actual = "rifat chowdhury reyam";

        Pattern pa = Pattern.compile(regEx); // create pattern

        //find the regular expression
        String RE = pa.pattern();

        System.out.println("regular expression " + RE);

    }
}
