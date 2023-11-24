import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

//Преобразовать list строк на верхний и нижений регистр
public class Zadanie2
{
    public static void main (String[] args) throws IOException
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Привет");
        list.add("До свидания");
        list.add("Пока");
        list.add("Здравствуйте");
        list.add("Алоха");

        //Преобразование в вверхний и нижний регистр
        List<String> listup = list.stream().map(product -> product.toUpperCase()).collect(Collectors.toList());
        List<String> listdown = list.stream().map(product -> product.toLowerCase()).collect(Collectors.toList());

        //Вывод полученных строк
        System.out.println(listup);
        System.out.println(listdown);
    }
}
