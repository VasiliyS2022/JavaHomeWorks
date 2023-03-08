// Задача 2.
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности имени.
// Список сотрудников:
// Иван Иванов; Светлана Петрова; Кристина Белова; Анна Мусина; Анна Крутова; Иван Юрин; 
// Петр Лыков; Павел Чернов; Петр Чернышов; Мария Федорова; Марина Светлова; Мария Савина; 
// Мария Рыкова; Марина Лугова; Анна Владимирова; Иван Мечников; Петр Петин; Иван Ежов.

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Task2 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова",
        "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
        "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
        "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов");
        String[] staffList = list.toArray(new String[0]);
        for (int i = 0; i < staffList.length; i++) {
            String[] staff = staffList[i].split(" ");
            if (map.containsKey(staff[0])) {
                map.replace(staff[0], map.get(staff[0]) + 1);
            } else {
                map.put(staff[0], 1);
            }
        }
        System.out.println("Имена с количеством повторений:");
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getValue() + " - " + entry.getKey());
        });
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;

        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }

        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String key = entry.getKey();
                if (map.get(key) == i) {
                    sortedNameMap.put(key, map.get(key));
                }
            }
        }

        System.out.println("По убыванию популярности:");
        sortedNameMap.entrySet().forEach(entry -> {
            System.out.println(entry.getValue() + " - " + entry.getKey());
        });
    }
}
