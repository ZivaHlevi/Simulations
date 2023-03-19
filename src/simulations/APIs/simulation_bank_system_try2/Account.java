package simulations.APIs.simulation_bank_system_try2;


public class Account {
    private double balance;

    public Account() {

        this.balance= FactoryUtils.randomNumber(8000,-4000);
    }

    public Account(double balance) {

       setBalance(balance);
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    @Override
    public String toString() {

        return "Balance= "+ balance;
    }
}
