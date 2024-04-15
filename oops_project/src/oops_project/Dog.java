package oops_project;

public class Dog {
	String name;
	String breed;
	public Dog(String name,String breed) {
		this.name= name;
		this.breed = breed;
	}
	public static void main(String args[]) {
		Dog rott=new Dog("Travis", "Rottweiler");
		Dog pam=new Dog("Tyler", "Pamerain");
		System.out.println("1st object name: "+ rott.name + ", age: " + rott.breed);
		System.out.println("1st object name: "+ pam.name + ", age: " + pam.breed);
	}
}
