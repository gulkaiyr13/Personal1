public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(123456, "Gulkaiyr Toktomusheva");

        account.deposit(1000.0);
        account.withdraw(500.0);

        System.out.println("Transaction History for " + account.getAccountHolder());
        account.printTransactionHistory();

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Current Balance: " + account.getBalance());
    }
}
