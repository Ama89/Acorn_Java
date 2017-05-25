package test.main.step20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {

	public static void main(String[] args) {
		String path = "c:/myFolder/myMemo.txt";
		File file = new File(path);
		
		try{
			FileWriter fw = new FileWriter(file);
			fw.write("김구라\r\n");
			fw.write("해골\r\n");
			fw.write("원숭이");
			fw.close();//.close() 하는 시점에 파일이 만들어진다.
			System.out.println("파일에 기록했습니다.");
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}
