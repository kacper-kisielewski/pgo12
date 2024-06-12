public interface AccountOperations {
    double checkBalance();
    void makeTransfer(AccountOperations receiverAccount, double amount) throws AccountOperationException;
    void makeDeposit(double amount);
}
