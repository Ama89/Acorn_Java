package test.main.step17;

import test.mypac.Car;

public class MainClass02 {

	public static void main(String[] args) {
		Car car1 = new Car("아반떼");
		Car car2 = new Car("소나타");
		Car car3 = car1;
		
		boolean result = car1 == car2;
		boolean result2 = car1 == car3;
	}
}