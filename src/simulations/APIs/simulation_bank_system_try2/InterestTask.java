package simulations.APIs.simulation_bank_system_try2;

import java.util.Set;
import java.util.TreeSet;

public class InterestTask implements Runnable {
    private Set<Client> clientSet = new TreeSet<>();

    public InterestTask(Set<Client> clientSet) {//מקבל את הרשימה מתוך bank system

        this.clientSet = clientSet;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " start to run");

        int i = 0;
        while (true) {
            //TODO define when to stop
            System.out.println("************* # "+ i+" *************************");
            System.out.println(clientSet);
            for (Client client : clientSet) {
                client.getAccount().setBalance(client.getAccount().getBalance() * client.getInterestRate());
            }
            try {
                Thread.sleep(10000);
                System.out.println(Thread.currentThread() + " sleep");
                i++;
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        //System.out.println(Thread.currentThread() + " END");
    }
}

//    public void run() {
//        System.out.println(Thread.currentThread() + " start to run");
//        int i=0;
//        while (i<3) {
//            //TODO define when to stop
//
//            for (Client client:clientSet) {
//                client.getAccount().setBalance(client.getAccount().getBalance()*client.getInterestRate());
//            }
//            try {
//                Thread.sleep(2000);
//                System.out.println(Thread.currentThread() + " sleep");
//                i++;
//            } catch (InterruptedException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//}
