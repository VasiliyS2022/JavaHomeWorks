// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Random;

public class Task2 {

    private static LinkedList<Integer> enqueue(LinkedList<Integer> linkedList, int value) {
        linkedList.addLast(value);

        return linkedList;
    }

    private static int dequeue(LinkedList<Integer> linkedList) {
        int firstValue = linkedList.getFirst();
        linkedList.pollFirst();
        System.out.println("Очередь после удаления элемента: " + linkedList);

        return firstValue;
    }

    private static int first(LinkedList<Integer> linkedList) {

        return linkedList.getFirst();
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(100));
            }
    
        int value = random.nextInt(100);
        System.out.println("Очередь: " + linkedList);
        System.out.println("Очередь после добавления элемента: " + enqueue(linkedList, value) + "\n" + "Добавляемый элемент " + value);
        System.out.println("Удаляемый элемент: " + dequeue(linkedList));
        System.out.println("Первый элемент: " + first(linkedList));
    }
}
