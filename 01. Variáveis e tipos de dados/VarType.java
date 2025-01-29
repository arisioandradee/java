public class VarType {
    public static void main(String[] args) {
        int a = 10;
        var b = 10; //Var serve para que não seja necessário colocar o tipo da variavel

        //b = 10.0   -> porém mesmo assim não é possível modificar o tipo posteriormente

        System.out.println(b);
    }
}
