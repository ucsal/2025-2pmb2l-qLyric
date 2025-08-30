package br.com.mariojp.solid.lspaccounts;

public class BankService {
     public void processWithdrawal(Withdrawable account, double amount) {
        account.withdraw(amount);
    }
}