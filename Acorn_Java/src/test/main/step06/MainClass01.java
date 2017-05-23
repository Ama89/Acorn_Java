package test.main.step06;

import test.mypac.Emart;

public class MainClass01 {

	public static void main(String[] args) {
		//MainClass01.test1();
		test1(); //메소드 호출_아무것도 전달않기
		test2(1); //메소드 호출과, int type value 전달하기
		
		//static 예약어가 붙지 않은 것은 -> 실체를 만들어야한다.
		//								 -> 설계도 대로 main 클래스 안에 객체를 생성.
		MainClass01 a = new MainClass01(); // new MainClass01() 이부분은 heap영역에-> id값/field값/참조값으로 할당.
		a.test3(); // (=) new MainClass01.test3();
		
	}
	public static void test1(){
		
	}
	public static void test2(int num){
		
	}
	public void test3(){
		
	}
}
