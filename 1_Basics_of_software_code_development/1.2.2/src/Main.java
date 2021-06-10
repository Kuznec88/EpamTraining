import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 255;
        int b = 455;
        int c = 555;
        int d = 777;

        if (a < b && c < d && a > c) {
            System.out.println(a);
        }
        else if (a > b && c > d && b > d) {
            System.out.println(b);

        }
    }
}


/*

    Т.к задача подразумевает ветвление сделал ее так,
    но в данной ситуации было бы логичнее делать ее представленным ниже способом

for (; ; ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();
        System.out.println("Введите четвертое число: ");
        int d = scanner.nextInt();

        int minDigit = Math.min(a,b);
        int minDigit1 = Math.min(c,d);

        int solution = Math.max(minDigit, minDigit1);


        System.out.println(solution);

 */