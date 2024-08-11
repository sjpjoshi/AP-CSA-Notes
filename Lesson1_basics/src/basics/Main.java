package basics;

// external package
import java.util.Scanner;

//A programming language is an instruction language

// C++, Python, Javascript, Java
// Java IoT language -> internet of things language 
// tax application, weather, camera app, whatsapp or instagram 
// Data structures and android 

// Language levels 
// Highest level language: Human language -> English : computers cannot understand 
// High-Level language: A language close to English but not there yet : computers understand from this and below
// ex: Java, Javascript, Python
// Medium-level language: a language between high level and low level : Ex. C++ (Unofffical: on not on your exam)
// Low-level language : a language far away from English : C 
// Machine Langauge: a language that is not english at all : ASM(assembly language) and Binary 

public class Main {
	public static void main(String[] args) {
		// comment, a note

		// 2 types of comments

		// single-line comment
		// sahdjklfhjkladsflhkjasdjfkhasdkj

		/* 
		 * Multi-line comment/paragraph comment
		 * 
		 * df
		 * sd
		 * s
		 * dfsd
		 * fsd
		 * dfsadf
		 * dfd
		 * */
		
		// --------------------------------------
		
		// ; (semi-colon)
		// tells Java where does a instruction(line) end?
		
		// Identifier 
		// a way we can tell apart pieces of code 
		
		// print outs
		//System.out.println("Hi");
		// System: Console
		// ln: line new
		
		//System.out.print("Hi");
		
		// println -> print a new line after
		// print -> print without a new line after
		
		// --------------------------------------
		
		// basic variables
		// Built-in type
		
		// Three Kings 
		// int: integer -> all whole numbers
		// double: floating-point number : all decimal numbers
		// String: all words
		
		// variableType variableName;
		//pre-declared and un-declared
		// un-declared: it means it exists but we don't know what its equal to
		//int number; 
		//double decimal;
		//String word;
		
		//pre-declared: its means it exists and we know its equal to
		//int number1 = 1; 
		//double decimal1 = 1.1;
		//String word1 = "Hi";
		
		// variable naming rules
		// 1. it cannot start with a number or a special character besides _ (underscore)
			// ex: 1number (No!) number1 (yes!) 
		// 2. Variables cannot share the same names
			// int number double number (No) int number double Number (Yes)
		// 3. Variables are case sensitive  
			// it matters how you spell it int number = 1; Number = 2 (No)
		
		// how to name variables
		// Naming conventions : you dont have to follow them but they are useful
		// 1. camel case notation: variableNameLikeThis : standard way
		// 2. underscores : variable_name_like_this : if my name is too long
				// 2nd type of underscore: _variableName : this means temporary variable
		// 3. numbers : variable2 : duplicate variable
		// 4. Capitals : VARIABLENAME, VARIABLE_NAME, _VARIABLENAME : commonly used for globals, structs, and enums 
		
		// variable print outs
		int number = 235;
		String word = "hi";
		double decimal = 1.1;
		//System.out.println(number);
		
		// = : assignment operator
		number = 1;
		//System.out.println(number);

		// variables maths
		// algebraic statement 
		
		// a double can store a int,
		// but a int cannot store a double
		
		double number1 = 1; // 1 = 1.0
		double number2 = 2; // 2 = 2.0
		double number3 = number1 + number2;
		//System.out.println(number1 + number2);
		
		//number1 = number1 / number2;
		//number1 = number1 * number2;
		//number1 = number1 + number2;
		//number1 = number1 - number2;

		// shortcut
		number1 += number2;
		number1 -= number2;
		number1 *= number2;
		number1 /= number2;

		// x = 1 + 2
		// left hand assignment
		// 1 = x
		// x = 1
		//System.out.println(number1);

		//----------------------------------------
		// Control flow
		// logic 
		
		// basics ones
		// if statement
		// if P then Q
		// if P is true 
			// then do Q
		// or
		// if P is false
			// then do Q
		
		// if () {}

		// conditional operators || relationship operators(from your book)
		// == : equal to
		// != : not equal to
		// >  : greater than
		// >= : greater than or equal to
		// <  : less than
		// <= : less than or equal to
		
		number1 = 2; 
		number2 = 1;
		if(number1 > number2) { // start point
			//System.out.println("hi"); 
		} // end point 
		
		number1 = 1; 
		number2 = 2; 
			
		// variations of the if statement 
		// if else
		if (number1 < number2) {
			//System.out.println("hi"); 
		} else {
			//System.out.println("there"); 	
		} // else
		
		number1 = 1; 
		number2 = 1;
		// else if
		// else if ladder
		// the first statement that is true will run, the rest will be ignored
		if(number1 <= number2) {
			//System.out.println("1"); 	

		} else if(number1 == number2) {
			//System.out.println("2"); 	

		} else if(number1 >= number2) {
			//System.out.println("3"); 	

		} else {
			//System.out.println("4"); 	

		} // else
		
		// Logical operators
		// and or
		number1 = 1; 
		number2 = 2;
		
		// and: &&
		// both conditions must be true
		if(number1 == number2 && number1 < 3 && number2 > 3) {
			//System.out.println("hi"); 	

		} // if
		
		// or: ||
		// one of the conditions must be true
		if(number1 == number2 || number1 < 3 || number2 == 2) {
			//System.out.println("hi"); 	

		} // if
		
		//---------------
		// PEMDAS in Java
		// Operator Precedence 
		
		// you can get this confusing statement here if you dont know the operator precedence
		// later in class we will talk about this
		// if(a++ != b /= 3 || --a * 3 == b++ % 3)  { true or false? }
		
		// 1. !, ++, -- (at a later date ill talk about these)
		// 2. *. /, %(module -> later)
		// 3. +, -
		// 4. <, >, <=, >=
		// 5. ==, !=
		// 6. &&
		// 7. ||
		
		//--------------------
		// User Input
		// Java cannot handle user input without a helper
		
		// Scanner will take in input
		Scanner scan = new Scanner(System.in);
		// created a Scanner variable called scan
		// i have set equal to a new Scanner Type with System.in
		
		String temp3;
		System.out.print("enter a word: ");
		temp3 = scan.nextLine(); 
		// .next() -> a single word
		// .nextLine() -> a full sentence
		System.out.println(temp3);
		
		int temp;
		System.out.print("enter a number: ");
		temp = scan.nextInt();
		System.out.println(temp);

		double temp2;
		System.out.print("enter a double: ");
		temp2 = scan.nextDouble();
		System.out.println(temp2);

	} // main

} // Main