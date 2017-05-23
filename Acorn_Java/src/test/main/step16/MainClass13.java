package test.main.step16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
 * [Quiz1]
 * 1. Scanner 객체를 이용해서 문자열을 5번 입력 받아서
 * 입력받은 문자열을 ArrayList 객체에 저장하고
 * 
 * 2. 저장된 문자열을 순서대로 콘솔창에 출력해보세요.
 * 
 * [Quiz2]
 * 1. Scanner 객체를 이용해서 문자열을 5번 입력 받아서
 * 입력받은 문자열을 HashSet 객체에 저장하고
 * 
 * 2. 저장된 문자열을 모두 콘솔창에 출력해보세요.
 */
public class MainClass13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> words1 = new ArrayList<String>();
		
		for(int i=0; i<5; i++){
			System.out.println("문자를 입력하세요. : ");
			String word = scan.nextLine();
			
			words1.add(word);
		}
		
		System.out.println("===== Quiz1. 입력받은 문자들 =====");
		
		for(String word : words1){
			System.out.print(word + " | ");
		}
		System.out.println(" ");
		System.out.println("========== Quiz1. END ==========");
		
		HashSet<String> set = new HashSet<String>();
		
		while(set.size()<5){
			System.out.println("문자를 입력하세요.(중복불가) : ");
			String word = scan.nextLine();
			set.add(word);
		}		
		
		System.out.println("===== Quiz2. 입력받은 문자들 =====");
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String word = it.next();
			System.out.print(word + " | ");
		}
	}
}
