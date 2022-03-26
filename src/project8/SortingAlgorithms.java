
package project8;

/**
 * TA: Maggie Stewart
 * @author Cameron Courtois
 * submission time: 6:50pm
 */
public class SortingAlgorithms 
{
    //sorts each adjacent element in array
    public static void bubbleSort(int array[])
    {
        for(int i = 0; i < array.length-1; i++)
            
            for(int j = 0; j < array.length-i-1; j++)
                
            if(array[j] > array[j+1])
            {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
}
    //sorts each adjacent element in the array only if they haven't been swapped
    public static void bubbleSortSC(int array[])
    {
        for(int i = 0; i < array.length-1; i++)
        {
            boolean swap = false;

            for(int j = 0; j < array.length-i-1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap)
                break;
        }
    }
    
    //sorts elements in array by comparing maximum and current indexed values
    public static void selectionSort(int[] array) 
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                index = j;
            
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }
    
    //sorts elements in an array by beginning comparison of the second element
    //to its left adjacent element and inserting it in its place if less than
    public static void insertionSort(int array[])
    {
        int i, key, j;
        for (i = 1; i < array.length; i++)
        {
            key = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > key)
            {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }
    }
    
    public static void mergeSort(int[] array) 
    {
        if (array.length < 2)
            return;
        int mid = array.length / 2;
        int[] l = new int[mid];
        int[] r = new int[array.length - mid];
        
        for (int i = 0; i < mid; i++)
            l[i] = array[i];
        for(int i = mid; i < array.length; i++)
            r[i - mid] = array[i];
        mergeSort(l);
        mergeSort(r);
        
        merge(array, l, r, mid, array.length - mid);
    }
    
    public static void merge(int[] array, int[] l, int[] r, int left, int right) 
    {
        int i = 0, j = 0, k = 0;
        
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                array[k] = l[i];
                i++;
            }
            else {
                array[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < left)
            array[k++] = l[i++];
        
        while (j < right)
            array[k++] = r[j++];
    }
    
    public static int partition(int array[], int low, int high)
    {
        int pivot = array[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (array[j] <= pivot)
            {
                i++;
  
                // swap arr[i] and arr[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
  
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
  
        return i+1;
    }
    
    public static void quickSort(int array[], int low, int high) { 
        if (low < high) { 
            //partition the array around pi=>partitioning index and return pi
            int pi = partition(array, low, high); 
   
            // sort each partition recursively 
            quickSort(array, low, pi-1); 
            quickSort(array, pi+1, high); 
        } 
    }
    
    public static void gnomeSort(int array[], int size)
    {
        int index = 0;
 
        while (index < size) {
            if (index == 0)
                index++;
            if (array[index] >= array[index - 1])
                index++;
            else {
                int temp = 0;
                temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
        return;
    }
}
