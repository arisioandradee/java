public class ExDayOfWeek {

    public static void main(String[] args) {

        int day = 7;
        String nameDay;

        nameDay = switch(day){
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Dia inválido!";
        };

        System.out.println(nameDay);
    }
}
