import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Из листа строк получить числа и найти max и min значения
public class Zadanie7
{
    public static void main(String[] args)
    {
        List<String> list=Arrays.asList("5", "3", "7", "1", "9");

        //Преобразование из строки в числа
        List<Integer> newList = list.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());

        //Поиск min и max
        int min=newList.stream().min(Integer::compare).get();
        int max=newList.stream().max(Integer::compare).get();

        //Вывод значений
        System.out.println(min);
        System.out.println(max);

    }
}
