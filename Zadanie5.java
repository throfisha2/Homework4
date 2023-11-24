import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Посчитать количество строк, которые начинаются с определенного символа

public class Zadanie5
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Привет");
        list.add("До свидания");
        list.add("Пока");
        list.add("Здравствуйте");
        list.add("После увидимся");

        //Выборка строк по символу
        List<String> filtered = list.stream().filter(p -> p.startsWith("П")).collect(Collectors.toList());

        //Подсчет строк
        long count=filtered.stream().count();

        //Вывод значений
        System.out.println(count);

    }
}
