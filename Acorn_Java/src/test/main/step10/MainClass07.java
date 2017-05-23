package test.main.step10;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass07 {

	public static void main(String[] args) {
//		HandPhone 객체를 생성해서 참조값을 변수에 담기
		HandPhone p1 = new HandPhone();
		
//		ClassCastException 발생
//		cast type 정확히 확인 후 casting!
		SmartPhone p2 = (SmartPhone)p1;
		p2.call();
	}
}
