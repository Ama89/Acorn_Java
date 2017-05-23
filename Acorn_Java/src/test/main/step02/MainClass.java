package test.main.step02; //해당 클래스가 속한 패키지를 명시한다.

//한줄주석입니다.

/*
 * 여러줄 주석입니다.
 * 하나
 * 두울
 * 세엣
 * 주석은 java 인터프리터(해석기)가 해석하지 않고 무시합니다.
 */

//클래스이름은 MainClass
public class MainClass {
	
	//메소드 이름은 main
	//메소드 == 동작 ≒ javascript function
	public static void main(String[] args) {
		//run 버튼을 눌렀을 때 실행순서가 들어오는 특별한 main 메소드
		System.out.println("안녕하세요!");
		System.out.println("이제 시작이군요");
		System.out.println("main 메소드가 리턴됩니다.");
	}
}
