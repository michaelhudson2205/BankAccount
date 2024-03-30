package accounts;

public abstract Account {
    protected double balance;
    protected double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance-= amount;
        return true;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void status() {
        System.out.printf("Balance: %.2f\n", balance);
    }
}
