package simulations.APIs.simulation_bank_system_try2;

import simulations.APIs.simulation_bank_system.FactoryInit;
import simulations.APIs.simulation_bank_system_try2.BankSystem;
import simulations.APIs.simulation_bank_system_try2.Client;
import simulations.APIs.simulation_bank_system_try2.InterestTask;

import java.util.List;
import java.util.Set;

public class BankStatistics {
    public static int countMembers(Set<Client> clientSet) {
        return clientSet.size();
    }


    public static void display(Set<Client> clientSet) {
        for (Client c : clientSet) {
            System.out.println(c);
        }
    }

    public static double getBankBalance(Set<Client> clientSet) {
        double balance = 0;
        for (Client c : clientSet) {
            balance += c.getAccount().getBalance();
        }
        return balance;
    }

    public static Client getRichesClient(Set<Client> clientSet) {
        double balance = Integer.MIN_VALUE;
        Client client = null;
        for (Client c : clientSet) {
            if (c.getAccount().getBalance() > balance) {
                balance = c.getAccount().getBalance();
                client = c;
            }
        }
        return client;
    }

    public static Client getPoorestClient(Set<Client> clientSet) {
        double balance = Integer.MAX_VALUE;
        Client client = null;
        for (Client c : clientSet) {
            if (c.getAccount().getBalance() < balance) {
                balance = c.getAccount().getBalance();
                client = c;
            }
        }
        return client;
    }
}

