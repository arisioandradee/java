import java.util.Locale;

public class Strings {
    public static void main(String[] args) {

        String s1 = "Hello World!"; //String não é um tipo primitivo, é uma classe
        String s2 = "2025";
        String s3 = s1 + s2;
        System.out.println(s3);

        s3 = s3.toLowerCase(Locale.ROOT);
        System.out.println(s3);

        s3 = s3.toUpperCase(Locale.ROOT);
        System.out.println(s3);
    }
}
