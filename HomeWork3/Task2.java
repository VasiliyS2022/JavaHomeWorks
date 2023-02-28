// 2) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class Task2 {
    public static void main(String args[]) {
        double sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
            sum += list.get(i);
            System.out.print(list.get(i) + " ");
        }
      
        int max = Collections.max(list);
        System.out.println("\n" + "Максимальное значение: " + max);
  
        int min = Collections.min(list);
        System.out.println("Минимальное значение: " + min);

        double average = sum / 10;
        System.out.print("Среднее арифметическое: " + average);
    }
}
