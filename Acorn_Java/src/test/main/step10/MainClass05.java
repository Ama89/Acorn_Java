package test.main.step10;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		p1.call(); //Phone 클래스에 정의된 기능 사용가능
		p1.mobileCall();
		p1.takePicture();
		
		SmartPhone p2 = new SmartPhone();
		p2.call();			//Phone 클래스에 정의된 기능
		p2.mobileCall();	//HandPhone 클래스에 정의된 기능
		p2.takePicture();	//HandPhone 클래스에 정의된 기능
		p2.doInternet();	//SmartPhone 클래스에 정의된 기능
	}
}