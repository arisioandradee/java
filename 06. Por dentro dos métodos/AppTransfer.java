package JavaOO;

public class AppTransfer {

    public static void main(String[] args) {
        Account c1 = new Account();
        Account c2 = new Account();

        c1.deposit(100);
        c2.deposit(50);

        c1.transfer(c2,50.0);
        c2.printBalance();
    }
}
