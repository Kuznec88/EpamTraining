import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 787;
        int b = 455;
        int c = 515;
        int d = 777;

        int min;
        int min1;


        if (a < b) {
            min = a;
            System.out.println("Минимальное число из пары " + min);
        } else {
            min = b;
            System.out.println("Минимальное число из пары " + min);
        }
        if (c < d) {
            min1 = c;
            System.out.println("Минимальное число из пары " + min1);
        } else {
            min1 = d;
            System.out.println("Минимальное число из пары " + min1);
        }
        if(min > min1){
                System.out.println("Максимальное число из 2-х пар: " + min);
        } else {
                System.out.println("Максимальное число из 2-х пар: " + min1);
        }
    }
}


/*

    Т.к задача подразумевает ветвление сделал ее так,
    но в данной ситуации было бы логичнее делать ее представленным ниже способом.
    Так же в решении выше можно было сделать сканнер, но решил не делать т.к показал его ниже и
    в предыдущих задачах.

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