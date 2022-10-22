package com.sahil.SpringAssignment.Question2;

public class BinarySearch {

    SortingAlgorithm sortingAlgorithm;

    public BinarySearch(SortingAlgorithm sortingAlgorithm){
        this.sortingAlgorithm =  sortingAlgorithm;
    }
    public boolean binarySearch(int arr[], int numberToSearch){

        sortingAlgorithm.sort(arr);

        System.out.println("Sorted");

        //Binary search algo

        return true;
    }
}
