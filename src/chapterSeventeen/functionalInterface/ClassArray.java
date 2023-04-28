package chapterSeventeen.functionalInterface;

public class ClassArray {
    public static void main(String[] args) {
        String[] figures = {"Ab1396", "Q2rbs", "G381AC"};
        System.out.println(countNumberOfDigits(figures));
    }

    public static int countNumberOfDigits(String[] figs){
        int count = 0;
        for (int i = 0; i < figs.length ; i++) {
            for (int j = 0; j < figs[i].length(); j++) {
                if (Character.isDigit(figs[i].charAt(j))) count++;
            }
        }
        return count;
    }

}
