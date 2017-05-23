package test.main.step12;

import test.mypac.Weapon;

public class MainClass03 {

	public static void main(String[] args) {
		Weapon w1 = new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("김구라를 공격합니다.");
			};			
		};
		//메소드 호출
		w1.prepare();
		w1.attack();
	}
}
