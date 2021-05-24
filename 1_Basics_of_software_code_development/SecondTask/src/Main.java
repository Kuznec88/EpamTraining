public class Main {
    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int c = 3;

        double firstDigit = Math.sqrt(((Math.pow(b,2)) + (4 + a + c)));
        double secondDigit = Math.pow(a,3) * c;
        double thirdDigit = Math.pow(b,-2);

        double x = ((b + firstDigit) / (2 * a) - (secondDigit + thirdDigit));

        System.out.println(x);

    }
}
