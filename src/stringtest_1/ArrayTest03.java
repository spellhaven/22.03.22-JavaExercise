package stringtest_1;

// 2���� �迭 - �������� �迭 ��

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[][];
//		arr = new int[3][4];	// �̷��� �ϸ� ���簢�� ����� �迭�� ���´�. ��� ��� ���� ���̰� ���� "������ �迭"
		
		int arr2[][];
		arr2 = new int[4][];	// �ε����� ���� �� ���̸� �����ǰ� �� ���̴� ��. �츮���� �޸� �� ��. "�������� �迭"
		
		arr2[0] = new int[3];
		arr2[1] = new int[2];	
		arr2[2] = new int[4];	
		arr2[3] = new int[5];	
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++)	{	//arr2[i].length;��� �� ������ �ٷ� �� '�������� �迭'.
				System.out.println(arr2[i][j]);
			}
		}
	}

}