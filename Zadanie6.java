import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Отсортировать лист строк в алфавитном порядке и наоборот
public class Zadanie6
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Привет");
        list.add("До свидания");
        list.add("Пока");
        list.add("Здравствуйте");
        list.add("Алоха");

        //Сортировка
        List<String> sortlist = list.stream().sorted().collect(Collectors.toList());
        List<String> sortlist2 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        //Вывод значений
        System.out.println(sortlist);
        System.out.println(sortlist2);

    }
}
