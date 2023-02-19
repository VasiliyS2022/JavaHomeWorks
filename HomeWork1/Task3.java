// 3. Реализовать простой калькулятор (+ - / *)
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = sc.nextDouble();
        System.out.println("Выберите действие (+, -, *, /): ");
        char action = sc.next().charAt(0);

        if (action == '+') res = num1 + num2;

        else if (action == '-') res = num1 - num2;

        else if (action == '*') res = num1 * num2;

        else if (action == '/') res = num1 / num2;
        
        System.out.printf("%s %s %s = %s", num1, action, num2, res);
    }
}
