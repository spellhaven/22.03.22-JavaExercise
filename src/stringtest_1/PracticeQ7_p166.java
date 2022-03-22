package stringtest_1;

// 깜찍이는 프로그래밍 천재가 아닐까? ㅋ

public class PracticeQ7_p166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[] = new int[10];
			
		int arrlnth = intArray.length;	// 괜히 길이 10으로 하드코딩 안 하고 .length로 해 봤다. 여튼 10 잘 나오죠?
//		System.out.println(arrlnth);		
		
		int sum = 0;	// 랜덤정수들의 합과 평균을 sum과 avg로.
		double avg = 0; // avg는 double이어야 함. 잊지마 ㅋ
		
		
		System.out.println("랜덤한 정수들 :");
		
		// 랜덤 정수 생성해서 intArray[]에 넣어 주는 놈
		for(int i = 0; i < arrlnth; i++)  {
			intArray[i] = (int)(Math.random()*10 + 1);	// 배열에 랜덤정수 넣음
			System.out.print(" " + intArray[i]);	// 걔들을 프린트함
		}
		
		
		for(int i = 0; i < arrlnth; i++)  {
			sum = sum + intArray[i];
		}
		
		avg = (double)sum / arrlnth;	// 여기에 (double) 잊지 마 ㅋ
		
		
		// 평균 구해 줘야 함
		System.out.println("\n평균은 " + avg);
	
	}

}


