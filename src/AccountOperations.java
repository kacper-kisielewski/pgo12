public interface AccountOperations {
    double checkBalance();

    Transaction makeTransfer(BankAccount receiverAccount, double amount) throws AccountOperationException;

    void makeDeposit(double amount);
}
