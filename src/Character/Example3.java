package Character;

public class Example3 {

    public static void main(String[] args) {
        //equals() method;
        Character va1 = new Character('r');
        Character va2 = new Character('i');
        Character va3 = new Character('$');
        Character va4 = new Character('6');


        boolean checkEqual1 = va1.equals(va2);
        boolean checkEqual2 = va2.equals(va1);
        boolean checkEqual3 = va2.equals(va2);

        System.out.println("r equal to i : " + checkEqual1);
        System.out.println("r equal to i : " + checkEqual2);
        System.out.println("r equal to i : " + checkEqual3);


        // Use of getNumericValue() method If the character does not have a numeric value, -1 is returned.

        int c1 = Character.getNumericValue(va1);
        int c2 = Character.getNumericValue(va2);

        System.out.println("Int value of r : " + c1);
        System.out.println("Int value of r : " + c2);

        // Use of getType() method

        int rv1 = Character.getType(va1);
        int rv2 = Character.getType(va2);
        int rv3 = Character.getType(va3);
        int rv4 = Character.getType(va4);

        System.out.println("Value of Type of r : " + rv1);


    }
}
