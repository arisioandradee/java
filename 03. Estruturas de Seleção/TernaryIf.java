public class TernaryIf {
    public static void main(String[] args) {
        int age = 10;
        String text;

        // Comentário: Esta parte mostra como usar um if-else tradicional
        // if (age >= 18) {
        //     text = "Maior de idade";
        // } else {
        //     text = "Menor de idade";
        // }

        // Usando o operador ternário
        String text = age >= 18 ? "Maior de idade" : "Menor de idade";

        System.out.println(text);
    }
}