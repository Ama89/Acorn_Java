package test.mypac;

/*
 * [interface]
 * - 생성자가 없다.(객체 생성 불가)
 * - 추상 메소드만 정의할 수 있다.
 * - 필드는 static final(상수) 멤버필드만 가질 수 있다.
 * - 데이터 type 역활을 할 수 있다. 
 */
public interface Remocon {
//	필드 정의하기
	public static final String COMPANY="LG";
	public static final int VERSION=1;

//	메소드 정의하기
	public abstract void up();
	public void down(); //abstract 생략 가능
}
