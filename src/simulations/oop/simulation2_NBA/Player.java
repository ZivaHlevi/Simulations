package simulations.oop.simulation2_NBA;

import simulations.oop.Person;

import java.util.Arrays;
import java.util.Random;

public class Player extends Person {
    private int[] shotTwo;
    //לכל שחקן יש  מערך של 2 מקומות .כשאר במקום ה 0 יש את מס' הפעמים שהצליח לקלוע לסל ובמקום 1 את מס' הפעמים שלא קלע .
    //ויש מערך דומה שסופר את הקליעות של 3 נקודות .
    private int[] shotThree;
    private final float shotRateTwo;
    private final float shotRateThree;
    private int totalScore;

    public Player() {
        this.shotTwo = new int[2];
//        this.shotTwo[0] = (int) (Math.random() * 10);//כמה קלע קליעות של 2 נקודוצ
//        this.shotTwo[1] = (int) (int) (Math.random() * 10);// כמה החמצות
        this.shotThree = new int[2];
//        this.shotThree[0] = (int) (int) (Math.random() * 10);
//        this.shotThree[1] = (int) (int) (Math.random() * 10);
        shotRateTwo = (float) (Math.random() * 15.0f + 75.0f);//75%-90%
        shotRateThree = (float) (Math.random() * 15.0f + 25.0f);//25%-40%
        totalScore();
    }

    public boolean throwBallTwo() {
        float randomShut = 0.1f + (new Random().nextFloat() * 0.9f);
        System.out.println("throwBallTwo="+ randomShut);
        if (randomShut >= shotRateTwo) {
            this.shotTwo[0]++;
            totalScore();
            return true;
        }
        this.shotTwo[1]++;
        return false;
    }
    public boolean throwBallThree() {
        float randomShut = 0.1f + (new Random().nextFloat() * 0.9f);
        System.out.println("throwBallthree= "+randomShut);
        if (randomShut >= shotRateThree) {
            this.shotThree[0]++;
            totalScore();
            return true;
        }
        this.shotThree[1]++;
        return false;
    }
    private void totalScore() {
        this.totalScore = this.shotTwo[0] * 2 + this.shotThree[0] * 3;

    }

    public int getTotalScore() {
        return totalScore;
    }


    @Override
    public String toString() {
        return "Player{"+ super.toString()+
                " shotTwo=" + Arrays.toString(shotTwo) +
                ", shotThree=" + Arrays.toString(shotThree) +
                ", shotRateTwo=" + shotRateTwo +
                ", shotRateThree=" + shotRateThree +
                ", totalScore=" + totalScore +
                "} \n" ;
    }
}
