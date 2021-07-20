import java.util.Arrays;


//TODO Даны действительные числа а1, а2 ... аn. Поменять местами наименьший и наибольший элементы

public class Main {
    public static void main(String[] args) {

        int [] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = i;
            if (array[i] < min)
                min = i;

        }

        int tmp = array[max];
        array[max] = array[min];
        array[min] = tmp;
        System.out.println("Массив после изменения: " + Arrays.toString(array));

    }
}

