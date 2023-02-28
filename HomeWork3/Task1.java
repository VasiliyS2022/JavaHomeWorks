// 1) Пусть дан произвольный список целых чисел, удалить из него четные числа.

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
            System.out.print(list.get(i) + " ");
            }
        
        System.out.println(" ");

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }

        for (Integer i : list) {  
            System.out.print(i + " ");
        }
    }
}
    