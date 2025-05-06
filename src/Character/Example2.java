package Character;

public class Example2 {

    public static void main(String[] args) {

        //codePointBefore()

        char[] arg = new char[] {'r', 'i' ,'f' , 'a', 't'};
        int var1 = Character.codePointBefore(arg, 3);  //Before index 3 is 'f' which has Unicode code point 102
        int var2 = Character.codePointBefore(arg,2);

        System.out.println("Before index : " + arg[3] + " is : " +arg[2] + " which has Unicode code point " + var1);


        // codePointCount()
        int count = Character.codePointCount(arg , 1 ,3);
        System.out.println("No. of Unicode points : " + count);


        //compareTo():
        Character firstChar = new Character('r');
        Character secondChar = new Character('i');

        int check1 = firstChar.compareTo(secondChar);
        int check2 = secondChar.compareTo(firstChar);
        int check3 = secondChar.compareTo(secondChar);

        System.out.println("r > i " + check1);
        System.out.println("i < r " + check2);
        System.out.println("i = i " + check3);
    }
}
