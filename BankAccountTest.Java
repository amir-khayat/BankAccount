public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.deposit("saving", 100);
        // account1.deposit("checking", 1200);
        // account1.withdraw("checking", 1000);
        // account1.withdraw("checking", 300);

        System.out.println(account1.getSavingBalance());
    }
}