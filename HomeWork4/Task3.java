// 3. В калькулятор добавьте возможность отменить последнюю операцию.
// Пример
// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7

// Отмена
// 3
// *
// 3

// ответ:
// 9
// Дополнительно каскадная отмена - отмена нескольких операций

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.io.IOException;
import java.util.LinkedList;

class Task3 {
    private static double actions(char action, double num1, double num2) {
        double res = 0;
        if (action == '+') res = num1 + num2;
        else if (action == '-') res = num1 - num2;
        else if (action == '*') res = num1 * num2;
        else if (action == '/') res = num1 / num2;
        System.out.printf("%s %s %s = %s\n", num1, action, num2, res);
    
        return res;
    }

    private static void logging(double num1, char action, double num2, double res, Logger logger) throws IOException {
        if (action == '!') logger.info("Выход" + "\n");
        else if (action == '?') logger.info("Отмена последней операции" + "\n" + res + "\n");
        else logger.info("Записан результат действий: " + num1 + " " + action + " " + num2 + " = " + res + "\n");
    }

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task3.class.getName());
        FileHandler fh = new FileHandler("Task3.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sFormatter = new SimpleFormatter();
        fh.setFormatter(sFormatter);

        LinkedList<Double> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = sc.nextDouble();
        System.out.println("Выберите действие (+, -, *, /): ");
        char action = sc.next().charAt(0);
        System.out.println("Введите второе число: ");
        double num2 = sc.nextDouble();
        double res = actions(action, num1, num2);
        boolean flag = true;
        logging(num1, action, num2, res, logger);
        while (flag) {
            System.out.println("Выберите действие (+, -, *, /, ? - отмена операции, ! - выход): ");
            action = sc.next().charAt(0);
            num1 = res;
            if (action == '?') {
                if (linkedList.size() > 1) {
                linkedList.removeLast();
                res = linkedList.getLast();
                logging(num1, action, num2, res, logger);
                System.out.println("Отмена последней операции" + "\n" + res);
                continue;
                }   
                else {
                    System.out.println("Отмена невозможна");
                    System.out.println("Выберите действие (+, -, *, /): ");
                    action = sc.next().charAt(0);
                }
            }
            else if (action == '!') {flag = false;
                System.out.println("Выход");
                logging(num1, action, num2, res, logger);
                break;
            }
            System.out.println("Введите число: ");
            num2 = sc.nextDouble();
            res = actions(action, num1, num2);
            linkedList.addLast(res);
            logging(num1, action, num2, res, logger);
        }
    }
}
