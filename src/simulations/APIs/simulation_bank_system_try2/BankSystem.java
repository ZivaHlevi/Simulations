package simulations.APIs.simulation_bank_system_try2;


import java.util.*;

/**
 * Created by kobis on 13 Mar, 2023
 */
public class BankSystem {

    private InterestTask interestTask;
    private Set<Client> clients = new TreeSet<>();
    private static Scanner scanner;

    public BankSystem() {

        interestTask = new InterestTask(clients);//מחלקת interestTask ממשת את runnable .
        Thread t1 = new Thread(interestTask);
        t1.start();
    }

    public void bankSystemInWork() {
        System.out.println("START");
        scanner = new Scanner(System.in);
        yalla();
    }

    public void yalla() {
        int id;
        double amount;
        int action = choose();

        while (action != 9) {
            switch (action) {
                case 1:
                    addClient();
                    break;
                case 2:
                    System.out.println("Please insert Client id you want to remove: ");
                    id = scanner.nextInt();
                    try {
                        deleteClient(id);
                    } catch (DeleteException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Please insert Client id you want to withdraw: ");
                    id = scanner.nextInt();
                    System.out.println("Please insert the amount to withdraw: ");
                    amount = scanner.nextDouble();
                    try {
                        withdraw(id, amount);
                    } catch (WithdrawException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Please insert Client id you want to deposit: ");
                    id = scanner.nextInt();
                    System.out.println("Please insert the amount to deposit: ");
                    amount = scanner.nextDouble();
                    deposit(id, amount);
                    break;
                case 5:
                    printAll();
                    break;
                case 6:
                    System.out.println("The Riches Client is : "+ BankStatistics.getRichesClient(clients));
                    break;
                case 7:
                    System.out.println("The Poorest Client is : "+ BankStatistics.getPoorestClient(clients));
                    break;
                case 8:
                    System.out.println("The total balance of the bank is :" + BankStatistics.getBankBalance(clients));
                    break;
                default:
                    System.out.println("Not supported.Please try again");
            }
            action = choose();
        }
        endSystem();
    }

    public int choose() {
        showMenu();
        return scanner.nextInt();
    }

    public void endSystem() {
        System.out.println("END");
        System.out.println("Thank you and Goodbye. The End)");
        scanner.close();
        System.exit(0);
    }

    public void addClient() {
        boolean regOrVip = new Random().nextBoolean();
        if (regOrVip) {
            clients.add(new RegularClient());
        } else
            clients.add(new VipClient());
    }

    public void deleteClient(int id) throws DeleteException {

        for (Client client : clients) {
            if (client.getId() == id) {
                if (client.getAccount().getBalance() < 0) {
                    throw new DeleteException("The Client have debt", id, client.getName(), client.getAccount().getBalance());
                }
                clients.remove(client);
            }
        }
    }

    public void withdraw(int idx, double amount) throws WithdrawException {
        for (Client client : clients) {
            if (client.getId() == idx) {
                if ((client.getAccount().getBalance() - amount) < -4000) {
                    throw new WithdrawException("Don't have enough money", idx, client.getName(), client.getAccount().getBalance());
                } else
                    client.getAccount().setBalance(client.getAccount().getBalance() - amount);
            } else
                System.out.println("No Client find");
        }
    }


    public void deposit(int idx, double amount) {
        for (Client client : clients) {
            if (client.getId() == idx) {
                client.getAccount().setBalance(client.getAccount().getBalance() + amount);
            } else System.out.println("No Client find");
        }
    }

    public void printAll() {
        for (Client client : clients) {
            System.out.println(client);
        }
    }

    //
//    //step1:define mutual resource from that type of the class
//
//
//    public Set<Client> getClients() {
//        return clients;
//    }
//
//    public void showMenu() {
//        System.out.println("Enter number to select an action:");
//        System.out.println("1 - Add new Client");
//        System.out.println("2 - Remove Client by Id");
//        System.out.println("3 - Withdraw Money");
//        System.out.println("4 - Deposit Money");
//        System.out.println("5 - Print all Bank Clients Sorted by Balance");
//        System.out.println("6 - Print Richest Client");
//        System.out.println("7 - Print Poorest Client");
//        System.out.println("8 - Print Bank Balance");
//        System.out.println("9 - To Exit");
//    }
//
//    public void startSystem() {
//        System.out.println("Welcome To The Bank System!\n");
//        scanner = new Scanner(System.in);
//        showMenu();
//        int action = scanner.nextInt();
//        int id;
//        List<Client> list = null;
//        double amount;
//        while (action != 9) {
//            switch (action) {
//                case 1://הוספת לקוח רנדומלי
//                    boolean result = new Random().nextBoolean();
//                    if (result) {
//                        addClient(new VipClient());
//                    } else {
//                        addClient(new RegularClient());
//                    }
//                    break;
//                case 2:
//                    System.out.println("Please insert Client id you want to remove: ");
//                    id = scanner.nextInt();
//                    try {
//                        deleteClient(id);
//                    } catch (Exception e) {
//                        System.err.println(e.getMessage());
//                    }
//                    break;
//                case 3:
//                    System.out.println("Please insert Client id you want to withdraw: ");
//                    id = scanner.nextInt();
//                    System.out.println("Please insert the amount to withdraw: ");
//                    amount = scanner.nextDouble();
//                    try {
//                        withdraw(id, amount);
//                    } catch (WithdrawException e) {
//                        System.err.println(e.getMessage());
//                    }
//                    break;
//                case 4:
//                    System.out.println("Please insert Client id you want to deposit: ");
//                    id = scanner.nextInt();
//                    System.out.println("Please insert the amount to deposit: ");
//                    amount = scanner.nextDouble();
//                    deposit(id, amount);
//                    break;
//                case 5:
//                    printAll();
//                    break;
//                case 6:
//                    list = new ArrayList<>(clients);
//                    System.out.println(BankStatistics.getRichestClient(list));
//                    break;
//                case 7:
//                    list = new ArrayList<>(clients);
//                    System.out.println(BankStatistics.getPoorestClient(list));
//                    break;
//                case 8:
//                    System.out.println(BankStatistics.getBankBalance());
//                    break;
//                default:
//                    throw new IllegalStateException("Unexpected value: " + action);
//            }
//            showMenu();
//            action = scanner.nextInt();
//        }
//        endSystem();
//    }
//
//    public void addClient(Client c) {
//        clients.add(c);
//    }
//
//    public void deleteClient(int id) throws Exception {
//        for (Iterator<Client> it = clients.iterator(); it.hasNext(); ) {
//            Client client = it.next();
//            if (client.getId() == id) {
//                if (client.getAccount().getBalance() < 0) {
//                    throw new DeleteException("DeleteException: The Client have debt!\n", new Date(), client.getId(),
//                            client.getName(), client.getAccount().getBalance());
//                } else {
//                    System.out.println("Removing the client: \n" + client);
//                    it.remove();
//                    break;
//                }
//            }
//        }
//    }
//
//    public void withdraw(int id, double amount) throws WithdrawException {
//        Client clientToUpdate = null;
//        for (Client client : clients) {
//            if (client.getId() == id) {
//                if (client.getAccount().getBalance() < amount) {
//                    throw new WithdrawException("WithdrawException: The client doesn't have enough money to withdraw",
//                            new Date(), client.getId(), client.getName(), client.getAccount().getBalance());
//                } else {
//                    clientToUpdate = client;
//                    break;
//                }
//            }
//        }
//        clients.remove(clientToUpdate);
//        clientToUpdate.getAccount().removeFromBalance(amount);
//        clients.add(clientToUpdate);
//    }
//
//    public void deposit(int id, double amount) {
//        Client clientToUpdate = null;
//        for (Client client : clients) {
//            if (client.getId() == id) {
//                clientToUpdate = client;
//                break;
//            }
//        }
//        clients.remove(clientToUpdate);
//        clientToUpdate.getAccount().addToBalance(amount);
//        clients.add(clientToUpdate);
//    }
//
//}
//}
    public void showMenu() {
        System.out.println("HELLO TO BANK SYSTEM.  Please Choose your option:\n" +
                "1.Add Client.\n" +
                "2.Delete Client.\n" +
                "3.Withdraw money\n" +
                "4.Deposit money\n" +
                "5.Print all clients \n" +
                "6.RichesClient\n" +
                "7.PoorestClient\n" +
                "8.Total balance bank\n" +
                "9.Exit.");
    }
//
//
//    }

}