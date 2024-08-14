package introToAlgos;

public class Sorts {
	
	//Default Constructor
	Sorts() {
		/*
		 * 
		 * There will be no variables in this class, so it can be empty
		 * 
		 */
	} // Sorts
 	
	//----------------------------------
	//Required to know sorting algos
	
	public static void selectionSort(int array[]) {
		int n = array.length; // arrays length
		
		/*
		 * Basic way of calculating time complexity
		 * O(1) - no loops including if statement
		 * O(log n) - only if statements
		 * O(n log n) - 1 for and 1 or more if statements
		 * O(n) - 1 for loop
		 * O(n^2) - 2 for loops
		 * O(n^3) - 3 for loops 
		 * ......
		 */
		
		for(int i = 0; i < n - 1; i++) {
			
			// you always assume the minIndex is the smallest 
			int minIndex = i;
			
			for(int j = i + 1; j < n; j++) {
				if(array[j] < array[minIndex]) {
					minIndex = j;
	
				} // if
				
			} // for
			
			// swap the found smallest element with the element of the array(unsorted)
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
			
		} // for
		
	} // selectionSort
	
	public static void insertionSort(int array[]) {
		int n = array.length;
		
		// loop through the array starting at the 2nd element
		for(int i = 1; i < n; i++) {
			int key = array[i];
			int j = i - 1; 
			
			// move elements of array from [0, i - 1] that are greater than the key value
			// to one position ahead of its current position 
			while(j >= 0 && array[j] > key) {
				array[j+1] = array[j]; 
				j = j - 1;
				
			} // while
			
			array[j + 1] = key;
			
		} // for
		
	} // insertionSort
	
	//-----------------------------------
	// Optional Sorts
	// These are two of the best sorting algos in existence 
	// you are not required to know them for this exam
	// but this serves as a good introduction to data structure basics

	// QuickSort method 
	public void quickSort(int[] array, int low, int high) {
		if(low < high) {
			
			// parition the aray and find a pivot index 
			int part = partition(array, low, high);
			
			// Recursively sort the elements before and after the partition
			quickSort(array, low, part - 1);
			quickSort(array, part + 1, high);
			
		} // if
		
	} // quickSort
	
	public static int partition(int[] array, int low, int high) { 
		int pivot = array[high]; // remember "high" is different for both partitions
		int i = low - 1; // the previous element
		
		for(int j = low; j < high; j++) {
			if(array[j] < pivot) { 
				i++; 
				
				// swap array[i] and array[j]
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
			} // if
			
		} // for
		
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		
		return i + 1;
		
	} // partition 

	
	// 1 2 3 | 4 5
	
	// Merge Sort method 
	public static void mergeSort(int [] array, int left, int right) { 
		if(left < right) {
				
			int middle = (left + right)/2;
			
			// recursively call the sort for the first and second half
			mergeSort(array, left, middle);
			mergeSort(array, middle + 1, right);
			
			merge(array, left, middle, right);
			
		} // if
	
	} // mergeSort
	
	public static void merge(int[] array, int left, int middle, int right) {	
		// finding the sizes of the two arrays
		int n_1 = middle - left + 1;
		int n_2 = right - middle;
		
		// two temp arrays for left and right
		int[] leftArray = new int[n_1];
		int[] rightArray = new int[n_2];
		
		// we need to copy the data from the array to the respective left and right array
		System.arraycopy(array, left, leftArray, 0, n_1);
		System.arraycopy(array, middle+1, rightArray, 0, n_2);

	    // Initial indexes of the first and second subarrays
        int i = 0, j = 0;

        // Initial index of the merged subarray
        int k = left;
        while (i < n_1 && j < n_2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
                
            } else {
                array[k] = rightArray[j];
                j++;
            
            } // else
            
            k++;
            
        } // while

        // Copy remaining elements of leftArray[]
        while (i < n_1) {
            array[k] = leftArray[i];
            i++;
            k++;
            
        } // while

        // Copy remaining elements of rightArray[]
        while (j < n_2) {
            array[k] = rightArray[j];
            j++;
            k++;
            
        } // while
		
	} // merge
	
	
} // Sorts
