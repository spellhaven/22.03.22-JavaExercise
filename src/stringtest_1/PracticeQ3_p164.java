package stringtest_1;

import java.util.*;

// ��. ����. �ù߳��.
// p 164 �������� 3, 5, 7���� Ǯ��� ��õ�� �̴ּ� ��

public class PracticeQ3_p164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner thcan = new Scanner(System.in);	// ��ȫö �������� ��ĵ �ƴ϶� thĵ�̶�� ������� ��.
			
		System.out.println("������ �Է��Ͻÿ�>>");		
		int input = thcan.nextInt();
		
		for(int i = 0; i < input ;i++) {
			
			for (int j = 0; j < input - i ;j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");		// �ڹٿ��� \n�� ����Ʈ�� �� �ǳ� ��?
		}
		
		thcan.close();

	}

}
