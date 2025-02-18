package JavaOO;

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

        a1.deposit(50);
        a1.printBalance();

        //boolean sucess = a1.withdrawh(-500);
        //if(!sucess){
        //    System.out.println("Ops, depósito inválido!");
        //}
    }
}
