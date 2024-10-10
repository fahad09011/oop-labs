public class BankCustomerTest {
    public static void main(String[] args) {
        // Create different SavingsAccount objects
        SavingsAccount saver1 = new SavingsAccount(1500.00);
        SavingsAccount saver2 = new SavingsAccount(2500.00);
        SavingsAccount saver3 = new SavingsAccount(1000.00);
        
        // Create a BankCustomer object
        BankCustomer customer1 = new BankCustomer("fahad", "enniscorthy");

        // Add accounts to the customer
        customer1.addaccounts(saver1);
        customer1.addaccounts(saver2);
        customer1.addaccounts(saver3);
        // customer1.addaccounts(saver4);

        // Display the summary of the customer's accounts
        customer1.summary();

        // Calculate and display the total savings
        System.out.println("Total savings for " + customer1.name + ": €" + customer1.balance());

        // SavingsAccount saver4 = new SavingsAccount(500.00);
        // customer1.addaccounts(saver4);  
        // customer1.summary();
    }
}
