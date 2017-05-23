package test.main.step06;

import test.mypac.Emart;

public class MainClass02 {

	public static void main(String[] args) {
		//설계된 Emart Class를 객체 생성해서 order() 메소드 호출.
		//실행 순서 유의(this 예약어)
		new Emart().order(); //id=19, 여기안에서의 메소드를 호출할때의 this = 19
		new Emart().order(); //id=20, 여기안에서의 메소드를 호출할때의 this = 20
		
	}
}
