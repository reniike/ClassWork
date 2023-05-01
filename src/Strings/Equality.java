package Strings;

public class Equality {
    public static void main(String[] args) {
        String name = new String("Renike");
        String nameTwo = new String("Renike");
        String nameThree = new String(name);
        String nameFour = name;


        System.out.println(name == nameTwo); //false checks for the address.
//        System.out.println(name.equals(nameTwo)); //true checks for the value
        System.out.println(name == nameThree); //false
        System.out.println(name.equals(nameThree)); //true
        System.out.println(name);
    }
}
