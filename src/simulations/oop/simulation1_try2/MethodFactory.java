package simulations.oop.simulation1_try2;

public class MethodFactory {

    public static int randomTimeToCare(){
        return (int)((Math.random()*19)+3);
    }

    public static int randomNumber(int min , int max){
        return (int)((Math.random()*(max-min+1))+min);
    }
}
