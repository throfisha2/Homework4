import java.util.Arrays;
import java.util.List;

//Посчитать сумму всех четных и нечетных элементов листа

public class Zadanie3
{
    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //расчет суммы четных и нечетных чисел
        int sumCh =list.stream().filter(a -> a % 2 == 0).reduce(0,Integer::sum);
        int sumnoCh =list.stream().filter(a -> a % 2 != 0).reduce(0,Integer::sum);

        //Вывод значений
        System.out.println(sumCh);
        System.out.println(sumnoCh);
    }
}

