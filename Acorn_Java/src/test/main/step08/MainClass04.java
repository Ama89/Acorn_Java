package test.main.step08;

import test.mypac.Car;

public class MainClass04 {

	public static void main(String[] args) {
		//tes1, test2, test3, test4 메소드를 순서대로 호출해보세요.
		test1();
		test2(new int[3]);
		test3(new String[3]);
		test4(new Car[3]);
	}
	
	public static void test1(){
		System.out.println("test1() 메소드 호출됨");
	}
	
	public static void test2(int[] nums){
		System.out.println("test2() 메소드 호출됨");
	}
	
	public static void test3(String[] names){
		System.out.println("test3() 메소드 호출됨");
	}
	
	public static void test4(Car[] cars){
		System.out.println("test4() 메소드 호출됨");
	}
}
