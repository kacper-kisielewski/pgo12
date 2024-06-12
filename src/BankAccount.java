public class BankAccount implements AccountOperations {
    double balance = 0;
    int numberOfTransactions = 0;

    public BankAccount(double balance, int numberOfTransactions) {
        this.balance = balance;
        this.numberOfTransactions = numberOfTransactions;
    }

    @Override
    public double checkBalance() {
        return 0;
    }

    @Override
    public void makeTransfer(AccountOperations receiverAccount, double amount) throws AccountOperationException {

    }

    @Override
    public void makeDeposit(double amount) {

    }
}
