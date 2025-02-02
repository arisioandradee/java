public class ExerciceMedia {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Informe a 1° nota: ");
        double nota1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Informe a 2° nota: ");
        double nota2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Informe a 3° nota: ");
        double nota3 = Double.parseDouble(scanner.nextLine());

        double avg = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média final é: "+ avg);

    }
}
