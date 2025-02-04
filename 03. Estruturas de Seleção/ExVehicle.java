import java.util.Scanner;

public class ExVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade permitida na via (km/h): ");
        double velocidadePermitida = scanner.nextDouble();

        System.out.print("Digite a velocidade do veículo (km/h): ");
        double velocidadeVeiculo = scanner.nextDouble();

        double velocidadeConsiderada;
        double excessoVelocidade;
        double valorMulta;

        if (velocidadePermitida <= 100) {
            velocidadeConsiderada = velocidadeVeiculo + 7;
        } else {
            velocidadeConsiderada = velocidadeVeiculo * 1.1;
        }

        excessoVelocidade = velocidadeVeiculo - velocidadeConsiderada;

        if (excessoVelocidade > 0) {
            valorMulta = excessoVelocidade * 10;
            System.out.printf("O valor da multa é R$ %.2f\n", valorMulta);
        } else {
            System.out.println("Não houve excesso de velocidade.");
        }

        scanner.close();
    }
}