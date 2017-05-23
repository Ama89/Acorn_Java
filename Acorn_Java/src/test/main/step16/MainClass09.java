package test.main.step16;

import java.util.Random;

public class MainClass09 {

	public static void main(String[] args) {
		//Random 객체 생성해서 참조값을 변수에 담기
		Random ran = new Random();
		
		//0~9 사이의 랜덤한 정수
		int num1 = ran.nextInt(10);
		//0~1 사이의 랜덤한 정수
		int num2 = ran.nextInt(2);
		//0~24 사이의 랜덤한 정수
		int num3 = ran.nextInt(25);
		//-20~20 사이의 랜덤한 정수
		int num4 = ran.nextInt(41)-20;
	}
}
