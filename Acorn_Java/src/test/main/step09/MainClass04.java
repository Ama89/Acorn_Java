package test.main.step09;

public class MainClass04 {

	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50};
		
		for(int i=0; i<nums.length; i++){
			int tmp = nums.length;
		}
		
//		확장 for 문
//		for( 배결에 저장된 data type tmp : 배열의 참조값)
		for(int tmp : nums){
			int test = tmp;
		}
	}
}
