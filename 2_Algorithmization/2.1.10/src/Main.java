
//TODO Дан целочисленный массив с количеством элементов n.
// Сжать массив, выбросив из него каждый второй элемент(освободившиеся элементы заполнить нулями).Примечание.
// Дополнительный массив не использовать

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        // для наглядности заполняем массив числами от 1 до N
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        int c = 1;
        for (int i = 2; i < n; i += 2) {
            arr[c] = arr[i];
            c++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
