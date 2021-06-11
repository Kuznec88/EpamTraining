public class Main {
    public static void main(String[] args) {

        double a = 0; //начало отрезка
        double b = 10; // конец отрезка
        double h = 1; //шаг
        double x = 0; //текущее значение аргумента
        int i = 0; //номер шага
        double F = 0;

        while (x <= b)
        {
            x = a + i * h;
            if (Math.cos(x)==0) {
                System.out.println( x+" делить на ноль некрасиво"  );
            }
            else{
                F = x/Math.cos(x);
                System.out.println( x+" "+ F  );
            }
            i++;
        }
    }
}
