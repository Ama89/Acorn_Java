package test.main.step04;

import test.star.Marine;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");

		//Marine type 객체를 생성해서
		//참조값(id)을 이용해서 move()메소드를 호출하기
		//Marine type 객체 1회용으로 사용하기
		new Marine().move();
				
		Marine m1 = new Marine();
		m1.move();
		m1.move();
		m1.move();
		
		System.out.println("메인 메소드가 리턴됩니다.");
	}
}