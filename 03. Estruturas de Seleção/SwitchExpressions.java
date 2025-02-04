public class SwitchExpressions {

    public static void main(String[] args) {

        int month = 5;

        int days = switch (month){ //é obrigado a ter um case associado!
            case 1, 3, 5, 7, 8, 10, 12-> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 0;
        };
        System.out.println("O mês " + month + " possui " + days + " dias!");
    }
}
