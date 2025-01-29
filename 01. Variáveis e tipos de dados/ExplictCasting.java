public class ExplictCasting {
    public static void main(String[] args) {

        double d = 240.56;
        int i = (int)d; //Aqui você assumi os riscos e vai contra o compilador, mas funciona
        System.out.println(i);

        long l = 23901202438129311L;//Totalmente inviavel
        int i2 = (int)l;
        System.out.println(i2);

        long l2 = 10L;
        int i3 = (int)l2;
        System.out.println(i3);
    }
}
