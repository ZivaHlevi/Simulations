package simulations.APIs.simulation_bank_system_try2;

import java.util.Date;

public class WithdrawException extends Exception{
    private Date timesTamp= new Date();

    public WithdrawException(String message,int clientId, String clientName, double balance) {
super(String.format("%s : client #%d , name : %s , on : %s , balance : %.03f", message, clientId, clientName, new Date(), balance));
    }
}
