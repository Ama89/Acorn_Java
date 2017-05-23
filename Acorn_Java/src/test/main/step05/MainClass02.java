package test.main.step05;

import test.auto.Car;

public class MainClass02 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		c2.brand = "쌍용";
		
		String a = c1.brand;
		String b = c2.brand;
	}
}
