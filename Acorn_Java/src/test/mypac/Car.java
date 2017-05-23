package test.mypac;

/*
 * 생성자
 * 1. 클래스명과 동일하다.
 * 2. 생성자를 명시적으로 정의하지 않으면 default 생성자는 있다고 간주된다.
 * 3. 객체가 생성되는 시점에 호출되어서 실행순서가 들어온다.
 * 4. 객체가 생성되는 시점에 초기화 작업을 해줄 때 명시적으로 정의해서 사용한다.
 * 5. 메소드와 모양의 차이점은 리턴 type 이 없는것이다. 
 */
public class Car {
	//default 생성자
	//생성자명 == class 명
	//메소드와 달리 리턴타입이 정의되지 않는다.
	
	//필드
	private String name="";
	
	public Car(){
		System.out.println("Car() 생성자 호출됨!");
	}
	
	public Car(String name){
		this.name = name;
	}
	//메소드
	public void drive(){
		System.out.println(this.name+" 이(가) 달려요");
	}
}
