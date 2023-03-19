package simulations.APIs.simulation_bank_system_try2;

public class FactoryUtils {
    public static int randomNumber(int min , int max){
        return (int)((Math.random()*(max-min+1))+min);
    }
}
