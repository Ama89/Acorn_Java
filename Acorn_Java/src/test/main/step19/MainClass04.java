package test.main.step19;

import java.io.IOException;
import java.io.OutputStream;

public class MainClass04 {

	public static void main(String[] args) {
//		콘솔에 출력할 수 있는 객체의 참조값을
//		OutputStream type 변수에 담기
		OutputStream os = System.out;
		try {
			os.write(97);	//출력할 준비
			os.write(98);
			os.write(99);
			os.write(100);
			
			//byte[] 배열 객체를 만들고
			byte[] buffer={65, 66, 67, 68};
			//write() 메소드 호출하면서 배열의 참조값 전달하기
			os.write(buffer);
			System.out.print(" | ");
			os.write(buffer, 1, 3);
			os.flush();		//방출(출력)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}