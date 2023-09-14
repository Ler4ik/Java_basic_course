package basicSyntax;

public class Task3 {
    /*
    Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив.
    Массивы могут быть любой длины, в том числе нулевой.
    Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность:
    он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив.
    Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.
    К сожалению, автоматически это не проверить, так что это остается на вашей совести
    */

    public static void main(String[] args){
        int[] a1 = {0, 2, 2, 10, 10, 20};
        int[] a2 = {1,3};

        mergeArrays(a1, a2);
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] a3 = new int[a1.length + a2.length];
        int i = 0, j = 0;

        for(int k = 0; k < a3.length; k++){

            if(i >= a1.length){
                a3[k] = a2[j];
                j++;
                continue;
            }

            if(j >= a2.length){
                a3[k] = a1[i];
                i++;
                continue;
            }

            if(a1[i] <= a2[j]){
                a3[k] = a1[i];
                i++;
            } else if(a1[i] > a2[j]){
                a3[k] = a2[j];
                j++;
            }
        }

        for(int f: a3){
            System.out.println(f);
        }
        return a3;
    }

}
