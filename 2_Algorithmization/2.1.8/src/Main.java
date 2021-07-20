//TODO Дана последовательность целых чисел a1,a2,...an. Образовать новую последовательность,
// выбросив из исходной те члены, которые равны min(a1, a2,...an).

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 15;
        Random rand = new Random();
        int[] ints = new int[n];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = rand.nextInt(20) - 10;
            System.out.print(ints[i] + ", ");
        }
        System.out.println();
        int minVal = Integer.MAX_VALUE;
        for (int tmpEl : ints) minVal = Math.min(minVal, tmpEl);
        int countMinElem = 0;
        for (int tmpEl : ints)
            if (tmpEl == minVal) countMinElem++;

        int[] newA = new int[n - countMinElem];
        int indexNewArray = 0;
        for (int tmpEl : ints)
            if (tmpEl != minVal) {
                newA[indexNewArray++] = tmpEl;
                System.out.print(tmpEl + ", ");
            }
    }
}