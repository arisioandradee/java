package JavaOO;

public class Account {
    String accountNumber;
    String accountOwner;
    double accountBalance;

    void printBalance(){
        System.out.println("Saldo da conta: R$"+accountBalance);
    }

    boolean withdrawh(double amount){
        if (amount > 0){
            accountBalance -= amount;
            return true;
        }else{
            return false;
        }
    }

    void deposit(double amount){
        if (amount <= 0){
            System.out.println("Erro, seu valor de deposito é menor que zero!");
        }else{
            accountBalance += amount;
        }
    }

    void transfer(Account targetAccount, double amount){
        withdrawh(amount);
        targetAccount.deposit(amount);
    }


}
