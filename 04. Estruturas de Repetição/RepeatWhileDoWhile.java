public class RepeatWhileDoWhile {

    public static void main(String [] args){

        int i = 0, j = 0;

        while(i <= 10){
            System.out.println(i);
            i += 1;
        }

        do {
            System.out.println(j);
            j += 1;
        } while(j <= 10);
    }
}
