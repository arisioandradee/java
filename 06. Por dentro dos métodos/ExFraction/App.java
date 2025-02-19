package ExFraction;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Fraction f1 = new Fraction();
        f1.set(5,5);
        f1.show();
        
        Fraction f2 = new Fraction();
        f2.set(3,5);
        f2.show();

        Fraction f3 = f1.multiply(f2);
        f3.show();

    }
}
