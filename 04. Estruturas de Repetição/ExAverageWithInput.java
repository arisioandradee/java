import java.util.Scanner;

public class ExAverageWithInput {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double nota1 = 0.0, nota2 = 0.0, nota3 = 0.0, media = 0.0;

        System.out.println("Informe a nota da primeira prova; ");
        nota1 = sc.nextDouble();
        System.out.println("Informe a nota da primeira prova; ");
        nota2 = sc.nextDouble();
        System.out.println("Informe a nota da primeira prova; ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) /3;

        System.out.println("A média final do aluno é:" + media);
    }
}
