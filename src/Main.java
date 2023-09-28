import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Integer> array1 = List.of(10, 20, 30, 40, 50);
        List <Integer> array2 = List.of(1, 2, 3, 4, 5);

        СomparisonAverageValuesOfLists comparison = new СomparisonAverageValuesOfLists(array1, array2);
        System.out.println(comparison.getResult());

    }
}