package test.main.step20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * MainClass04를 참고해서
 * 
 * Scanner 객체를 이용해서 문자열을 여러줄 입력받고
 * 입력받은 내용을
 * c:/myFolder/quiz03.txt 파일에 기록해 보세요.
 * 
 * 단, "q" 혹은 "Q"를 입력할 때 까지의 문자열만 저장하세요.
 * hint : StringBuilder 객체 사용하기
 */
public class Quiz03 {

	public static void main(String[] args) {
//		String == CharSequence
		CharSequence a = "abcd";
		
//		키보드로 부터 입력받을 객체
		Scanner scan = new Scanner(System.in);
		
		String path = "c:/myFolder/quiz03.txt";
//		파일 객체
		File file = new File(path);
		
		try{
			FileWriter fw = new FileWriter(file);
			
//			문자열을 누적시킬 StringBuilder 객체 생성하기
			StringBuilder sb = new StringBuilder();
			
			System.out.println("문자열 입력 : ");			
			String str = scan.nextLine();			
			while(true){
				sb.append(str);
				sb.append("\r\n");
				str = scan.nextLine();
				if(str.equals("q") || str.equals("Q")){
					break;
				}
			}
			fw.write(sb.toString());
			fw.close();
			System.out.println("파일에 기록했습니다.");
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}
