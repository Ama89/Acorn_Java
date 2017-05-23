package test.main.step16;

import java.util.Stack;

/*
 * [Stack]
 * - 선입후출 구조로 데이터를 관리하고 싶을 때 사용한다.
 * - 순서가 있는 데이터이다(인덱스가 있음)
 * 
 * 데이터 저장 : .push(데이터)
 * 데이터 빼내기 : .pop()
 * 모두 삭제 : clear()
 * 
 */
public class MainClass15 {

	public static void main(String[] args) {
		Stack<String> stack1 = new Stack<String>();
		stack1.push("하나");
		stack1.push("두울");
		stack1.push("세엣");
		
		/*
		 * .pop() 하면 stack에서 지워지면서 가져온다.
		 */
		String a = stack1.pop(); //세엣
		String b = stack1.pop(); //두울
		String c = stack1.pop(); //하나
				
	}
}