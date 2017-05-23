package test.main.step18;

public class MainClass06 {

	public static void main(String[] args) {
		System.out.println("메인메소드가 시작되었습니다.");
		
		try {
//			test() 메소드에서 RuntimeException 을 상속 받지 않는
//			Exception 을 발생 시키기 때문에
//			try~catch 블럭으로 Exception 처리해야한다.
			test();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	throw 예약어를 이용해서 Exception 을 던질수도 있다.
	public static void test() throws InterruptedException{
		System.out.println("test() 메소드가 호출되었습니다.");
		Thread.sleep(5000);
	}
}
