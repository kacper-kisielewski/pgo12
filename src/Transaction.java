public class Transaction {
    private final BankAccount senderAccount;
    private final BankAccount receiverAccount;
    private final double amount;

    public Transaction(BankAccount senderAccount, BankAccount receiverAccount, double amount) throws AccountOperationException {
        if (senderAccount.balance < amount) {
            throw new AccountOperationException("Amount to be sent exceeds balance");
        }

        senderAccount.balance -= amount;
        receiverAccount.balance += amount;
        senderAccount.numberOfTransactions++;
        receiverAccount.numberOfTransactions++;

        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public BankAccount getSenderAccount() {
        return senderAccount;
    }

    public BankAccount getReceiverAccount() {
        return receiverAccount;
    }
}
