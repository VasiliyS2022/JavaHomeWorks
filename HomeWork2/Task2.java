// 2. Дана строка (получение через обычный текстовый файл!!!).
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class task2 {
    public static void main(String[] args) throws IOException {
        File file = new File("Task2.txt");
        FileReader fr = new FileReader(file);
        BufferedReader readText = new BufferedReader(fr);
        String[] text = new String[3];
        String line = readText.readLine();
        while (line != null){
            String[] array = line.split(",");
            for (int i = 0; i < array.length; i++) {
                String[] array2 = array[i].split(":");
                text[i] = array2[1];
            }
            StringBuilder sb = new StringBuilder("Студент");
            sb.append(text[0]);
            sb.append(" получил");
            sb.append(text[1]);
            sb.append(" по предмету");
            sb.append(text[2]);
            System.out.println(sb.toString());            
            line = readText.readLine();
        }
    }
}
