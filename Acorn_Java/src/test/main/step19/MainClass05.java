package test.main.step19;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainClass05 {

	public static void main(String[] args) {
		OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		try{
			osw.write("여러개의 문자를 한번에 출력해요");
			osw.flush();
			System.out.print(" | ");
			
			char[] chars = {'원', '투', '삼', '사'};
			osw.write(chars);
			osw.flush();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}