import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (; ; ) {

            Scanner scanner = new Scanner(System.in);

            int xRangeMinus = -4;
            int xRangeplus = 4;
            int yRangeMinus = -3;
            int yRangePlus = 4;

            System.out.println("Введите точку X: ");
            int xPoint = scanner.nextInt();

            System.out.println("Введите точку Y: ");
            int yPoint = scanner.nextInt();

            boolean inRangeOrOutRange = (xPoint >= xRangeMinus && xPoint <= xRangeplus) && (yPoint >= yRangeMinus && yPoint <= yRangePlus) || (xPoint <= xRangeMinus && xPoint >= xRangeplus) && (yPoint <= yRangeMinus && yPoint >= yRangePlus);

            System.out.println("Результат вычисления: " + inRangeOrOutRange);


        }
    }
}