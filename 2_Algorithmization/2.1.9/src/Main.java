
//TODO В массиве целых чисел с количеством элементов N, найти наиболее частов встречающееся число.
// Если таких чисел несколько,то определить наименьшее из них.

public class Main {
    public static void main(String[] args) {

        int [] arr = new int[] {1,2,3,5,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int res = 0;
        int[] counts = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                    count++;
            }
            counts[i] = count;
            if (counts[i] == counts[res])
                res = arr[res] > arr[i] ? i : res;
            else
                res = count > counts[res] ? i : res;
        }
        System.out.println("Наиболее частов встречающееся число в массиве: " + arr[res]);
    }
    }

