package com.sahil.SpringAssignment.Question5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    //As @Component is annotated on both quicksort and bubble sort
    //therefore to resolve ambiguity @Primary is used with Quicksort
    //Now Quicksort will be autowired with the sortingAlgorithm

    @Autowired
    SortingAlgorithm sortingAlgorithm;

    boolean binarySearch( int arr[] , int numberToSearch){

        sortingAlgorithm.sort(arr);
        //search code
        System.out.println("Searching for :" + numberToSearch);

        return true;
    }
}
