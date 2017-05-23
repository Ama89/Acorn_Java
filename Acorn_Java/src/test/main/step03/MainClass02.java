package test.main.step03;

/*
 * [java 데이터 type]
 * 
 * 2. 숫자형
 * - 정수형 : byte, short, int, long
 * - 실수형 : float, double
 */
public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		//정수형 변수 선언과 동시에 값 대입하기
		byte iByte = 10;
		short iShort = 10;
		int iInt = 10;
		long iLong = 10;
		
		//실수형 변수 선언과 동시에 값 대입하기
		float num1 = 10.1f;
		double num2 = 10.1d;
		double num3 = 10.1;//d 생략 가능
		System.out.println("메인 메소드가 종료됩니다.");
	}
}
