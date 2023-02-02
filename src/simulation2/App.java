package simulation2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] magicArray = {{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31},
                              {2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31},
                              {4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31},
                              {8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31},
                              {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}};

        System.out.println("Chose the number from 1-31, but don't tell.. me sh...sh..");
        System.out.println("");
        System.out.println("How many times your number appears 1-5? ");
        int num= scanner.nextInt();
        int[] numOfLine = new int[num];
        System.out.println("Pls tell me in which line");
        for (int i = 0; i < numOfLine.length; i++) {
            System.out.println();
            System.out.print("Line"+(i+1)+" : ");
            numOfLine[i] = scanner.nextInt()-1;
        }
        int guessNum = 0;
        for (int i = 0; i < numOfLine.length; i++) {
            guessNum = magicArray[numOfLine[i]][0] + guessNum;
        }
        System.out.println();
        System.out.println();
        System.out.println("I will guess ...the number is "+ guessNum+"!!!");
        scanner.close();
    }
}
