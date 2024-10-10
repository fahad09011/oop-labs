public class BankCustomer {
    public  String name;
    private String address;
    private SavingsAccount[] accounts;
    private int numaccounts;

    // public String getname(){
    // return name;
    // }
    // public String address(){
    // return address;
    // }

    public BankCustomer(String name, String address) {
        this.name = name;
        this.address = address;
        this.accounts = new SavingsAccount[3];
        this.numaccounts = 0;
    }
    public void addaccounts(SavingsAccount account){
        if(numaccounts < 3){
            accounts[numaccounts]=account;
            numaccounts++;
        }
        else{
            System.out.println("More than 3 accounts Cant be added");
        }
    }


    public double balance(){
        double totalbalance=0;
        for(int i=0; i<numaccounts; i++){
            totalbalance=totalbalance + accounts[i].getsavingBalance();
            System.out.println("total balance"+totalbalance);
        }
        return totalbalance;
    }
    public void summary() {
        System.out.println("Customer: " + name + "\nAddress: " + address);
        for (int i = 0; i < numaccounts; i++) {
            System.out.println("Account #" + accounts[i].getaccountNumber() +
                               " Balance: €" + accounts[i].getsavingBalance());
        }

}}
