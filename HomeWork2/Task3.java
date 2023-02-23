// 3. Напишите метод, который принимает на вход строку (String) и определяет является ли строка 
// палиндромом (возвращает boolean значение).

import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        boolean res = true;
        Scanner sc = new Scanner(System.in, "ibm866");
        System.out.print("Введите строку для проверки: ");
        String str = sc.nextLine();
        String str1 = str;
        str = str.replaceAll("\\s+", "").toLowerCase();
        StringBuilder reverse = new StringBuilder(str).reverse();
        int count = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != reverse.charAt(i)) {
                break;
            }
            else {
                count++;
            }
        }
        if (count == str.length() / 2) {
            System.out.printf("Строка " + "'%s'" + " является палиндромом\n", str1);
            res = true;
        }
        else {
            System.out.printf("Строка " + "'%s'" + " не является палиндромом\n", str1);
            res = false;
        }
        System.out.println(res);
    }
}
