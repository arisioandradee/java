public class ExerciceTemperature {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit: ");
        double tf = Double.parseDouble(scanner.nextLine());

        double tc = ((tf - 32) /9) * 5;

        System.out.printf("A temperatura convertida: %.2f°C%n", tc);

    }
}
