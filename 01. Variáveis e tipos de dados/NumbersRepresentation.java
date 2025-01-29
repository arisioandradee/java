public class NumbersRepresentation {
    public static void main(String[] args) {
        long number = 20_000_000_000L; //Por padrão o java reconhece como int
        double number2 = 342.2148120313; //Por padrão o java reconhece como double

        int decimal = 0b1010; //Número binário adicionamos o 0b no inicio
        System.out.println(decimal);

        int hexa = 0xAF; //Número binário adicionamos o 0x no inicio
        System.out.println(hexa);

        int oct = 0444; //Número binário adicionamos o 0 no inicio
        System.out.println(oct);
    }
}
