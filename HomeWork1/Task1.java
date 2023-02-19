// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n0).
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int summ = 0;
        int multi = 1;
        Scanner num = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int n = num.nextInt();
        for(int i = 1; i <= n; ++i) {
            summ = summ + i;
            multi = multi * i;
          }
          System.out.printf("Сумма чисел от 1 до %s = %s\n", n, summ);
          System.out.printf("Произведение чисел от 1 до %s = %s", n, multi);
    }
}
