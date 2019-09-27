package Inheritance;

public class Animal {
	protected String name;

	public Animal() {
		System.out.println("Animal instance 생성");
	}
	
	public Animal(String name) {
		this.name = name;
		System.out.println("Animal instance 생성");
	}

	public void eat() {
		System.out.println("Animal [ " + name + " ]이 먹다");
	}

	public void run() {
		System.out.println("Animal [ " + name + " ]이 달린다");
	}

}
