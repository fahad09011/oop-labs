class SavingsAccount {
    private static double annaulInterestRate;
    private static  int accountCounter = 1;
    private int accountNumber;
    private double savingBalance;

    public  SavingsAccount(double savingBalance) {
        this.accountNumber = accountCounter++;
        this.savingBalance = savingBalance;
    }


    public void calculateMonthlyInterestRate() {
        double monthlyInterest = (savingBalance * annaulInterestRate) / 12;
        savingBalance = savingBalance + monthlyInterest;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annaulInterestRate = newInterestRate;
    }

    public int getaccountNumber(){
        
    // for(int i=0 ; i<100 ; i++){
    //     accountNumber=i;
    //     System.out.println(accountNumber);
    // }
    return accountNumber;
    }

    public double getsavingBalance(){
        return savingBalance;
    }

}
