package stringtest_1;

import java.util.*;

// 교과서 p 126 예제 - 입력기
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		
		while (true) {
			System.out.print(">>");
			String txt = scann.nextLine();	// 문자열 입력 + 띄어쓰기까지 다 받아 주는 놈, nextLine. 당연히 더 쓰임새 많음
//			String txt = scann.next();	// 문자열 입력을 받긴 받는데 띄어쓰기는 못 받는 놈, next
			System.out.println(txt);
			
			if(txt.equals("exit")) {
				break;
			}	
		}
			
		System.out.println("프로그램을 종료합니다 ㅋ.");
		scann.close();
	
	}
}
