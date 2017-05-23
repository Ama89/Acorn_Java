package test.main.step12;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
import test.mypac.YourWeapon;

public class MainClass02 {

	public static void main(String[] args) {
		Weapon w1 = new MyWeapon();
		w1.prepare();
		w1.attack();
		
		Weapon w2 = new YourWeapon();
		w2.prepare();
		w2.attack();
	}
}