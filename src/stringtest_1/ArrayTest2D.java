package stringtest_1;

// �ڹٿ����� 2���� �迭�� �� �� �ְڱ�.

public class ArrayTest2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[][]; // 2�����迭 ����
//		arr = new int[3][4];
		
//		int arr2[][] = {{1,2,3},	// ���� arr2[0][0], arr2[0][1], arr2[0][2], 
//						{4,5,6}};		// arr2[1][0], arr2[1][1], arr2[1][2] �̴�.
//				
//		int len = arr2.length;	// 2���� �迭������ length�� ���� ������ ��ȯ�ϰڱ���.
//		System.out.println(len);	
//				
//		int len2 = arr2[0].length;	// �׷��� ���� ������ ���� ������ �� ���� ���̸� ���߰ڱ���. 
//		System.out.println(len2);	// (������ 0��� 1��... ��� ���� ���̰� ������, �� 0��° ���� �� �ʿ䵵 ����.)
		
		
		int arr3[][] = {{1,2,3},	
						{4,5,6},
						{7,8,9}};
		
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++)	{	// ������ �� ���� ���̰� �� ������, �������� �迭(ArrayTest03)������ �ٸ��ݾ�. �� �迭�� �������̱⵵ �ϰ�. �׷��� ����Ʈ �ڵ�... arr3[i].length�� �޴�.
				System.out.println(arr3[i][j]);
			}
				
				
		}
		
		
	}

}
