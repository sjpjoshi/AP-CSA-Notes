package lesson;

public class Helper {

	// Instance: to run once
	// in Java, when a class is created the variable is created once
	// after the program is done, the variables are deleted
	
	// Instance variable
	// [identifier] [variableType] [variable name]
	// public: open to everyone
	// private: only can be used by the class its in
	public int age;
	private String name;
	private double gpa;
	
	// Constructor
	// Default constructor
	public Helper() {
		
	}
	
	// non-default constructor
	public Helper(int Age, String Name, double GPA) {
		age = Age;
		name = Name;
		gpa = GPA;
		
	} // Helper
	
	// getter and setter
		// next class
	
	// helper method
	public void printOut() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("gpa: " + gpa);

	} // printOut
	
} // Helper