package stringtest_1;

public class MethodArrayReturn_p143 {

	
	// 이건 return값이 int니까 함수 이름 앞에 int를 써 준다.
	static int sum(int a, int b) {
		int sum = a + b;
		return sum;	
	}
	
	
	// 이건 return값이 int 배열이니까 함수 이름 앞에 int[]를 써 준다. (double 배열이었으면 double[] outputArray() 이런 식이었겠지.)
	static int[] outputArray(int a, int b, int c) {
		
		int arr[] = new int[3];
		
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int ret[] = new int[3];		// 왜 L14에 static을 붙여야 에러가 없는지는 추후에 알아본다.
//		ret = outputArray(1,2,3);	// 그냥 지금은... 배열로 나온 리턴값(outputArray의 리턴값)은 배열(ret)로 받아야 하는 것만 r고잇으면 되. ㅋ	


		
	}

}
