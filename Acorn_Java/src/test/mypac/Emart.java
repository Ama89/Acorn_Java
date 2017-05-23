package test.mypac;

//설계도 = 실체를 만들기전에는 없는 의미 -> 객체를 생성해 주어야 함.
//new Emart().order(); -> 이마트라는 객체를 설계해서 order()의 기능을 수행함 
public class Emart {	
	//static예약어가 붙지 않은 가상의 메소드 3개
	//주문하는 메소드
	public void order(){
		System.out.println("order 메소드 호출됨");
		//this 예약어_make()메소드와 deliver()메소드의 참조값을 가리키는 예약어.		
		this.make();
		deliver(); //같은멤버 객체끼리는 this 생략가능.but 꼭 써줘야 되는 경우도 있다.
		
	}
	//상품을 만드는 메소드
	public void make(){
		System.out.println("make 메소드 호출됨");
	}
	//상품을 배달하는 메소드 
	public void deliver(){
		System.out.println("deliver 메소드 호출됨");
	}
}
