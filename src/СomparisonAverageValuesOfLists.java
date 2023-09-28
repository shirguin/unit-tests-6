import java.util.List;


public class СomparisonAverageValuesOfLists {
    private List <Integer> argument1;
    private List <Integer> argument2;

    public СomparisonAverageValuesOfLists(List <Integer> array1, List <Integer> array2){
        this.argument1 = array1;
        this.argument2 = array2;
    }

    public String getResult(){
        double average_1 = getAverageValueOfList(this.argument1);
        double average_2 = getAverageValueOfList(this.argument2);
        if(average_1 > average_2){
            return "Первый список имеет большее среднее значение";
        } else if (average_1 < average_2) {
            return "Второй список имеет большее среднее значение";
        }
        return "Средние значения равны";
    }

    public double getAverageValueOfList(List<Integer> array) {
        int sum = 0;
        if (!array.isEmpty()) {
            for (int el : array) {
                sum += el;
            }
            return sum / array.size();
        }
        return sum;
    }
}
