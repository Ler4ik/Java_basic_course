package basicSyntax;

import java.math.BigInteger;
import java.util.Scanner;

public class Task2 {

    /*
     Реализуйте метод, вычисляющий факториал заданного натурального числа.
     Поскольку это очень быстро растущая функция, то даже для небольших
     N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
    */


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(factorial(value));

    }

    public static BigInteger factorial(int value){

        BigInteger result = new BigInteger("1");

        for(int i = 1; i <= value; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
