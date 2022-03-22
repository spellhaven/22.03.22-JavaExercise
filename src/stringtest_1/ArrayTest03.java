package stringtest_1;

// 2차원 배열 - 비정방형 배열 ㅋ

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[][];
//		arr = new int[3][4];	// 이렇게 하면 직사각형 모양의 배열이 나온다. 모든 행과 열의 길이가 같은 "정방형 배열"
		
		int arr2[][];
		arr2 = new int[4][];	// 인덱스에 의해 행 길이만 결정되고 열 길이는 뭐. 우리에게 달린 놈 ㅋ. "비정방형 배열"
		
		arr2[0] = new int[3];
		arr2[1] = new int[2];	
		arr2[2] = new int[4];	
		arr2[3] = new int[5];	
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++)	{	//arr2[i].length;라고 한 이유가 바로 이 '비정방형 배열'.
				System.out.println(arr2[i][j]);
			}
		}
	}

}