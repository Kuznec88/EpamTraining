public class Main {
    public static void main(String[] args) {

        int A = 15; // высота отверстия
        int B = 15; // ширина отверстия

        int x = 20; // высота кирпича
        int y = 30; // ширина кирпича
        int z = 60; // глубина кирпича

        if(A <= x && B <= y){
            System.out.println("Кирпич проходит сквозь отверстие");
        }else {
            System.out.println("Кирпич НЕ проходит сквозь отверстие");
        }

    }
}
