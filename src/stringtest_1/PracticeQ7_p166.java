package stringtest_1;

// �����̴� ���α׷��� õ�簡 �ƴұ�? ��

public class PracticeQ7_p166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[] = new int[10];
			
		int arrlnth = intArray.length;	// ���� ���� 10���� �ϵ��ڵ� �� �ϰ� .length�� �� �ô�. ��ư 10 �� ������?
//		System.out.println(arrlnth);		
		
		int sum = 0;	// ������������ �հ� ����� sum�� avg��.
		double avg = 0; // avg�� double�̾�� ��. ������ ��
		
		
		System.out.println("������ ������ :");
		
		// ���� ���� �����ؼ� intArray[]�� �־� �ִ� ��
		for(int i = 0; i < arrlnth; i++)  {
			intArray[i] = (int)(Math.random()*10 + 1);	// �迭�� �������� ����
			System.out.print(" " + intArray[i]);	// �µ��� ����Ʈ��
		}
		
		
		for(int i = 0; i < arrlnth; i++)  {
			sum = sum + intArray[i];
		}
		
		avg = (double)sum / arrlnth;	// ���⿡ (double) ���� �� ��
		
		
		// ��� ���� ��� ��
		System.out.println("\n����� " + avg);
	
	}

}


