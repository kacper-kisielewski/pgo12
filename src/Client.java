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

    public Transaction makeTransfer(BankAccount receiverAccount, double amount) throws AccountOperationException {
        return account.makeTransfer(receiverAccount, amount);
    }

    public Transaction makeTransfer(Client receiverAccount, double amount) throws AccountOperationException {
        return account.makeTransfer(receiverAccount.getAccount(), amount);
    }

    public void makeDeposit(double amount) {
        account.makeDeposit(amount);
    }

    public BankAccount getAccount() {
        return account;
    }
}
