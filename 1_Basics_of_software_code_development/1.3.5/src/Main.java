import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        for (; ; ) {

            System.out.println("Введите положительное число e: ");

            Scanner scanner = new Scanner(System.in);
            Double e = scanner.nextDouble();

            double sum = 0;
            double n = 100;

            for (int i = 0; i < n; i++) {
                double a = (1 / (Math.pow(2, i))) + (1 / (Math.pow(3, i)));
                if (Math.abs(a) >= e) {
                    sum += a;
                    n++;
                }
            }
            System.out.println(sum);
        }
    }
}