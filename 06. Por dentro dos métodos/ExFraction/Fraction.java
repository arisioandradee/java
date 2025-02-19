package ExFraction;

public class Fraction {

    int n;
    int d;

    void set(int n, int d){
        this.n = n;
        this.d = d;
    }

    Fraction multiply(Fraction f1 ){
        Fraction f2 = new Fraction();
        f2.n = n * f1.n;
        f2.d = d * f1.d;
        return f2;
    }

    void show(){
        System.out.println(n + "/" + d);
    }
}
