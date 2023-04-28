package chapterSeventeen.functionalInterface;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        System.out.println("Declarative "+ function.apply(10));
        System.out.println("Imperative " + newFunction(10));
//        System.out.println(function.apply("Renike"));
    }
//    static Function<String, Integer> function = name -> name.length();
    static Function<Integer, Integer> function = input -> input * 20;
    private static int newFunction(int input){
        return input * 20;
    }
}
