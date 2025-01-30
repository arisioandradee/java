public class OperatorRelational {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int c = 20;

        boolean valor = a == b; //true
        boolean valor2 = a == c; //false
        System.out.println(valor);
        System.out.println(valor2);

        System.out.println(a != b); //false
        System.out.println(a > b); //false
        System.out.println(a >= b); //true

    }
}
