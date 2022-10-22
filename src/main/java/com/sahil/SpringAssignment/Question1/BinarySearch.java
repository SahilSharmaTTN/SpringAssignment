package com.sahil.SpringAssignment.Question1;

public class BinarySearch {

    public boolean binarySearch(int arr[], int numberToSearch){

        // Here we have tightly coupled the binary Search class with BubbleSort
        // new keyword is responsible for tight coupling

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);

        System.out.println("Binary Search");

        //Binary search Logic

        return true;
    }
}
