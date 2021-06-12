import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (; ; ) {

            int[] arr = new int[10];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");

            int a = Integer.parseInt(scanner.nextLine());
            while (a != 0) {
                arr[a % 10]++;
                a /= 10;
            }
            System.out.println("Введите второе число: ");
            int b = Integer.parseInt(scanner.nextLine());
            while (b != 0) {
                if (arr[b % 10] != 0)
                    System.out.println("Цифры входящие в первое и второе число: " + b % 10);
                b /= 10;
            }
        }
    }
}
