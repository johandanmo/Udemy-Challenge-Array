/*==========================================
Title:  Udemy Array Challenge
Author: Johan Danmo
Date:   7 Mar 2020
==========================================*/

package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] newArray = getIntegers(5);
        sortIntegers(newArray);
        printArray(newArray);

    }

    public static int[] getIntegers(int number){
        //this method will return the entered values in a array
        int[] array = new int[number];
        System.out.println("Enter " + number + " values: \r");

        for (int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        //This method will print the passed array
        System.out.println("The following numbers were added to the array: ");
        System.out.print("{");
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]);
            if (i != array.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    public static int[] sortIntegers(int[] array){
        //bubble sort
            boolean sorted = false;
            int temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i+1]) {
                        temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        sorted = false;
                    }
                }
            }
            return array;
        }


}
