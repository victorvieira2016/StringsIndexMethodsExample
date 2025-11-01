//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringIndexMethods {
    public static void main(String[] args) {
        String letters = "abcdmajetgakdmxmajkt0ptmdfkmakmsdkfmkasmgkcin";

        System.out.printf("'c' is located at index %d%n", letters.indexOf('c'));
        System.out.printf("'a' is located at index %d%n", letters.indexOf('a', 1));
        System.out.printf("'$' is located at index %d%n%n", letters.indexOf('$'));

        System.out.printf("last 'c' is located at index %d%n", letters.lastIndexOf('c'));
        System.out.printf("last 'a' is located at index %d%n", letters.lastIndexOf('a', 25));
        System.out.printf("last '$' is located at index %d%n%n", letters.lastIndexOf('$'));

        System.out.printf("'maj' is located at index %d%n", letters.indexOf("maj"));
        System.out.printf("'maj' is located at index %d%n", letters.indexOf("maj", 15));
        System.out.printf("'hello' is located at index %d%n%n", letters.indexOf("hello"));

        System.out.printf("last 'maj' is located at index %d%n", letters.lastIndexOf("maj"));
        System.out.printf("last 'maj' is located at index %d%n", letters.lastIndexOf("maj", 15));
        System.out.printf("last 'hello' is located at index %d%n", letters.lastIndexOf("hello"));
    }
}