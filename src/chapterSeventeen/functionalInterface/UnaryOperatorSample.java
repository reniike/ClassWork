package chapterSeventeen.functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply(10));
    }
//    return type is of the type as the operand
    static UnaryOperator<Integer> unaryOperator = value -> value * 30;

}
