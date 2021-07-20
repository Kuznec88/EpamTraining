import java.util.Arrays;
import java.util.Random;

//TODO Задана последовательность N вещественных чисел. Вычислить сумму чисел, поредковые номера которых являются простыми числами

public class Main {
    public static void main(String[] args) {
        double[] arr = new Random().doubles(5, 0., 20.).toArray();
        double sum = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (isPrime(i)) {
                sum += arr[i + 1];
                System.out.println(arr[i + 1]);
            }
        }
        System.out.println("Summ: " + sum);
    }

    public static boolean isPrime ( int x){
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}
