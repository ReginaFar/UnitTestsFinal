import java.util.List;
public class CompareLists {
    public double average(List<Integer> request) {
        return request.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }

    public String compareAverage(List<Integer> firstList, List<Integer> secondList) {
        double resultFirstList = average(firstList);
        double resultSecondList = average(secondList);

        if (resultSecondList > resultFirstList) {
            return "Второй список имеет большее среднее значение";
        } else if (resultSecondList < resultFirstList) {
            return "Первый список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
