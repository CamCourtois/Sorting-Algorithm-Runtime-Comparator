
package project8;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

/**
 * TA: Maggie Stewart
 * @author Cameron Courtois
 * submission time: 6:50pm
 */
public class Project8 {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        
        
        System.out.println("Enter array size: "); //prompts user to enter an array size
        int size = in.nextInt();
        
        int[] array = new int[size];
        
        populateArray(size,array); 
        
        long start = System.currentTimeMillis();
        SortingAlgorithms.bubbleSort(array.clone());
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Bubble sort: "+ elapsed+ " (ms.)");
        
        start = System.currentTimeMillis();
        SortingAlgorithms.bubbleSortSC(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Bubble sort(SC): "+ elapsed+ " (ms.)");
        
        start = System.currentTimeMillis();
        SortingAlgorithms.gnomeSort(array.clone(), size);
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Gnome sort: "+ elapsed+ " (ms.)");
        
        start = System.currentTimeMillis();
        SortingAlgorithms.selectionSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Selection sort: "+ elapsed+ " (ms.)");
        
        start = System.currentTimeMillis();
        SortingAlgorithms.insertionSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Insertion sort: "+ elapsed+ " (ms.)");
        
        start = System.currentTimeMillis();
        SortingAlgorithms.mergeSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Merge sort: "+ elapsed+ " (ms.)");
        
        start = System.currentTimeMillis();
        Arrays.sort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Java sort: "+ elapsed+ " (ms.)");
            
        start = System.currentTimeMillis();
        SortingAlgorithms.quickSort(array.clone(),0,size-1);
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Quick sort: "+ elapsed+ " (ms.)");
    }
    
    //populates array of user inputted "size" with random values ranging from [0-1000]
    public static void populateArray(int size, int array[])
    {
        Random rand = new Random();
        
        for(int i = 0; i < size; i++)
        {
            array[i] = rand.nextInt(1001);
        
        }
        
    }
    
    
    
}
