package Character;

public class Example1
{
    public static void checkValid(int charCount) {
        if (charCount == 1 || charCount == 2) {
            System.out.println("Valid character (charCount: " + charCount + ")");
        } else {
            System.out.println("Invalid character (charCount: " + charCount + ")");
        }
    }

    public static void main(String[] args) {

        //charCount(argchar)
        int argchar1 =  0x9999; //argchar is parameter present Unicode point of character to be count
                                //Returns 1 for BMP characters (U+0000 to U+FFFF)

        int argchar2 =  0x10000; //Returns 2 for supplementary characters (U+10000 to U+10FFFF)
        int argchar3 =  0x10001;

        int c1 = Character.charCount(argchar1); //charCount() method used
        int c2 = Character.charCount(argchar2);
        int c3 = Character.charCount(argchar3);

        //pass to chechValid Method to varify validation;
        checkValid(c1); // Will print "Invalid character" (1 != 2)
        checkValid(c2); // Will print "Valid character" (2 == 2)
        checkValid(c3);

        System.out.println();

        //charValue()
        Character m = new Character('r'); // create a Character object and assign a char value;
        char ch = m.charValue(); //object m value assign to a char variable using charValue() method;
        System.out.println("Primitive value " + ch);

        System.out.println();

        //codePointAt():
        char[] arguments = new char[] {'r', 'i' ,'f' , 'a', 't'};
        int val1;
        int val2;
        val1 = Character.codePointAt(arguments, 3); //returns Unicode Point of the character array present at the argumented position.
        val2 = Character.codePointAt(arguments, 0);
        System.out.println("Unicode code point at : " + arguments[3] + " = " + val1);
        System.out.println("Unicode code point at : " + arguments[0] + " = " + val2);

    }

}
