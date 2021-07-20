import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                int sum = 0;

                int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

                System.out.println("Введите натуральное число от 0 до " + array.length + ":");

                Scanner scanner = new Scanner(System.in);
                int k = scanner.nextInt();

                for (int i = 0; i < array.length; i++) {
                    if (array[i] % k == 0) {
                        sum = sum + array[i];
                    }
                }
                System.out.println("Cумма элементов кратных 'k' равна " + sum);
            }
    }
