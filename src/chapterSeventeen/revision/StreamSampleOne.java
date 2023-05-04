package chapterSeventeen.revision;

import java.util.List;
import java.util.stream.Collectors;

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


}
