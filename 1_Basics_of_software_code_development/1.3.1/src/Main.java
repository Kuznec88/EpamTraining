import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (; ; ) {
            System.out.print("Введите любое целое положительное число: ");
            Scanner scanner = new Scanner(System.in);
            int digit = scanner.nextInt();
            int solution = 0;
            for (int i = 1; i <= digit; i++) {
                solution = solution + i;
            }
            System.out.println("Сумма чисел составляет: " + solution);
        }
    }
}
