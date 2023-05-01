package Strings;

public class ReversedAString {
    public static void main(String[] args) {
        String name = "Morenikeji";

        System.out.print("The reversed string is :: ");
        for (int i = name.length() - 1; i >= 0 ; i--) {
            System.out.print(name.charAt(i));
        }
    }
}
