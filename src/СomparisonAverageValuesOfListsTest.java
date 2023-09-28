import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class СomparisonAverageValuesOfListsTest {

    @Test
    void getResult() {
        List<Integer> array1 = List.of(10, 20, 30, 40, 50);
        List <Integer> array2 = List.of(1, 2, 3, 4, 5);
        СomparisonAverageValuesOfLists comparisonObject = new СomparisonAverageValuesOfLists(array1, array2);

        assertEquals(comparisonObject.getResult(), "Первый список имеет большее среднее значение");
    }

    @Test
    void getAverageValueOfList() {
        List<Integer> array1 = List.of(10, 20, 30, 40, 50);
        List <Integer> array2 = List.of(1, 2, 3, 4, 5);
        СomparisonAverageValuesOfLists comparisonObject = new СomparisonAverageValuesOfLists(array1, array2);

        assertEquals(comparisonObject.getAverageValueOfList(array1), 30);
        assertEquals(comparisonObject.getAverageValueOfList(array2), 3);
    }

}