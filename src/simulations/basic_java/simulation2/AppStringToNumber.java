package simulations.basic_java.simulation2;

import java.util.Scanner;

public class AppStringToNumber {
    public static void main(String[] args) {

        int[][] magicArray = {{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31},
                {2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31},
                {4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31},
                {8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31},
                {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}};

        welcome();
        printArray(magicArray);
        game(magicArray);


    }

    public static void welcome() {
        System.out.println("Welcome to the game...THE MAGIC NUMBERS!\n");
        System.out.println("Chose the number from 1-31, but don't tell me.. sh...sh..\n");

    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". {");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d,", arr[i][j]);
            }
            System.out.printf("}");
            System.out.println();
        }

    }
    public static void game(int[][] arr){
        Scanner scanner = new Scanner(System.in);
        int num=0;
        System.out.println("Pls tell me in which line 1-5: ");
        String word = scanner.next();
        char[] letters = word.toCharArray();
        int[] numLines = new int[letters.length];
        int idx = 0;
//create array with numbers of lines that the user wrote
        for (int i = 0; i < letters.length; i++) {
            char c = letters[i];
            switch (c) {
                case '1': {
                    numLines[idx] = 1;
                    idx++;
                    break;
                }
                case '2': {
                    numLines[idx] = 2;
                    idx++;
                    break;
                }
                case '3': {
                    numLines[idx] = 3;
                    idx++;
                    break;
                }
                case '4': {
                    numLines[idx] = 4;
                    idx++;
                    break;
                }
                case '5': {
                    numLines[idx] = 5;
                    idx++;
                    break;
                }
            }
        }

//        for (int i = 0; i < numLines.length; i++) {
//            System.out.printf("%2d", numLines[i]);
//        }
        int guessNum = 0;
        for (int j = 0; j < numLines.length && (numLines[j] != 0); j++) {
            guessNum = arr[numLines[j]-1][0] + guessNum;
        }
        System.out.println();
        System.out.println();
        System.out.println("I will guess ...the number is " + guessNum + "!!!");
        scanner.close();
    }

}
