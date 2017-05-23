package test.main.step07;

import test.mypac.Person;

public class MainClass05 {
	public static void main(String[] args) {
		//Person 객체를 3개 생성해서 참조값을 각각 변수에 담아보세요.
		Person ama = new Person(10, 15.5, "ama");
		Person rara = new Person(20, 48.3, "rara");
		Person lulu = new Person(30, 50.1, "lulu");
				
		ama.showInfo();
		rara.showInfo();
		lulu.showInfo();
	}
}