package test.main.step06;

public class MainClass03 {

	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		 
		test1("hi"); //1. test1(String msg)에 msg값 전달
		test2(10);
		test3(true);
		
	}
	public static void test1(String msg){ // String msg 
										  // test1안에 실행순서 들어왔을 때 잠깐 있었다가 사라지는 지역변수 선언 
		String a = msg; //2. 받아온 msg값 변수에 넣기
		System.out.println(a); //3. msg값이 들어있는 변수 a 출력.
	}
	public static void test2(int num){
		
		int a = num;
		System.out.println(a);
	}
	public static void test3(boolean isRun){
		
		boolean a = isRun;
		System.out.println(a);
	}
}
