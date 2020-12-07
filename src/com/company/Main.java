package com.company;

public class Main {
    /*
     *  Class serves for reverse array
     */

    public static void main(String[] args) {
    // creating variables

        int[] array = {0, 1, 2, 3, 4, 5};
        int n = array.length;
        int temp;

    // print the original array
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

    // swaps the elements of an array
        for (int i = 0; i < n / 2; i++){
            temp = array[n - i - 1];
            array[n - i - 1] = array[i];
            array[i] = temp;
        }

    // print the final array
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}


