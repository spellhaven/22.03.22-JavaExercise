package stringtest_1;

// 자바에서도 2차원 배열을 할 수 있겠군.

public class ArrayTest2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[][]; // 2차원배열 선언
//		arr = new int[3][4];
		
//		int arr2[][] = {{1,2,3},	// 각각 arr2[0][0], arr2[0][1], arr2[0][2], 
//						{4,5,6}};		// arr2[1][0], arr2[1][1], arr2[1][2] 이다.
//				
//		int len = arr2.length;	// 2차원 배열에서는 length가 행의 개수를 반환하겠구나.
//		System.out.println(len);	
//				
//		int len2 = arr2[0].length;	// 그래서 열의 개수를 세고 싶으면 한 행의 길이를 세야겠구나. 
//		System.out.println(len2);	// (지금은 0행과 1행... 모든 행의 길이가 같으니, 꼭 0번째 행을 셀 필요도 없다.)
		
		
		int arr3[][] = {{1,2,3},	
						{4,5,6},
						{7,8,9}};
		
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++)	{	// 지금은 각 행의 길이가 다 같으나, 비정방형 배열(ArrayTest03)에서는 다르잖아. 또 배열은 가변적이기도 하고. 그래서 소프트 코딩... arr3[i].length로 햇다.
				System.out.println(arr3[i][j]);
			}
				
				
		}
		
		
	}

}
