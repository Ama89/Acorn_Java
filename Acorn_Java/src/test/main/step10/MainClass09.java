package test.main.step10;

import test.com.Cpu;
import test.com.NoteBook;

public class MainClass09 {

	public static void main(String[] args) {
		NoteBook c1 = new NoteBook(new Cpu());
//		메소드 호출하기
		c1.operation();
	}
}