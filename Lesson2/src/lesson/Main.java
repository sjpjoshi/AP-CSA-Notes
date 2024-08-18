package lesson;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Loops and classes
		
		// 1. switch statement
		// there are rules to the if statement
			// 1. it must go in order
			// 2. it can only take in condition 
			// 3. it only works with ints, char, enum/struct
		/*
		int a = 1;
		switch(a) {
			// least to greatest
			case 0:
				System.out.println("hi");
			break;
			
			case 1:
				System.out.println("asdas");
			break;
			
			case 2:
				System.out.println("rqeew");
			break;
			
			default:
				System.out.println("dsfsdfsd");

		} // switch 
		
		// Translated to a if statement
		if(a == 0) {
			
		} else if(a == 1) {
			
		} else if(a == 2) {
			
		} else { 
			///..
		}
	
		
		// while and do while
		int a = 1;
		boolean something = true;
		while(something == true) {

			System.out.println(a);
			a = a + 1;
			if(a == 5) {
				something = false;
			}
			
		} // while
		
		*/
		
		
		// Menu based program
		/*
		 * ---Menu---
		 * 1. say hi
		 * 2. say bye
		 * 3. say hello
		 * 4. exit
		 * Enter: 1
		 * hi
		 * ---Menu---
		 * 1. say hi
		 * 2. say bye
		 * 3. say hello
		 * 4. exit
		 * Enter: 4
		 * goodbye!
		 */
		/*
		int enter = -1;
		while(enter != 4) {
			System.out.println("1. say hi");
			System.out.println("2. say bye");
			System.out.println("3. say hello");
			System.out.println("4. exit");
			System.out.print("Enter: ");
			enter = scan.nextInt();
			
			switch(enter) {
			case 1:
				System.out.println("hi");
				break;
			case 2:
				System.out.println("bye");
				break;
			case 3:
				System.out.println("hello");
				break;
			case 4:
				break;
				
			} // switch
			
		} // while
		
		*/
		
		// another variant of while, do while
		/*
		 *  the do while loops runs first then checks the condition 
		 *  the while loops checks the condition first then runs it
		int enter = 2;
		do {
			System.out.println(" hi");

		} while(enter == 1);
		*/
		
		// i++ -> i = i + 1
		// variable++ -> variable = variable + 1 (assuming its either a int or double)
		// for (variable = #; conditional check : increments/decrements the variable)
		
		// for loop
		for (int i = 0; i < 2; i++ ) {
			//System.out.println(i);
		} // for
	
		/*
		 * i = 0
		 * 0 < 3 yes
		 * prints hi
		 * i++ -> i = 0 + 1 = 1 -> i = 1
		 * i = 1
		 * 1 < 3 yes
		 * prints hi
		 * i++ -> i = 1 + 1 = 2 -> i = 2
		 * i = 2
		 * 2 < 3 yes
		 * prints hi
		 * i++ -> i = 2 + 1 = 3 -> i = 3
		 * i = 3
		 * 3 < 3 no
		 * stops
		 */
		/*
		for (double i = 50; i > 0; i -= 0.1 ) {
			//System.out.println(i);
			
		} // for
		*/
		// floating point error
		// Java has a major issue with decimal math
		
		// you can use the for loop in any way you want
		
		// nested statement
		
		/*
		if() { 
			if() {
				
			}
			
		}
		
		while() {
			while() {
				
			}
		}
		
		// runs a total of 4 times 
		for(int i = 0; i < 2; i++) { 
			for(int j = 0; j < 2; j++) { 
				
			}
		}
		*/

		// to call a class
		Helper helper = new Helper(); // this is how to call the default constructor
		Helper helper2 = new Helper(10, "tom", 3.1); // non-default constructor
		
		//helper2.printOut();
		
		int age;
		String name;
		double gpa;
		
		System.out.println("enter a age: ");
		age = scan.nextInt();
		System.out.println("enter a name: ");
		name = scan.next();
		System.out.println("enter a gpa: ");
		gpa = scan.nextDouble();
		// ....
		
		Helper helper3 = new Helper(age, name, gpa); // non-default constructor
		helper3.printOut();

	} // main

} // Main