package test.main.step10;

import test.mypac.Phone;

public class MainClass03 {
	
	public static void main(String[] args) {
	
//		Phone 객체를 생성해서 참조값을 Object type 변수에 담기
		Object p1 = new Phone();
		
//		casting 연산자를 이용해서 casting 함다음 변수에 담는다.
		Phone p2 = (Phone) p1;
		p2.call();
	}
}
