package test.main.step10;

import test.mypac.Car;
import test.mypac.Phone;

public class MainClass04 {

	public static void main(String[] args) {
		Object c1 = new Car();
		
//		ClassCastException 발생
		Phone c2 = (Phone) c1;
		c2.call();
	}
}