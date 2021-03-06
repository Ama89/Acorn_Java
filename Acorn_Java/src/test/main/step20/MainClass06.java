package test.main.step20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass06 {

	public static void main(String[] args) {
		File file = new File("c:/myFolder/myMemo.txt");
		try{
//			파일에서 문자열을 읽어들일 수 있는 FileReader 객체 생성
			FileReader fr = new FileReader(file);
//			문자열을 줄단위로 읽어올 수 있는 BufferedReader 객체 생성
			BufferedReader br = new BufferedReader(fr);
//			반복문 돌면서 줄단위로 읽어들이기
			while(true){
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}
		}catch(FileNotFoundException fe){
			fe.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}
