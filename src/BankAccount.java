public class BankAccount implements AccountOperations {
    double balance = 0;
    int numberOfTransactions = 0;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public Transaction makeTransfer(BankAccount receiverAccount, double amount) throws AccountOperationException {
        return new Transaction(this, receiverAccount, amount);
    }

    @Override
    public void makeDeposit(double amount) {
        this.balance += amount;
    }
}
