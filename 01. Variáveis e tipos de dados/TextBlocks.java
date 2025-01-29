public class TextBlocks {
    public static void main(String[] args) {
        System.out.println("Olá, \ntudo \nbem?\n");

        String nome = "Arisio";
        //Text Blocks
        String s = String.format(""" 
                Olá %s,
                     seja bem-vindo!
                """, nome);

        System.out.println(s);
    }
}
