package chapterSeventeen.functionalInterface;

import java.util.Arrays;

public class StreamsSample {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
        int[] nums = {1, 2 ,3, 4 ,5, 6, 7, 8};
//        System.out.println(Arrays.stream(nums).count());
        Arrays.stream(nums).filter(x -> x % 2 == 0).forEach(System.out::println);
        System.out.println();
       
//        Arrays.stream(nums).takeWhile(x -> x % 2 == 0).forEach(System.out::println);


    }
}
