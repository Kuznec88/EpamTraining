import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntUnaryOperator;



//TODO Дана последовательность действительных чисел а1, а2...
// Заменить все ее члены, большие данного Z этим числом. Подсчитать количество замен



public class Main {
    public static void main(String[] args) {
        for (; ; ) {

            int count = 0; //Количество замен
            int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            System.out.println("Введите число от 0 до " + array.length);
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt(); // Значение, на которое нужно заменить

            for (int i = 0; i < array.length; i++) {
                if (array[i] > value) {
                    array[i] = value;
                    count++;
                }
            }
            System.out.println("Массив после замены: " + Arrays.toString(array) + " количество замен: " + count);
        }
    }
}
