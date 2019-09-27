package AbstractClass;

public class AbstractClassTest {

	public static void main(String[] args) {

		// Animal animal = new Animal("animal"); --인스턴스 생성 불가능. 따라서 오로지 상속만 가능
		Dog dog = new Dog("멍멍이");
		Tiger tiger = new Tiger("호돌이");
		dog.run();
		tiger.run();

		TV tv = new TV("거실용");
		tv.volumeControl();
		System.out.println("-----behavior() 실행-----");
		tv.behavior();
	}

}

abstract class Animal {
	String name;

	public Animal(String name) {
		this.name = name;

	}

	public void eat() {
		System.out.println("잘 먹는다!!!");
	}

	public abstract void run();

}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(name + "가 잘 달린다.");
	}
}

class Tiger extends Animal {
	public Tiger(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(name + "가 정말 잘 달린다.");

	}

}

abstract class Audio {
	String name;

	public Audio(String name) {
		this.name = name;
	}

	public void powerOn() {
		System.out.println("Audio Power On");
	}

	public void powerOff() {
		System.out.println("Audio Power Off");
	}

	public abstract void volumeControl();

	public final void behavior() {	//final 메소드는 오버라이딩 금지
		powerOn();
		volumeControl();
		powerOff();
	}
}

class TV extends Audio {
	public TV(String name) {
		super(name);
	}

	@Override
	public void volumeControl() {
		System.out.println(name + " 영화에 최적화 된 볼륨 조절");
	}

}
