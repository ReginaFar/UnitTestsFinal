import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CompareListsTest {
    CompareLists compareLists;
    private final List<Integer> firstList = Arrays.asList(6,10,15,4,5);
    private final List<Integer> secondList = Arrays.asList(5,1,30,51,9);
    private final List<Integer> nullList = new ArrayList<>();

     @BeforeEach
    void setUp() {
        compareLists = new CompareLists();
    }

    @Test
    void TestAverageList(){
        assertEquals(compareLists.average(firstList), 8);
    }

    @Test
    void TestAverageNull(){
        assertEquals(compareLists.average(nullList), 0.0);
    }

    @Test
    void TestCompareAverageSecondIsBigger(){
        assertEquals(compareLists.compareAverage(firstList, secondList), "Второй список имеет большее среднее значение");
    }

    @Test
    void TestCompareAverageFirstIsBigger(){
        assertEquals(compareLists.compareAverage(secondList, firstList), "Первый список имеет большее среднее значение");
    }

    @Test
    void TestCompareAverageEqual(){
        assertEquals(compareLists.compareAverage(firstList, firstList), "Средние значения равны");
    }
}