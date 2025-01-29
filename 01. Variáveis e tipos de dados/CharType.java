public class CharType {
    public static void main(String[] args) {

        char letra = 'a'; //Internamente o char é armazenado como número
        System.out.println(letra);

        //ASCII Table
        int i = (int) letra;
        System.out.println(i);

        char c2 = 'A' + 2;
        System.out.println(c2);

        char c3 = 39;
        System.out.println(c3);

        //char c4 = -10     -> Erro pois char tem que ser positivo
    }
}
