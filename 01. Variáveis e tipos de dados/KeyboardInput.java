public class KeyboardInput {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Texto 1: ");
        String text1 = scanner.nextLine();
        System.out.print("Texto 2: ");
        String text2 = scanner.nextLine();

        System.out.println(text1 + " " + text2);

    }
}
