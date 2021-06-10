import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        for (; ; ) {
            Scanner scanner = new Scanner(System.in);



            System.out.println("Введите первую сторону: ");
            int firstAngle = scanner.nextInt();
            System.out.println("Введите вторую сторону: ");
            int secondAngle = scanner.nextInt();
            System.out.println("Введите третью сторону: ");
            int thirdAngle = scanner.nextInt();

            triangle(firstAngle, secondAngle, thirdAngle);

        }
    }

        public static void triangle ( int firstAngle, int secondAngle, int thirdAngle){

            String exist = "Треугольник существует";
            String rectangular = " и он прямоугольный";
            String notExist = "Треугольника не существует";

            if ((firstAngle < secondAngle + thirdAngle) && (secondAngle < thirdAngle + firstAngle) && (thirdAngle < firstAngle + secondAngle))
            {
                System.out.println(exist);
            }
            else if(firstAngle == 90 || secondAngle == 90 || thirdAngle == 90)
            {
                System.out.println(exist + rectangular);
            } else {
                System.out.println(notExist);
            }
        }
    }
