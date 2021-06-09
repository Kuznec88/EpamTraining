public class Main {
    public static void main(String[] args) {

        double x = 160;
        double y = 30;

        double firstDigit = Math.sin(x) + Math.cos(y);
        double secondDigit = Math.cos(x) - Math.sin(y);
        double thirdDigit = Math.tan(x * y);

        double solution = (firstDigit / secondDigit) * thirdDigit;

        System.out.println(solution);

    }
}
