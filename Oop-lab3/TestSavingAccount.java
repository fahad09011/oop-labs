public class TestSavingAccount {
    public static void main(String[] args) {

        SavingsAccount.modifyInterestRate(0.4);
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        saver1.calculateMonthlyInterestRate();
        saver2.calculateMonthlyInterestRate();

        System.out.println("account number   "+saver1.getaccountNumber() +" balance  "+saver1.getsavingBalance());

        System.out.println("account number   "+saver2.getaccountNumber() +" balance  "+saver2.getsavingBalance());

        SavingsAccount.modifyInterestRate(0.5);
        SavingsAccount newsaver1 = new SavingsAccount(2000);
        SavingsAccount newsaver2 = new SavingsAccount(3000);

        newsaver1.calculateMonthlyInterestRate();
        newsaver2.calculateMonthlyInterestRate();

        System.out.println("account number   "+newsaver1.getaccountNumber() +" balance  "+newsaver1.getsavingBalance());

        System.out.println("account number   "+newsaver2.getaccountNumber() +" balance  "+newsaver2.getsavingBalance());
    }
}
