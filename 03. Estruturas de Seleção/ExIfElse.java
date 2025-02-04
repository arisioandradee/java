public class ExIfElse {

    public static void main(String[] args) {

        int x = 10;

        if (x % 2 == 0){
            x += 5;
        } else{
            x *= 2;
        }
        System.out.println("O novo valor de x é: " + x);
    }
}
