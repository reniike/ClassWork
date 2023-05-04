package chapterSeventeen.revision;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamSampleOneTest {
    @Test
    void testThatMapReturnsAListOfEachElementMultipliedByTwo(){
        List<Integer> numbers = List.of(1,2, 3, 4, 5);
        var actual = StreamSampleOne.mapMethod(numbers);
        var expected = List.of(2, 4, 6, 8, 10);
        assertEquals(actual, expected);
    }

    @Test
    void testThatMapReturnsMyNameIsJoinedToEachNames(){
        List<String> names = List.of("Omotayo", "Morenikeji");
        var actual = StreamSampleOne.mapMethodTwo(names);
        var expected = List.of("my name is Omotayo", "my name is Morenikeji");
        assertEquals(actual, expected);
    }
}