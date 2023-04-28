package chapterSeventeen.functionalInterface;

import java.util.function.Function;

public class FunctionSample2 {
    public static void main(String[] args) {

    }

    static Function<Integer, String> functionOne = input -> input * 20 + " ";
    static Function<String, Integer> functionTwo = name -> name.length();

    static int multiplyBy3(int number) {
        return number * 3;
    }
}
