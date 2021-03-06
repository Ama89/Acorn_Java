package test.main.step16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/*
 * HashSet 객체를 이용해서 중복되지 않는 로또 번호 얻어내기
 */
public class MainClass12 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		//로또 번호를 담을 HashSet 객체 생성해서 참조값 변수에 담기
		Set<Integer> set = new HashSet<>();
		
//		HashSet의 size가 6보다 작은 동안에 계속 반복문을 수행
		while(set.size()<6){
//			1~45 사이의 랜덤한 숫자를 얻어내서
			int ranNum = ran.nextInt(45)+1;
//			hashSet 객체에 담는다.
			set.add(ranNum); //같은 값이 있으면 size가 증가하지 않는다.
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			Integer tmp = it.next();
			System.out.print(tmp + " | ");
		}
	}
}
