import basicSyntax.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Tests {

    @Test
    public void palindromeIsTrue(){
        Task1 task1 = new Task1();

        Assertions.assertTrue(task1.isPalindrome("Madam, I'm Adam!"));
    }

    @Test
    public void palindromeIsFalse(){
        Task1 task1 = new Task1();

        Assertions.assertFalse(task1.isPalindrome("Miss, I'm Adam!"));
    }
}
