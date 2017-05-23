package test.main.step04;

//다른 패키지에 있는 특정 클래스 import 하기
import test.plane.AirPlane;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		
		//같은 패키지안에 다른 클래스의 static 멤버 메소드 호출하기
		Person.sing();
		
		//다른 패키지안에 클래스의 static 멤버 메소드 호출하기
		AirPlane.fly();
		
		System.out.println("메인 메소드가 종료됩니다.");
	}
}