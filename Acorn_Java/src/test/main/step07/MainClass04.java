package test.main.step07;

import test.mypac.Computer;
import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.Memory;

public class MainClass04 {
	public static void main(String[] args) {
//		new Computer();
//		Computer 객체를 생성해보세요.
//		기본 데이터 타입이 아니면, 참조값을 만들어 전달해주어야한다.
		new Computer(new Cpu(), new Memory(), new HardDisk());
		
		Cpu a = new Cpu();
		Memory b = new Memory();
		HardDisk c = new HardDisk();
		
//		변수에 담긴 값은 이용해서 Computer 객체를 생성해보세요.
		Computer com1 = new Computer(a, b, c);
		
//		경우에 따라서는 null 값을 전단래서 객체를 생성 할 수 도 있다.
		Computer com2 = new Computer(null, null, null);
	}
}