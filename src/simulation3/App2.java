package simulation3;

import java.util.Scanner;

public class App2 {
    static int[][] arr = new int[3][3];
    //static boolean player1 = true;// כל עוד true זה תורו של שחקן 1 , אחרת שחקן 2

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fillArray();
        int numOfTurns = 9;
        int myChoice = 0;
        int whoPlay=numOfTurns%2;
        while (numOfTurns > 0 && !isWinR()) {
             whoPlay= numOfTurns%2;
            printArray();
            System.out.println((whoPlay==1)?"\nPlayer1 turns : ":"\nPlayer2 turns: ");
            myChoice=scanner.nextInt();
            if (isChoiceLegal(myChoice)){
                xORy(myChoice, whoPlay);
                numOfTurns--;
            }

//            if (player1) {
//                System.out.println("Player1 turns :");
//                myChoice = scanner.nextInt();
//                if (isChoiceLegal(myChoice)) {
//                    xORy(myChoice, player1);
//                    numOfTutns--;
//                    player1 = false;
//                } else {
//                    System.out.println("Pls try again");
//                }
//            } else {
//                System.out.println("Player2 turns :");
//                myChoice = scanner.nextInt();
//                if (isChoiceLegal(myChoice)) {
//                    xORy(myChoice, player1);
//                    numOfTutns--;
//                    player1 = true;
//                } else {
//                    System.out.println("Pls try again");
//                }
//            }
        }


        printArray();
        if (isWinR()) {
            System.out.println((whoPlay==1) ? "\nPlayer 1 win!" : "\nPlayer 2 win!");//("you win ");
        } else {
            System.out.println(" Try again later.");
        }
        scanner.close();
    }

    public static void xORy(int choose, int play) {
        int tmp=((play==1)?-1:-2);
//        if (pl) {
//            tmp = -1;//player1
//        } else {
//            tmp = -2;//player2
//        }
        switch (choose) {
            case 1: {
//                if (arr[0][0] == -1 || arr[0][0] == -2) {
//                    System.out.println("This place was marked . pls choose again: ");
//                    return false;
//                }
                arr[0][0] = tmp;
                break;
            }
            case 2: {
//                if (arr[0][1] == -1 || arr[0][1] == -2) {
//                    System.out.println("This place was marked . pls choose again: ");
//                    return false;
//                }
                arr[0][1] = tmp;
                break;
            }
            case 3: {
//                if (arr[0][2] == -1 || arr[0][2] == -2) {
//                    System.out.println("This place was marked . pls choose again: ");
//                    return false;
//                }
                arr[0][2] = tmp;
                break;
                // return true;
            }
            case 4: {
//                if (arr[1][0] == -1 || arr[1][0] == -2) {
//                    System.out.println("This place was marked . pls choose again: ");
//                    return false;
                // }
                arr[1][0] = tmp;
                break;
                // return true;
            }
            case 5: {
//                if (arr[1][1] == -1 || arr[1][1] == -2) {
//                    System.out.println("This place was marked . pls choose again: ");
//                    return false;
//                }
                arr[1][1] = tmp;
                break;
                //  return true;
            }
            case 6: {
//                if (arr[1][2] == -1 || arr[1][2] == -2) {
//                    System.out.println("This place was marked . pls choose again: ");
//                    return false;
//                }
                arr[1][2] = tmp;
                break;
                // return true;
            }
            case 7: {
//                if (arr[2][0] == -1 || arr[2][0] == -2) {
//                    System.out.println("This place was marked . pls choose again: ");
//                    return false;
                //  }
                arr[2][0] = tmp;
                break;
                //  return true;
            }
            case 8: {
                // if (arr[2][1] == -1 || arr[2][1] == -2) {
//                    System.out.println("This place was marked . pls choose again: ");
//                    return false;
//                }
                arr[2][1] = tmp;
                break;
                // return true;
            }
            case 9: {
//                if (arr[2][2] == -1 || arr[2][2] == -2) {
//                    System.out.println("This place was marked . pls choose again: ");
//                    return false;
                // }
                arr[2][2] = tmp;
                break;
                // return true;
            }
        }
    }

    public static void isEmpty(int choice) {
// TODO: 06/02/2023 במידה ובוחרים תא שכבר סומן ב X או O
    }

    public static boolean isChoiceLegal(int choice) {
        if (choice < 1 || choice > 9) {
            System.out.println("Not good option.try again");
            return false;
        }
        return true;
    }

    public static void fillArray() {
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num;
                num++;
            }
        }

    }

    public static void printArray() {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|");
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == -2) {//player2
                    System.out.print(String.format("%2c |", 'O'));
                } else if (arr[i][j] == -1) {//player1
                    System.out.print(String.format("%2c |", 'X'));
                } else {
                    System.out.print(String.format("%2d |", arr[i][j]));
                }
            }
            System.out.println();
        }

    }

    public static boolean isWinR() {
        //int j = 0;
        boolean isWin = false;
        for (int i = 0; i < 3; i++) {// בדיקת השורות
            int tmp = arr[i][0];
            if (arr[i][1] == tmp && arr[i][2] == tmp) {
                isWin = true;
                break;
            }
        }
        for (int i = 0; i < 3; i++) {// בדיקת העמודות
            int tmp = arr[0][i];
            if (arr[1][i] == tmp && arr[2][i] == tmp) {
                isWin = true;
                break;
            }
        }

        int tmp = arr[1][1];// בדיקת האלכסונים (עולה ויורד)
        if (arr[0][0] == tmp && arr[2][2] == tmp || arr[0][2] == tmp && arr[2][0] == tmp) {
            isWin = true;
        }
        return isWin;
    }

//    public static boolean isWinC() {
//        int j = 0;
//        boolean isWin = false;
//        for (int i = 0; i < 3; i++) {
//            int tmp = arr[0][i];
//            if (arr[1][i] == tmp && arr[2][i] == tmp) {
//                isWin = true;
//                break;
//            }
//        }
//        return isWin;
//    }
}


