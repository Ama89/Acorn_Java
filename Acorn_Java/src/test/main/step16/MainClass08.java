package test.main.step16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * [HashMap]
 * - key : value 형태로 데이터를 관리하고자 할때 사용한다.
 * - Generic 클래스는 2개를 지정해야한다. key Generic, value Generic
 * - 데이터 저장 : .put(key, value)
 * - 데이터 참조 : .get(key)
 * - key 존재여부 확인 : .containsKey(key)
 * - 데이터 모두 삭제 : .clear()
 * - 특정 데이터 삭제 : .remove(key)
 */
public class MainClass08 {

	public static void main(String[] args) {
//		String Type value 를 저장할 수 있는 HashMap 객체 생성하기
		Map<String, String> map = new HashMap();
		map.put("car", "명사, 자동차");
		map.put("cat", "명사, 고냥이");
		map.put("can", "조동사, ~할 수 있다.");
		map.put("housen", "명사, 냉장고");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 단어 : ");
		String word = scan.nextLine();
		
		if(map.containsKey(word)){
			String mean = map.get(word);
			System.out.println(word + " : " + mean);
		}else{
			System.out.println("존재하지 않는 단어입니다.");
		}
	}
}