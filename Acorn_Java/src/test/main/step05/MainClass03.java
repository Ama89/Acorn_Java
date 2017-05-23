package test.main.step05;

import test.gura.Util;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		
		//Util 클래스의 static 멤버 필드 참조
		int a = Util.version;
		//Util 클래스의 static 멤버 메소드 참조
		Util.sendMessage();
		
		System.out.println("메인 메소드가 종료됩니다.");
	}
}