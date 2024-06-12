public class Client extends User {
    private BankAccount account;
    int ID;

    public Client(String firstName, String lastName, BankAccount account) {
        super(firstName, lastName);
        this.account = account;
        this.ID = Main.generateID();
    }

    public double checkBalance() {
        return account.checkBalance();
    }

    public void makeTransfer(AccountOperations receiverAccount, double amount) throws AccountOperationException {
        account.makeTransfer(receiverAccount, amount);
    }

    public void makeDeposit(double amount) {
        account.makeDeposit(amount);
    }
}
