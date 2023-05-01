package Strings;

public class CopyStringsToChars {
    public static void main(String[] args) {
        String name = "Morenikeji";
        char[] chars = new char[8];
        name.getChars(0, 8, chars, 0);
        for (char each : chars) {
            System.out.print(each);
        }

    }
}
