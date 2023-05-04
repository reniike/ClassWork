package chapterSeventeen.revision;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamSampleOne {
    public static List<Integer> mapMethod(List<Integer> numbers){
        return numbers
                .stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
    }

    public static List<String> mapMethodTwo(List<String> names){
        return names
                .stream()
                .map(name -> "my name is " + name)
                .collect(Collectors.toList());
    }

    public static void randomNumbers() {
        Random random = new Random();
        System.out.println(Arrays.toString(IntStream
                .generate(() -> 1 + random.nextInt(20))
                .limit(15)
                .toArray()));
    }

    public static void randomNumbersTwo(){
        Random random = new Random();
        System.out.println(IntStream
                .generate(() -> 1 + random.nextInt(10))
                .limit(5)
                .boxed()
                .toList());
    }

    public static List<String> randomNames(){
        List<String> names = List.of("Renike", "Folahan", "Zainab", "Omotayo");
       return names.stream()
//                .map(name -> name.toUpperCase())
                .map(String::toLowerCase)
                .filter(x -> x.length() <= 6)
                .toList();
    }

    public static void main(String[] args) {
        randomNumbers();
        randomNumbersTwo();
        System.out.println(randomNames());
    }
}
