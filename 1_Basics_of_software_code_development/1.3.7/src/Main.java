import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (; ; ) {
            System.out.println("Введите первое число: ");

            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();

            System.out.println("Введите второе число: ");
            int n = scanner.nextInt();


            if (n < m) {
                System.out.println("Первое число не может быть больше второго");
            } else {
                for (int i = m; i <= n; i++)

                    calculate(i);
            }
        }
    }

    public static void calculate(int a) {
        System.out.println("Делители для числа " + a + "(исключая само число и 1): ");

        for (int i = 2; i < a; i++)

            if (a % i == 0)

                System.out.println(i + " ");

        System.out.println("");
    }
}

