package test.main.step04;

public class MainClass04 {
		
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		
		//getNum() 메소드가 리턴해주는 int 값을
		//int type a라는 변수에 대입 연산자로 담기
		int a = getNum();
		
		System.out.println("메인 메소드가 리턴됩니다.");
	}
	
	//메소드를 호출한 그 위치로 int type 데이터를 return 해주는
	//static 멤버 메소드
	public static int getNum(){
		System.out.println("getNum() 호출됨");
		return 999;
	}
}