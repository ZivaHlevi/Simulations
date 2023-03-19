package simulations.basic_java.simulation2;

import java.util.Scanner;

public class App2GetStringAndFindDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] letters = word.toCharArray();
        int idx = 0;
        int[] numLine = new int[letters.length];

        for (int i = 0; i < letters.length; i++) {
            char c = letters[i];
            switch (c) {
                case '1': {
                    numLine[idx] = 1;
                    idx++;
                    break;
                }
                case '2': {
                    numLine[idx] = 2;
                    idx++;
                    break;
                }
                case '3': {
                    numLine[idx] = 3;
                    idx++;
                    break;
                }
                case '4': {
                    numLine[idx] = 4;
                    idx++;
                    break;
                }
                case '5': {
                    numLine[idx] = 5;
                    idx++;
                    break;
                }
            }
//            if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5') {
//                numLine[idx] = c;
//                System.out.print("c = "+numLine[idx]);
//                idx++;
//                System.out.print("i= " + idx);
        }
//        int b = Integer.getInteger(word);
//        System.out.println("b=" + b);
        for (int i = 0; i < numLine.length && (numLine[i] != 0); i++) {
            System.out.printf("%2d", numLine[i]);
        }
        // System.out.println(word);
        scanner.close();
    }
}
