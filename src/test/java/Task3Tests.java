import basicSyntax.Task3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3Tests {

    @Test
    public void mergeArraysTest(){
        Task3 task3 = new Task3();
        int[] a1 = {0, 2, 2, 10, 10, 20};
        int[] a2 = {1,3};

        int[] a3 = task3.mergeArrays(a1, a2);
        int[] expected = {0, 1, 2, 2, 3, 10, 10, 20};

        Assertions.assertArrayEquals(a3, expected);
    }
}
