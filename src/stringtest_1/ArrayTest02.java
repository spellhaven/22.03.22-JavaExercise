package stringtest_1;

// 교재 p.135 for-each문 예제들


public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[] = {10, 30, 15, 20, 100};
		
		for(int i: intArray) {
			System.out.println(i);
		}
		
		String fruits[] = {"사과", "배", "딸기", "바나나"};
		
		for(String i: fruits) {
			System.out.println(i);
		}
		
		
	}

}
