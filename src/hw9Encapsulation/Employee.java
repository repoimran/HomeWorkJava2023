package hw9Encapsulation;

public class Employee {
	private String name; 
	private int age; 
	private char sex; 
	private boolean citizen;
	// How can you access those variables by the getter and setter method? 
	  // we can, source --> generate getters & setters from context click 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean isCitizen() {
		return citizen;
	}
	public void setCitizen(boolean citizen) {
		this.citizen = citizen;
	}
	
}
