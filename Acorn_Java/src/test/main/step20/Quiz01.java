package test.main.step20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * MainClass04를 참고해서
 * 
 * Scanner 객체를 이용해서 문자열을 1줄 입력받고
 * 입력받은 내용을
 * c:/myFolder/quiz01.txt 파일에 기록해 보세요.
 */
public class Quiz01 {

   public static void main(String[] args) {
//      키보드로 부터 입력받을 객체
      Scanner scan = new Scanner(System.in);
            
      String path = "c:/myFolder/quiz01.txt";
//      파일 객체
      File file = new File(path);
      
      try{
         System.out.println("문자열 1줄을 입력 : ");
         String str = scan.nextLine();
         FileWriter fw = new FileWriter(file);
         fw.write(str);
         fw.close();
         System.out.println("파일에 기록했습니다.");
      }catch(IOException ie){
         ie.printStackTrace();
      }
   }
}