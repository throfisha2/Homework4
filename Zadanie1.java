import java.util.Arrays;
import java.util.List;

//Посчитать среднее значение листа интеджеров

public class Zadanie1
{
    private static double getAverage(List<Integer> list)
    {
        return list.stream().mapToInt(a->a).average().orElse(0);

    }

    public static void main(String[] args)
    {
        List<Integer> list=Arrays.asList(5, 3, 7, 1, 9);

        double srz=getAverage(list);
        System.out.println(srz);
    }
}
