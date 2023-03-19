package simulations.APIs.simulation_bank_system_try2;

import java.util.Date;

public class DeleteException extends Exception {
    private Date timestamp =new Date();

    public DeleteException(String message, int clientId, String clientName, double balance) {
        super(String.format("%s : client #%d , name : %s , on : %s , balance : %.03f", message, clientId, clientName, new Date(), balance));
    }
}
