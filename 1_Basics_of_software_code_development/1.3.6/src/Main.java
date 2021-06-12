import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (; ; ) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите символ: ");

            String symbol = scanner.nextLine();


            System.out.println("Обозначение символа в кодировке: " + symbol.hashCode());
        }
    }
}


/*
Честно говоря не понял задачу... Решил ее способом выше, но возможно надо было решать способом который ниже ↓
Или как вариант раз подразумеваются циклы, то надо было прогнать всю таблицу через цикл и вывести каждый символ.

            String s = "admin";
            try {
                byte[] bytes = s.getBytes("US-ASCII");
                System.out.println(bytes);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

        }

 */


