package test.main.step13;

import test.mypac.Remocon;

public class MainClass02 {

	public static void main(String[] args) {
//		익명의 local inner class 를 이용해서 Remocon type 참조값
//		얻어내서 Remocon type  변수에 담기
		Remocon a = new Remocon() {
			
			@Override
			public void up() {
				System.out.println("볼륨을 올려요");
			}
			
			@Override
			public void down() {
				System.out.println("볼륨을 내려요");
			}
		};
		a.up();
		a.down();
	}
}
