public class Employee extends User {
    int ID;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.ID = Main.generateID();
    }

    public Client createClient(String firstName, String lastName, BankAccount account) {
        return new Client(firstName, lastName, account);
    }

    public BankAccount openBankAccount() {
        return new BankAccount();
    }

    public BankAccount openBankAccount(double balance) {
        return new BankAccount(balance);
    }

    public Transaction makeTransfer(Client client, BankAccount receiverAccount, double amount) throws AccountOperationException {
        return new Transaction(client.getAccount(), receiverAccount, amount);
    }
}
