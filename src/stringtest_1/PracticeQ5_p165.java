package stringtest_1;

import java.util.Scanner;	// �� �� ��� ���� �Է��� �� �ƴѵ�? �ؿ� �� �����ߴ��� �׳� ����? �ΰ�����??

public class PracticeQ5_p165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner thcan = new Scanner(System.in);	// ��ȫö �������� ��ĵ �ƴ϶� thĵ�̶�� ������� ��.
		
		System.out.println("���� ���� 10���� �Է��Ͻÿ�>>");
		
		int intArray[] = new int[10]; 
		
		
		for(int i = 0; i < intArray.length; i++) {	// �Է¹��� ������ �迭�� ����. ũ��.
			intArray[i] = thcan.nextInt();	
			}
		
		System.out.print("3�� ����� ");
		
		for(int i = 0; i < 10; i++) {	// ����� �������� for�� ������ 3�� ����� ���
			if (intArray[i] % 3 == 0) {	// ha ha ���� �� =�� == �򰥷ȴ� ��
				System.out.print(intArray[i] + " ");	// ha ha �����̽� �����ؼ� �ܼ��� �����ϰ� 993452346�̶�� �Ԥ�
			}	
		}	
		thcan.close();
	}
}
