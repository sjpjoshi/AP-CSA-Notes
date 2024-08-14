package introToAlgos;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Variables
		Sorts sort = new Sorts();
		Searching search = new Searching();
		int array[] = new int[3];

		// recall this function everytime we call a new sorting algorithm
		System.out.println("Unsorted");
		putRandomNumbers(array);
		System.out.println();
		// recall this function everytime we call a new sorting algorithm
		printArray(array);	
		
		System.out.println("\n sorted");
		sort.selectionSort(array);
		System.out.println();
		// recall this function everytime we call a new sorting algorithm
		printArray(array);		
		
	} // main

	public static void putRandomNumbers(int array[]) {
		Random rand = new Random();
		for(int i = 0; i < 3; i++) {
			array[i] = rand.nextInt(0, 10);
			
		} // for
		
	} // putRandomNumbers
	
	public static void printArray(int array[]) { 
		for(int i : array) 
			System.out.println(i);
		
	} // printArray
	
} // Main
