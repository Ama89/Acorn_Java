package test.main.step09;

import test.mypac.Beer;

public class MainClass05 {

	public static void main(String[] args) {
		String[] names = {"김구라", "해골", "원숭이", "주뎅이", "덩어리"};
		
//		names 배열을 이용해서 확장 for 문을 구성해 보세요.
		for(String name : names){
			System.out.println("이름 : " + name);
		}
		
//		방5개짜리 Beer[] 객체를 생성해서
//		5개의 방에 Beer 객체의 참조값을 넣고
//		확장 for 문을 이용해서 Beer 객체의 .drink() 메소드를 호출해보세요.
		Beer[] beers = new Beer[5];
		beers[0] = new Beer("크림생맥주");
		beers[1] = new Beer("바이젠");
		beers[2] = new Beer("둔켈");
		beers[3] = new Beer("골든에일");
		beers[4] = new Beer("블랑1664");
		
		for(Beer beer : beers){
			beer.drink();
		}
	}
}
