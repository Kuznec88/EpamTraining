public class Main {
    public static void main(String[] args) {

        Double r = 654.321;

        System.out.println(reverseNumber(r));

    }
    public static String reverseNumber(Number n) {
        String numStr = n.toString();
        StringBuilder reverser = new StringBuilder(numStr);
        reverser.reverse();
        return reverser.toString();
    }
}
