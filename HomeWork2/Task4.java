// 4*. К калькулятору из предыдущего дз добавить логирование.

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task4.class.getName());
        FileHandler fh = new FileHandler("Task4.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sFormatter = new SimpleFormatter();
        fh.setFormatter(sFormatter);
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
        
        System.out.printf("%s %s %s = %s\n", num1, action, num2, res);
        logger.info("Записан результат действий: " + num1 + " " + action + " " + num2 + " = " + res + "\n");
    }
}
