import br.com.mariojp.solid.lspaccounts.BankService;
import br.com.mariojp.solid.lspaccounts.CheckingAccount;
import br.com.mariojp.solid.lspaccounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount();
        checking.deposit(100);

        BankService bankService = new BankService();
        bankService.processWithdrawal(checking, 30);

        System.out.println("Checking balance: " + checking.getBalance()); // 70.0

        SavingsAccount savings = new SavingsAccount();
        savings.deposit(100);

        System.out.println("Savings balance: " + savings.getBalance()); // 100.0
    }
}