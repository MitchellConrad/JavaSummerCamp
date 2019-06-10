
public class Person {
	
	//Fields aka instance variable 
	//think: adjectives
	private int age;
	private int height; //height in inches
	private double weight; //weight pounds
	private String nationality;
	private String birthday;
	public String name; 
	
	//Constructor
	Person() {
		name = "";
		age = 0;
		height = 0;
		weight = 0;
		nationality = "";
		birthday = ""; 
	}
	
	//Overloaded constructor
	Person(int age, int height, double weight, String nationality, String birthday, String name) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.nationality = nationality;
		this.birthday = birthday; 
		this.name = name; 
	}
	
	//Getter and Setter
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	//methods or functions
	//think: verbs 
	String speak() {
		return "Hello, brah, my name is " + this.name;
	}
	
	String speak(String phrase) {
		return "Hello, " + phrase + ", my name is " + name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person firstPerson = new Person();
//		Person secondPerson = new Person(15 , 72 , 110, "Indian", "12/5/2003", "Neal");
//		System.out.println(firstPerson.age);
//		System.out.println(secondPerson.age);
//		System.out.println(firstPerson.speak());
//		System.out.println(secondPerson.speak());
//		System.out.println(secondPerson.speak("how you doing"));
//		
		

	}

}
