

//TODO Даны действительные числа а1,а2... аn Найти max(a1 + a2*n, a2 + a2 -1, an + an - 1)

public class Main {
    public static void main(String[] args) {

        System.out.println(getMaxSum(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13}));

    }
    public static int getMaxSum(int[] array) {
        int maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }

        }
        return maxSum;
    }
}