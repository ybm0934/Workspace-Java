package Interface;

public class InterfaceTest {

	public static void main(String[] args) {
		TV tv = new TV();
		Car car = new Car();

		tv.powerOn();
		tv.volumeUp();
		car.powerOn();
		car.volumeDown();

		IAudio[] objs = new IAudio[2];
		objs[0] = tv;
		objs[1] = car;
		
		for(IAudio obj : objs) {
			obj.powerOff();
		}

	}
}

interface IAudio {
	final int MAX_VOLUME = 10;

	void powerOn();

	void powerOff();

	void volumeUp();

	void volumeDown();
}

class TV implements IAudio {
	public TV() {
		System.out.println("TV 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("TV Audio On");
	}

	@Override
	public void powerOff() {
		System.out.println("TV Audio Off");
	}

	@Override
	public void volumeUp() {
		System.out.println("TV Volume Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("TV Volume Down");
	}

}

class Car implements IAudio {
	public Car() {
		System.out.println("Car 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("Car Audio PowerOn");

	}

	@Override
	public void powerOff() {
		System.out.println("Car Audio PowerOff");
	}

	@Override
	public void volumeUp() {
		System.out.println("Car Audio VolumeUp");
	}

	@Override
	public void volumeDown() {
		System.out.println("Car Audio VolumeDown");
	}

}