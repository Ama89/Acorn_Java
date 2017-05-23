package test.main.step16;

import java.util.ArrayList;
import test.mypac.Car;

public class MainClass02 {

	public static void main(String[] args) {
		//Car 객체의 참조값을 담을수 있는 ArrayList 객체를 생성해서
		//참조값을 변수에 담아보세요.
		ArrayList<Car> cars = new ArrayList<Car>();
			
		//위에서 생성한 ArrayList 객체에 Car 객체의 참조값을
		//3개 저장해 보세요.
		cars.add(new Car("아반떼MD"));
		cars.add(new Car("레인지로버"));
		cars.add(new Car("람보르기니"));
		
		//반복문 for를 이용해서 cars 배열에 저장된 Car type의
		//참조값을 하나씩 불러와서 drive() 메소드를 호출해 보세요.
		System.out.println("-----default for-----");
		for(int i=0; i<cars.size(); i++){
			cars.get(i).drive();
		}
		
		System.out.println("-----for( : )-----");
		for(Car car : cars){			
			car.drive();
		}
	}
}