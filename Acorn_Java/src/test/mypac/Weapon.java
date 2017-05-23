package test.mypac;

/*
 * 추상클래스(Abstract Class)
 * 
 * - class 예약어 앞에 abstract 를 명시해서 클래스를 정의한다.
 * - 형태만 정의되고 실제 구현은 되지 않은 메소드가 존재할 수 있다.
 * - 생성자는 존재하지만 단독으로 객체 생성은 불가하다.
 * - 추상클래스 Type의 id가 필요하다면 추상클래스를 상속받은 자식 클래스를 정의해서 객체 생성한다.
 * - 추상클래스를 상속받은 자식클래스는 부모의 추상메소드를 모두 오버라이드(재정의) 해야한다.
 */
public abstract class Weapon {
	//생성자
	public Weapon(){
		System.out.println("Weapon() 생성자 호출됨");
	}

	//멤버메소드
	public void prepare(){
		System.out.println("무기의 작동을 준비합니다.");
	}
	
	//추상메소드 : 메소드 형태만 정해지고 어떤 동작을 할지 정해지지 않은 메소드
	public abstract void attack();
}
