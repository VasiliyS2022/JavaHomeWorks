import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook(1, "asus", 4, 512, "dos", "black");
        NoteBook notebook2 = new NoteBook(2, "hp", 12, 1024, "win10", "black");
        NoteBook notebook3 = new NoteBook(3, "lenovo", 16, 1024, "win11", "black");
        NoteBook notebook4 = new NoteBook(4, "hp", 32, 2048, "win11", "black");
        NoteBook notebook5 = new NoteBook(5, "hp", 8, 1024, "win10", "silver");
        NoteBook notebook6 = new NoteBook(6, "asus", 16, 512, "dos", "silver");

        Scanner sc = new Scanner(System.in,"ibm866");
        System.out.println("Вас приветствует магазин ноутбуков 'МНБ'!");
        while (true) {
            System.out.println("Выберите параметры поиска: ");
            System.out.println("1 - сортировка по ОЗУ");
            System.out.println("2 - сортировка по SSD");
            System.out.println("3 - сортировка по OS");
            System.out.println("4 - сортировка по цвету");
            System.out.println("5 - выход");
            Integer choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Введите значение ОЗУ: ");
                int ram = sc.nextInt();
                if (ram <= 4) {
                    System.out.println(notebook1.toString());
                }
                else if (ram > 4 & ram <= 8) {
                    System.out.println(notebook5.toString());
                }
                else if (ram > 8 & ram <= 12) {
                    System.out.println(notebook2.toString());
                }
                else if (ram > 12 & ram <= 16) {
                    System.out.println(notebook3.toString() + "\n" + notebook6.toString());
                }
                else if (ram >= 16 & ram <= 32) {
                    System.out.println(notebook4.toString());
                }
                else {
                    System.out.println("Ноутбуки с данным значением отсутствуют!");
                }
            }
            else if (choice == 2) {
                System.out.println("Введите значение SSD: ");
                Integer ssd = sc.nextInt();
                if (ssd <= 512) {
                    System.out.println(notebook1.toString() + "\n" + notebook6.toString());
                }
                else if (ssd > 512 & ssd <= 1024) {
                    System.out.println(notebook2.toString() + "\n" + notebook3.toString() + "\n" + notebook5.toString());
                }
                else if (ssd > 1024 & ssd <= 2048) {
                    System.out.println(notebook4.toString());
                }
                else {
                    System.out.println("Ноутбуки с данным значением отсутствуют!");
                }
            }
            else if (choice == 3) {
                System.out.println("Введите название OS: ");
                String os = sc.next();
                if(os.equals("dos")) {
                    System.out.println(notebook1.toString() + "\n" + notebook6.toString());
                }
                else if(os.equals("win10")) {
                    System.out.println(notebook2.toString() + "\n" + notebook5.toString());
                }
                else if(os.equals("win11")) {
                    System.out.println(notebook3.toString() + "\n" + notebook4.toString());
                }
                else {
                    System.out.println("Ноутбуки с данным значением отсутствуют!");
                }
            }   
            else if (choice == 4) {
                System.out.println("Введите значение цвета");
                String color = sc.next();
                if(color.equals("black")) {
                    System.out.println(notebook1.toString() + "\n" + notebook2.toString() + "\n" + notebook3.toString() + "\n" + notebook4.toString());
                }
                else if(color.equals("silver")) {
                    System.out.println(notebook5.toString() + "\n" + notebook6.toString());
                }
                else {
                    System.out.println("Ноутбуки с данным значением отсутствуют!");
                }
            }
            else if (choice == 5) {
                sc.close();
                System.out.println("До свидания, ждем Вас еще!");
                break;
            } 
        }
    }
}