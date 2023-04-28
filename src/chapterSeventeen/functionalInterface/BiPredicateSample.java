package chapterSeventeen.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        System.out.println("First operation " + biPredicate.test("Renike", 6));
        System.out.println("Second Operation " + biPredicate.test("Madam", 5));
    }
    static BiPredicate<String, Integer> biPredicate =
            (name, lengthOfName) -> name.length() == lengthOfName;
}
