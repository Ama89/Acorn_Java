package test.main.step07;

import test.mypac.AttackUnit;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		AttackUnit unit1 = new AttackUnit();
		AttackUnit unit2 = new AttackUnit(10);
		AttackUnit unit3 = new AttackUnit(999);
		AttackUnit unit4 = new AttackUnit("kim");
		AttackUnit unit5 = new AttackUnit(100, "yumi");
	}
}
