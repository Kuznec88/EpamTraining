import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (;;) {
            System.out.println("Введите секунды: ");
            Scanner scanner = new Scanner(System.in);

            int T = scanner.nextInt();

            int s = T % 60;
            int m = (T / 60) % 60;
            int h = (T / (60 * 60)) % 24;

            System.out.println(String.format("%d:%02d:%02d", h, m, s));
        }
    }
}
