package test.main.step20;

import java.io.File;
import java.io.IOException;

public class MainClass02 {

	public static void main(String[] args) {
		String path ="c:/myFloder/index.html";
		File file1 = new File(path);
				
		if(file1.exists()){
			System.out.println(path+" 는 이미 존재 합니다.");
			//디렉토리인지 판별
			if(file1.isDirectory()){
				System.out.println(path+" 는 디렉토리입니다.");
			}else{
				System.out.println(path+" 는 파일입니다.");
			}
		}else{
			System.out.println(path+" 는 존재하지 않습니다.");
			try {
				//파일만들기
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}