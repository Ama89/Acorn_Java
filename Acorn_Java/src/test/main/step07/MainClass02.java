package test.main.step07;

import test.mypac.AttackUnit;

public class MainClass02 {
	
	public static void main(String[] args) {
		
		new AttackUnit().attack();
		new AttackUnit(10).attack();
		
		AttackUnit a = new AttackUnit();
		a.attack();
		
		AttackUnit b = new AttackUnit(10);
		b.attack();
	}	
}
