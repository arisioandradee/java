import java.util.Scanner;

public class ExTabuada {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Informe o número que deseja ver a tabuada: ");
        numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + "*" + i + "=" + numero*i);
        }

    }
}
