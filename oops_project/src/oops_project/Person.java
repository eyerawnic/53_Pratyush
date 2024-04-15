package oops_project;
public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name= name;
		this.age = age;
	}
	public static void main(String args[]) {
		Person Pratyush = new Person("Pratyush", 20);
		Person Ritik = new Person("Ritik", 21);
		System.out.println("1st object name: "+ Pratyush.name + ", age: " + Pratyush.age);
		System.out.println("1st object name: "+ Ritik.name + ", age: " + Ritik.age);
	}

}