package stringtest_1;

import java.util.*;

// 22.03.22 ȭ ���� ���� �� - �ٸ� �п� �� ��ũ���� ���� ��ũ ��带 ����� �ξ� ����.
// ��� ������ �۾��� �� ���̰� �ϸ� ��ũ ��嵵 ���� ¯�̳�.

// Ctrl + Space�� �ƹ� ���� �� �� �ִ�. ���� ������ ����, �Լ� ����� �̸��� �ڵ��ϼ���ų �� ����� ���ϴ�! ^^

// p 133 ������ ��ġ ���� ������ �б� �ϵ� ���� �� ���� �ǹ̸� ü���ϴ� ��. ��


public class ArrayTest_Misc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max = 0;	// max�� ���� ���� ū ���� ����� �ߴ�. �� int max = 0; �ʱ�ȭ ���� ��.
		
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i = 0; i < 5; i++) {
			intArray[i] = scanner.nextInt();	// �Է¹��� ������ �迭�� ����. ũ��
			
			if(intArray[i] > max) {		//intArray[i]�� ���� ���� ū ������ ũ��?
				max = intArray[i];		// intArray[i]�� max�� ���� ��
			}
		}
		
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
		int arr_length = intArray.length;
		System.out.print("�迭�� ���̴� " + arr_length + "�Դϴ�. ��");		
		
		
		// .length �޼ҵ�� ����� �����ϴ�. Ư�� for������.
		// for(int i = 0; i < intArray.length; i++) �̷� ������ ���� ���ϱ� ����. �迭 ���̸� �츮�� ������ �� �ʿ䵵 ����.
		// Ư�� �����ϴ� ������ �迭�� �����ϱ� ���̾�. ��ư ���ڸ� ���� ���� ���� �迭 ���̸� �޼ҵ�� ���ؼ� ������ ���̾�.
		// "������ �ڵ�"! "����Ʈ�� �ڵ�"! �� normie ������ ǥ���ϸ� ���¹�ȣ�� ���� ���� ��Ÿ�� ���ϱ�, �׷��� �ʰ� �����ϴ� �����̴�. ���� ���ƿ�.
		
		
		
		
		scanner.close();
		
	}

}
