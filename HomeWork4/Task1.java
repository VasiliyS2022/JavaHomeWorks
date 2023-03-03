// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class Task1 {
     
    private static LinkedList<Integer> valuesList(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            linkedList.add(random.nextInt(100));
        }
        return linkedList;
    }

    private static LinkedList<Integer> reverseList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> revList = new LinkedList<>();
        while (linkedList.size() > 0 ) {
            revList.add(linkedList.pollLast());
        }
        return revList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = valuesList(10);
        System.out.print("ИсходsourseListный список: ");
        System.out.println(list);
        list = reverseList(list);
        System.out.print("Перевернутый список: ");
        System.out.println(list);
        }
}
