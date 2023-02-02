package simulation1;

import java.util.Random;
import java.util.Scanner;

public class App {
    static int[] arrBinary = new int[4];
    static boolean isTrue = false;

    public static void main(String[] args) {
        welcome();
        game();
        end();


//תהליך חשיבה עד למציאת ההגיון
//            if (tmp >= Math.pow(2, 3)) {
//                arrBinary[0] = 1;
//                tmp = (int) (tmp - Math.pow(2, 3));
//            }
//        System.out.println();
//        System.out.println("tmp3=" + tmp);
//        //
//        if (tmp >= Math.pow(2, 2)) {
//            arrBinary[1] = 1;
//            tmp = (int) (tmp - Math.pow(2, 2));
//        }
//        System.out.println("tmp2=" + tmp);
////
//        if (tmp >= Math.pow(2, 1)) {
//            arrBinary[2] = 1;
//            tmp = (int) (tmp - Math.pow(2, 1));
//        }
//        System.out.println("tmp1=" + tmp);
//        //
//        if (tmp >= Math.pow(2, 0)) {
//            arrBinary[3] = 1;
//            tmp = (int) (tmp - Math.pow(2, 0));
//        }
//        System.out.println("tmp0=" + tmp);
//        System.out.println();
//        //


    }

    public static void welcome() {
        System.out.println("Welcome to the game \"!!Guess the number!!\" ");
        System.out.println("Guess a number between 1-16. You have 4 guesses");
    }

    public static void game() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(15) + 1;
        //int num = 9;
        //int[] arrBinary = new int[4];
        int idx = arrBinary.length - 1;
        int tmp = num;
// PRESET THE NUMBER ON BINARY WAY
        for (int i = 0; i < arrBinary.length; i++) {
            int val = (int) Math.pow(2, idx);
            idx--;
            if (tmp >= val) {
                arrBinary[i] = 1;
                // System.out.println("arr[" + i + "] = " + arrBinary[i]);
                tmp = (int) (tmp - val);
            }
        }
        int numOfGuess = arrBinary.length;//מס' הניחושים האפשריים
        while (numOfGuess > 0) {
            System.out.println("Left " + numOfGuess + " guesses ");
            for (int i = 0; i < numOfGuess; i++) {
                System.out.printf("%2c", '-');
            }
            for (int i = numOfGuess; i < arrBinary.length; i++) {
                System.out.printf("%2d", arrBinary[i]);
            }
            numOfGuess--;
            System.out.println();
            System.out.println(" Pls guess: ");
            int myGuess = scanner.nextInt();
            if (myGuess == num) {
                isTrue = true;
                break;
            }

        }
        System.out.println();
        System.out.println("The random number is " + num + " ! ! !");
        System.out.println("The binary way :");
        myPrint();
        scanner.close();
    }

    public static void end() {
        System.out.println();
        if (isTrue) {
            System.out.println("YOU WIN!!!  WELL DONE!!!");
        } else {
            System.out.println("You lose, try again later");
        }

    }
    public static void myPrint(){
        for (int i = 0; i < arrBinary.length; i++) {
            System.out.print(arrBinary[i] + "  ");

        }
    }
}
