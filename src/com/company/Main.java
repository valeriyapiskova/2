package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = console.nextInt();

        int[] myArray = new int[size];
        int a;
        for (a = 0; a < myArray.length; a++) {
            System.out.println("Enter value: ");
            myArray[a] = console.nextInt();


            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] > 0) {
                    System.out.println(myArray[i]);
                }
            }
        }
    }
}
