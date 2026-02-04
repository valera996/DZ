package DZ11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));

        //Нельзя перебирать список через for и его же изменять
        //Реализовал задачу через стрим
        List<String> filteredNames = names.stream()
                .filter(n -> !n.startsWith("A"))
                .collect(Collectors.toList());


        //Проверка результата
        System.out.println(filteredNames);

    }
}
