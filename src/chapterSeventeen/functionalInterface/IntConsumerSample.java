package chapterSeventeen.functionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.IntConsumer;

public class IntConsumerSample {
    public static void main(String[] args) {
        IntConsumer intConsumer = System.out::println;

        intConsumer.accept(100);
        intConsumer.accept(200);
        intConsumer.accept(200);
        intConsumer.accept(200);
        intConsumer.accept(200);



        BinaryOperator<Double> renike = (i , j) -> i * j;

        System.out.println(renike.apply(5.0, 7.0));
    }
}
