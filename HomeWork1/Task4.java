// 4. *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть 
// заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите уравнение вида q+w=e (без пробелов), q,w,e>=0. Некоторые цифры могут быть заменены знаком вопроса, например 2?+?5=69");
        String equation = sc.nextLine();
        String newEquation = equation.replace('?', '0');
        String[] words = newEquation.split("[+= ]");
        int num1 = Integer.parseInt(words[0]);
        int num2 = Integer.parseInt(words[1]);
        int num3 = Integer.parseInt(words[2]);
        if (num1 + num2 == num3) {
            System.out.printf("%s + %s = %s", num1, num2, num3);
        }
        else {
            int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (num1 + i + j * 10 + num2 == num3) {
                    count += 1;
                    System.out.printf("%s + %s = %s", num1+i, num2+j*10, num3);
                }
            }
        }
        System.out.println("\n");
        if (count == 0) {
            System.out.println("Решений нет\n");
        }
        }
    }
}
// Данное решение работает не со всеми комбинациями.