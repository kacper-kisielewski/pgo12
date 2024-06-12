public class Employee extends User {
    int ID;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.ID = Main.generateID();
    }

    public Client createClient(String firstName, String lastName, BankAccount account) {
        return new Client(firstName, lastName, account);
    }

    public BankAccount openBankAccount(double balance, int numberOfTransactions) {
        return new BankAccount(balance, numberOfTransactions);
    }

    public void makeTransfer(BankAccount receiverAccount, Client client, double amount) {
        //
    }
}
