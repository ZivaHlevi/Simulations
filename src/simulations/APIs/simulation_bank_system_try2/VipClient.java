package simulations.APIs.simulation_bank_system_try2;

public class VipClient extends Client {

    public VipClient() {
        super();
        super.setName("client vip");
        super.setAccount(new Account());
        super.setInterestRate(1.1f);
    }
    ///init regular client by user
    public VipClient(int id, String name, double age,double balance) {
        super(id, name, age, 1.1f);
        super.setAccount(new Account(balance));
    }
}
