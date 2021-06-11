import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (; ; ) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите значение X: ");

            int x = scanner.nextInt();

            if(x <= 3){
                double solution = Math.pow(x, 2) - 3 * x + 9;
                System.out.println("Если Х меньше либо равен 3, ответ такой: " + solution);
            }
            if(x > 3){
                double solution1 = 1 / (Math.pow(x, 3) + 6);
                System.out.println("Если Х больше 3, ответ такой: " + solution1);
            }
        }
    }
}
