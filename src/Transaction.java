public class Transaction {
    private final double amount;
    private final BankAccount senderAccount;
    private final BankAccount receiverAccount;

    public Transaction(double amount, BankAccount senderAccount, BankAccount receiverAccount) {
        this.amount = amount;
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
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
