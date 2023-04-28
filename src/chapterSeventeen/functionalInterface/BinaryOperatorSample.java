package chapterSeventeen.functionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply("Omoseebi", "Omotayo"));
    }
    static BinaryOperator<String> binaryOperator = (firstName, lastName) -> firstName +" "+ lastName;
}
