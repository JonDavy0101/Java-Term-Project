package javaTermProjectPackage;

import java.util.Scanner;

public class Input {
    public static int integerInput(String question) {
        Scanner input = new Scanner(System.in);
        System.out.print(question);
        int inputInteger = input.nextInt();
        return inputInteger;
    }

    public static String stringInput(String question){
        Scanner input = new Scanner(System.in);
        System.out.print(question);
        String inputString = input.nextLine();
        return inputString;
    }

    public static String[] arrayThreeInput(String normal1, String normal2, String normal3) {
        String[] newArray = new String[3];
        newArray[0] = normal1;
        newArray[1] = normal2;
        newArray[2] = normal3;

        return newArray;
    }

    public static String[] arrayFourInput(String normal1, String normal2, String normal3, String normal4,
                                          String normal5) {
        String[] newArray = new String[5];
        newArray[0] = normal1;
        newArray[1] = normal2;
        newArray[2] = normal3;
        newArray[3] = normal4;
        newArray[4] = normal5;

        return newArray;
    }
}
