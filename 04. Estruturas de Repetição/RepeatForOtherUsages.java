public class RepeatForOtherUsages {

    public static void main(String [] args){

        int i, j;

        for (i = 0, j = 10; i <= 10; i++, j--){ //pode-se usar mais de uma varivel dentro do for
            System.out.println("i:" + i + " j:" + j); //porem ambas tem que ser declarada fora do for
        };
    }
}
