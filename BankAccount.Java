public class BankAccount {
    private double checkingBalance;
    private double savingBalance;
    private static int numberOfAccounts = 0;
    private static double totalAmountOfMoney = 0;

    public BankAccount() {
        this.checkingBalance = 0;
        this.savingBalance = 0;
        BankAccount.numberOfAccounts++;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void deposit(String account, double amount) {
        if (account.equals("checking")) {
            this.checkingBalance += amount;
            BankAccount.totalAmountOfMoney += amount;
        }
        else if (account.equals("saving")) {
            this.savingBalance += amount;
            BankAccount.totalAmountOfMoney += amount;
        }
        else {
            System.out.println("Invalid acount type");
        }
    }

    public void withdraw(String account, double amount) {
        if (account == "checking" && this.checkingBalance >= amount) {
            this.checkingBalance -= amount;
            BankAccount.totalAmountOfMoney -= amount;
        }
        else if (account == "saving" && this.savingBalance >= amount) {
            this.savingBalance -= amount;
            BankAccount.totalAmountOfMoney -= amount;
        }
        else if (account == "checking" && this.checkingBalance < amount) {
            System.out.println("Insufficient funds");
        }
        else if (account == "saving" && this.savingBalance < amount) {
            System.out.println("Insufficient funds");
        }
        else {
            System.out.println("Invalid acount type");
        }
    }

    public static double getTotalAmountOfMoney() {
        return BankAccount.totalAmountOfMoney;
    }
}