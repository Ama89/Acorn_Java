package test.main.step17;

public class MainClass03 {

	public static void main(String[] args) {
		String name1 = "김구라";
		String name2 = "김구라";
		String name3 = new String("김구라");
		String name4 = new String("김구라");
		
		boolean result = name1 == name2;
		System.out.println("name1 : "+name1);
		System.out.println("name3 : "+name3);
		
		if(name1==name3){
			System.out.println("같아요");
		}else{
			System.out.println("달라요");
		}
		
		//String type의 내용을 비교할때는 .equals() 메소드를 이용한다.
		if(name1.equals(name3)){
			System.out.println("내용이 같아요");
		}else{
			System.out.println("내용이 달라요");
		}
	}
}