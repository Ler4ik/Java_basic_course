import basicSyntax.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;

public class Task2Tests {

@Test
    public void calculateFactorial(){
        Task2 task2 = new Task2();
        Assertions.assertFalse(task2.factorial(3).equals(6));
    }

}
