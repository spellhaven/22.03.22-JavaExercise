package stringtest_1;

import java.util.Scanner;	// 어 이 명령 내가 입력한 거 아닌데? 밑에 글 복붙했더니 그냥 생김? 인공지능??

public class PracticeQ5_p165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner thcan = new Scanner(System.in);	// 노홍철 발음으로 스캔 아니라 th캔이라고 만들었다 ㅋ.
		
		System.out.println("양의 정수 10개를 입력하시오>>");
		
		int intArray[] = new int[10]; 
		
		
		for(int i = 0; i < intArray.length; i++) {	// 입력받은 정수를 배열에 저장. 크킄.
			intArray[i] = thcan.nextInt();	
			}
		
		System.out.print("3의 배수는 ");
		
		for(int i = 0; i < 10; i++) {	// 저장된 정수들을 for문 돌려서 3의 배수만 출력
			if (intArray[i] % 3 == 0) {	// ha ha 내가 또 =랑 == 헷갈렸다 ㅋ
				System.out.print(intArray[i] + " ");	// ha ha 스페이스 깜빡해서 콘솔이 충직하게 993452346이라고 함ㅋ
			}	
		}	
		thcan.close();
	}
}
