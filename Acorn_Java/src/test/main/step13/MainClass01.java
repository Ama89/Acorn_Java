package test.main.step13;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class MainClass01 {

	public static void main(String[] args) {
//		MyRemocon 클래스의 생설자를 이용해서 Remocon 객체를 생성한 다음
//		Remocon 인터페이스 type 변수에 참조값을 담는다.
		Remocon a = new MyRemocon();
//		메소드 호출하기
		a.up();
		a.down();
		
		Remocon b = new YourRemocon();
		b.up();
		b.down();
		
	}
}
