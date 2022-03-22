package stringtest_1;

// ��: Ŭ���� �̸��� Exception�̶�� ������ �ʵ��� �����ϼ���!
// ����: �̹� Exception�̶�� Ŭ������ �ڹٿ� �����ؼ�, �츮�� �̹� �ִ� ���̶� �̸� ��ġ�� �� ����� ���� ��


// p150 ��������. try-catch��.
// ������ ���� ���� ���α׷��� �������ᰡ �ȴ�. try-catch������ ��·�� ���� ���Ḧ ������ ����.



import java.util.*;

public class ExceptionTest_p150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int a = 100;	// ���������� �� a�� 100���� ������ ����.
	
	Scanner scann = new Scanner(System.in);
		
		
	System.out.println("���� ������ �ϳ� �Է��غ� �� (����)");	// �������� ���� ��������� ���̴�. ha ha ��������!
	int b = scann.nextInt();
	
	try {
		int ret = a / b;	// 0���� ���𰡸� ������ ���� �� �� ���? �� try-catch���� �̿��ϸ� �� ��
		System.out.println(ret);	// ����� try�� �ȿ� �־�� �Ѵ�. 0���� ���� ��� ret�� ������ �� �Ǳ� ������ ���߿� ����� �� �� ����ؾ���? ������ ��.
	}
	
	catch(ArithmeticException e) {
		System.out.println("0���� ������ �����Դϴ� ��");	
	}
	
//	catch(Exception e) {	// Exception�� try������ �Ͼ�� '���' ������ ���� ��� �ִ� ���̴�. ���� � Ÿ���� ������ �����ϱ� ������ ��...
//		System.out.println("0���� ������ �����Դϴ� ��");	
//	}
		
	
	int arr[] = new int[5];
	
	
	try {
		arr[7] = 10;
		System.out.println(arr[7]);		
	}
		
	catch(Exception e) {
		System.out.println("�迭 �ε��� ����!!!");		
	}
	
	finally {	// finally���� �ᵵ �ǰ� �� �ᵵ �ȵ� ��
		arr[0] = 100;
		System.out.println("finally�� ���� ����� ������ ���� ���� �ݵ�� ����ȵ�.");	
	}

	
	
	scann.close();
	System.out.println("���α׷��� �����մϴ�. ��");	

	
	
	
	
	
	
	}

}
