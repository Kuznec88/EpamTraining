public class Main {
    public static void main(String[] args) {

        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 1;
        int x3 = 1;
        int y3 = 1;

        if((x1 == x2 && x2 == x3 && x1 == x3 && y1 == y2 && y2 == y3 && y1 == y3)){
            System.out.println("Точки лежат на одной прямой");
        }else {
            System.out.println("Точки НЕ лежат на одной прямой");
        }

    }
}
