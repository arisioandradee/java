public class App {

    public static void main(String[] args) {

        Account a1 = new Account();
        a1.accountNumber = "000001";
        a1.accountOwner = "Arisio";
        a1.accountBalance = 980.00;

        Account a2 = new Account();
        a2.accountNumber = "000002";
        a2.accountOwner = "José";
        a2.accountBalance = 420.50;

        System.out.println(a1.accountNumber + " " + a1.accountOwner + " " + a1.accountBalance);
        System.out.println(a2.accountNumber + " " + a2.accountOwner + " " + a2.accountBalance);
    }
}
