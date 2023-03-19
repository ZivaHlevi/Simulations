package simulations.APIs.simulation_bank_system_try2;



public class RegularClient extends Client {
    //init regular client by random
    public RegularClient() {
        super();
        super.setName("client r");
        super.setAccount(new Account());
        super.setInterestRate(1.05f);
    }
///init regular client by user
    public RegularClient(int id, String name, double age,double balance) {
        super(id, name, age, 1.05f);
        super.setAccount(new Account(balance));
    }
}
