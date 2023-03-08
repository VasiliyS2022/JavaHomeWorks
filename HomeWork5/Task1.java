// Задача 1.
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции: 
// 1) добавление номера;
// 2) вывод всего.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        Map<String, LinkedList<String>> map = new HashMap<>();
        Scanner sc = new Scanner(System.in, "ibm866");
        while (true) {
        System.out.println("Выберите действие: 1 - добавление номера, 2 - вывод всего, 3 - выход");
        int action = sc.nextInt();
        if (action == 1) {
            System.out.println("Добавление номера");
            System.out.println("Введите фамилию: ");
            String surname = sc.next();
            System.out.println("Введите номер телефона: ");
            String number = sc.next();
            if (map.containsKey(surname)) {
                map.get(surname).add(number);
            } else {
                LinkedList<String> list = new LinkedList<>();
                list.add(number);
                map.put(surname, list);
            }
        }
        if (action == 2) {
            System.out.println("Вывод всего");
            map.forEach((key, value) -> System.out.println(key + " " + value));
            }
        if (action == 3) {
            sc.close();
            System.out.println("Выход");
            break;
            }
        }
    }
}
