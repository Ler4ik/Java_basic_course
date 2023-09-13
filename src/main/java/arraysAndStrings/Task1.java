package arraysAndStrings;

public class Task1 {

    /* Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
    Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая).
    При определении "палиндромности" строки должны учитываться только буквы и цифры.
    А пробелы, знаки препинания, а также регистр символов должны игнорироваться.
    Гарантируется, что в метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания).
    Т.е. русских, китайских и прочих экзотических символов в строке не будет.*/

    public static void main(String[] args) {
        isPalindrome("Madam, I'm Adam!");
    }

    public static boolean isPalindrome(String text) {

        text = text.replaceAll("\\p{Punct}|\\p{Space}", "");

        return text.equalsIgnoreCase(new StringBuilder(text).reverse().toString());
    }

}
