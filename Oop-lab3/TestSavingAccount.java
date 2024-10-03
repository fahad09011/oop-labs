public class TestSavingAccount {
    public static void main(String[] args) {

        SavingsAccount.modifyInterestRate(0.4);
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(4000);

        saver1.calculateMonthlyInterestRate();
        saver2.calculateMonthlyInterestRate();

        System.out.println("account num,ber   "+saver1.getaccountNumber() +" balance  "+saver1.getsavingBalance());

        System.out.println("account num,ber   "+saver2.getaccountNumber() +" balance  "+saver2.getsavingBalance());

    }
}
