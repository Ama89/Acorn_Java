package test.main.step04;

import test.factory.MyFactory;

public class MainClass06 {

	public static void main(String[] args) {
		//MyFactory 클래스에 정의된 static 멤버 메소드를 모두 호출해보세요.
		//리턴해주는 데이터가 있다면 변수에 담아보세요.
		//변수는 데이터의 키값을 가진다.
		MyFactory.printMsg();
		int count = MyFactory.getCount();
		String msg = MyFactory.getMsg();
		
	}
}