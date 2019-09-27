package Inheritance;

public class AnimalMain {

	public static void main(String[] args) {

		Dog dog = new Dog("강아지", 2);
		Cat cat = new Cat("고양이", 3.9);

		System.out.println();
		dog.eat();
		cat.eat();
		System.out.println();
		dog.run();
		cat.run();

		System.out.println();
		Animal[] animals = new Animal[5];
		animals[0] = new Dog("강아지2", 1);
		animals[1] = new Cat("고양이2", 1.5);
		for (int i = 0; i < 2; i++) {
			animals[i].eat();
		} // for

		for (int i = 0; i < 2; i++) {
			if (animals[i] instanceof Dog) {
				((Dog) animals[i]).playDog();
			} else if (animals[i] instanceof Cat) {
				((Cat) animals[i]).playCat();
			} // if
		} // for

	}// main
}
