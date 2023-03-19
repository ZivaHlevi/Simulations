package simulations.APIs.simulation_bank_system_try2;


import java.util.Objects;

public abstract class Client extends Person implements Comparable <Client> {
    private float interestRate;
    private Account account;

    public Client() {
        super();
    }


    public Client(int id, String name, double age, float interestRate) {
        super(id, name, age);
        this.account = account;
        this.interestRate=interestRate;
    }


    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public int compareTo(Client o) {
        return (int) (account.getBalance()-o.account.getBalance());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Float.compare(client.interestRate, interestRate) == 0 && account.equals(client.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interestRate, account);
    }

    @Override
    public String toString() {
        return "Client{" +
                "interestRate=" + interestRate +
                ", account=" + account +
                "} " + super.toString();
    }
}
