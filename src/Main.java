import java.util.Random;

public class Main {
    public static int generateID() {
        Random random = new Random();
        return random.nextInt(0, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        Administrator admin = new Administrator("John", "Doe");

        Employee e1 = new Employee("John", "Doe");
        Employee e2 = new Employee("John", "Doe");
        Employee e3 = new Employee("John", "Doe");
        Employee e4 = new Employee("John", "Doe");

        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        BankAccount b3 = new BankAccount();
        BankAccount b4 = new BankAccount();

        Client c1 = new Client("John", "Doe", b1);
        Client c2 = new Client("John", "Doe", b2);
        Client c3 = new Client("John", "Doe", b3);
        Client c4 = new Client("John", "Doe", b4);

        c1.makeDeposit(2500);
        c2.makeDeposit(1000);
        c3.makeDeposit(500);
        c4.makeDeposit(250);

        try {
            System.out.printf("c1: %.2f, c2: %.2f\n", c1.checkBalance(), c2.checkBalance());
            c1.makeTransfer(c2, 500);
            System.out.printf("After 500 transfer -> c1: %.2f, c2: %.2f\n", c1.checkBalance(), c2.checkBalance());

            System.out.printf("c2: %.2f, c3: %.2f\n", c2.checkBalance(), c3.checkBalance());
            c3.makeTransfer(c2, 500);
            System.out.printf("After 500 transfer -> c2: %.2f, c3: %.2f\n", c2.checkBalance(), c3.checkBalance());

            System.out.println("c2 number of transactions: " + c2.getAccount().numberOfTransactions);


            System.out.printf("c2: %.2f, b1: %.2f\n", c2.checkBalance(), b1.checkBalance());
            e1.makeTransfer(c2, b1, 2000);
            System.out.printf("After 2000 transfer -> c2: %.2f, b1: %.2f\n", c2.checkBalance(), b1.checkBalance());

            c1.makeTransfer(c2, 1000);
            c1.makeTransfer(c3, 1000);
            c1.makeTransfer(c3, 2000);

            c3.makeTransfer(c1, 500);
            c3.makeTransfer(c2, 500);
            c3.makeTransfer(c4, 500);
            c3.makeTransfer(c4, 500);

            System.out.printf("Balances:\nc1 -> %.2f\nc2 -> %.2f\nc3 -> %.2f\nc4 -> %.2f\n",
                    c1.checkBalance(),
                    c2.checkBalance(),
                    c3.checkBalance(),
                    c4.checkBalance()
            );

            c4.makeTransfer(c1, 5000);
        } catch (AccountOperationException e) {
            System.out.println(e);
        }
    }
}
