
//TODO Дан массив вещественных чисел, размерность которого N. Подсчитать сколько в нем
// отрицательных, положительных и нулевых элементов.

public class Main {
    public static void main(String[] args) {

        int [] array = new int[]{-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10};

        int countMinus = 0;
        int countPlus = 0;
        int countNull = 0 ;

        for(int i : array){

            if(i == 0){
                countNull++;
            }
            if(i < 0){
                countMinus++;
            }
            if(i > 0){
                countPlus++;
            }
        }
        System.out.println("В массиве содержится:" + "\n" + "чисел меньше нуля: " + countMinus + "\n"
                + "чисел больше нуля: " + countPlus + "\n" + "нулей " + countNull);
    }
}
