import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Найти второй min и max в списке Integer
public class Zadanie8
{
    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Поиск первых min и max
        int min=list.stream().min(Integer::compare).get();
        int max=list.stream().max(Integer::compare).get();

        //Исключение первых min и max
        List<Integer> listprom=list.stream().filter(a -> a !=max).collect(Collectors.toList());
        List<Integer> listitog =listprom.stream().filter(a -> a !=min).collect(Collectors.toList());

        //Поиск вторых min и max
        int min2=listitog.stream().min(Integer::compare).get();
        int max2=listitog.stream().max(Integer::compare).get();

        //Вывод значений
        System.out.println(min2);
        System.out.println(max2);
    }
}
