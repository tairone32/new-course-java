import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();  // não aceita tipos primitivos necessariamente precisa usar wrapper class

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2,"Marco");

        System.out.println(list.size());

        //list.remove("Ana");
        //list.remove(1);

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------------------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("------------------------------------------------------------" +
                "");

        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }

}