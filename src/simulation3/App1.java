package simulation3;

import java.util.Scanner;

public class App1 {
    static int[][] arr = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        welcome();

        int player1 = -1;// X
        int player2 = 0;//0
        int choice = 0;
        int xORy=-1;//(X=-1  O=0)
        boolean turnP1 = true;
        //boolean turnP2= false;
        boolean isWin=false;
        int numOfturns = 0;
        while (numOfturns < 9) {

            // TODO: 05/02/2023 check if win
            if (turnP1){
            System.out.println("player1: Look the table . Were do X ? Pls choice ");
            xORy= -1;
            turnP1=false;}
            else {
                System.out.println("player2 :Look the table . Were do O ? Pls choice ");
                xORy= 0;
                turnP1=true;
            }
            choice = scanner.nextInt();
            if (choice > 0 && choice < 10) {
                numOfturns++;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        if (arr[i][j] == choice)
                            arr[i][j] = xORy;
                    }
                }

            } else {
                System.out.println(" no supported");
            }
//            int i=0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j][i]==arr[j][i++] && arr[j][i]==arr[j][i++]||
//                        arr[i][j]==arr[i+1][j]&& arr[j][i]==arr[j][i++]){
//                    isWin = true;
//                    numOfturns=10;
//                    break;
//
//                }
//            }
//            if (arr[i][i]==arr[i][i+1] && arr[i][i]==arr[i][i+2] ||
//                    arr[i][i]== arr[i+1][i] && arr[i][i]== arr[i+2][i]||
//                    arr[i][i]==arr[i+1][i+1] && arr[i][i]==arr[i+2][i+2]){
//                isWin = true;
//                numOfturns=10;
//                break;
//            }
            for (int k = 0; k < arr.length; k++) {
                for (int j = 0; j < arr[k].length; j++) {
                    //char a = (char) arr[i][j];
                    System.out.printf("|%2d|", arr[k][j]);
                }
                System.out.println();
            }

        }

        if (isWin){
            if (!turnP1){
                System.out.println("pl1 is win ");
            }
            else {
                System.out.println("pl2 is win ");
            }
        }


        scanner.close();
    }

    public static void welcome() {
        System.out.println(" Welcome to the game...");
        int numIdx = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = numIdx;
                System.out.printf("|%2d|", arr[i][j]);
                numIdx++;
            }
            System.out.println();
        }

    }

}
