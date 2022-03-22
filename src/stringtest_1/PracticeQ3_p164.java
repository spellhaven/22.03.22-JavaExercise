package stringtest_1;

import java.util.*;

// 슉. 슈슉. 시발놈아.
// p 164 연습문제 3, 5, 7번을 풀라고 추천해 주셨다 ㅋ

public class PracticeQ3_p164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner thcan = new Scanner(System.in);	// 노홍철 발음으로 스캔 아니라 th캔이라고 만들었다 ㅋ.
			
		System.out.println("정수를 입력하시오>>");		
		int input = thcan.nextInt();
		
		for(int i = 0; i < input ;i++) {
			
			for (int j = 0; j < input - i ;j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");		// 자바에서 \n이 프린트가 잘 되나 ㅋ?
		}
		
		thcan.close();

	}

}
