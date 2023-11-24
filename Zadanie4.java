import java.util.List;
import java.util.stream.Collectors;

//Убрать все дублирующие элементы из листа
public class Zadanie4
{
    public static void main(String[] args)
    {
        List<Integer> list = List.of(1, 2, 3, 4, 3, 2, 1);

        //проверка на уникальность элементов, чистка
        List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());

        //Вывод значений
        System.out.println(distinct);
    }
}
