package stringtest_1;

public class MethodArrayReturn_p143 {

	
	// �̰� return���� int�ϱ� �Լ� �̸� �տ� int�� �� �ش�.
	static int sum(int a, int b) {
		int sum = a + b;
		return sum;	
	}
	
	
	// �̰� return���� int �迭�̴ϱ� �Լ� �̸� �տ� int[]�� �� �ش�. (double �迭�̾����� double[] outputArray() �̷� ���̾�����.)
	static int[] outputArray(int a, int b, int c) {
		
		int arr[] = new int[3];
		
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int ret[] = new int[3];		// �� L14�� static�� �ٿ��� ������ �������� ���Ŀ� �˾ƺ���.
//		ret = outputArray(1,2,3);	// �׳� ������... �迭�� ���� ���ϰ�(outputArray�� ���ϰ�)�� �迭(ret)�� �޾ƾ� �ϴ� �͸� r�������� ��. ��	


		
	}

}
