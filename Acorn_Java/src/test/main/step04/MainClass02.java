package test.main.step04;

public class MainClass02 {
	
	//static 멤버 메소드
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		//static 멤버 메소드 호출하기
		test();
		System.out.println("메인 메소드가 종료 됩니다.");
	}
	
	//static 멤버 메소드
	public static void test(){
		System.out.println("test() 메소드가 호출되었습니다.");
		System.out.println("test() 메소드가 종료(리턴) 됩니다.");
	}
}
