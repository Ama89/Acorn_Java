package test.main.step09;

public class MainClass01 {

	public static void main(String[] args) {
		
		System.out.println("메인 메소드가 시작되었습니다.");
//		반복문 for 사용해보기
		for(int i=0; i<10; i++){
//			반복되는 동안에 i는 0~9까지 1씩 증가한다.
//			tmp라는 변수는 만들어지고 사라지고를 반복한다.
			int tmp = i;
			System.out.println(i);
		}
//		반복문이 끝난 후 i라는 변수는 사라진다.
		
		System.out.println("메인 메소드가 종료됩니다.");
	}
}
