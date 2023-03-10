// 1. Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
// результат после каждой итерации запишите в лог-файл.

import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.io.IOException;
import java.util.Arrays;

public class Task1 {
    public static void main (String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task1.class.getName());
        FileHandler fh = new FileHandler("Task1.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sFormatter = new SimpleFormatter();
        fh.setFormatter(sFormatter);
        int[] array = new int[] {12, 3, 7, 1, 4, 5, 6, 2, 9, 0};
        int[] copy = array.clone();
        int a = 0;
        while (a < array.length) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            logger.info(Arrays.toString(array));
            }
            a++;
        }
        System.out.printf("Исходный массив %s\n", Arrays.toString(copy));
        System.out.printf("Отсортированный массив %s", Arrays.toString(array));
    }
}
