package stringtest_1;

// 교: 클래스 이름을 Exception이라고 만들지 않도록 주의하세요!
// 이유: 이미 Exception이라는 클래스가 자바에 존재해서, 우리가 이미 있는 놈이랑 이름 겹치는 놈 만들면 좃댐 ㅋ


// p150 오류방지. try-catch문.
// 오류는 나는 순간 프로그램이 강제종료가 된다. try-catch문으로 어쨌든 정상 종료를 도모해 보자.



import java.util.*;

public class ExceptionTest_p150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int a = 100;	// 나누어지는 수 a는 100으로 고정해 보자.
	
	Scanner scann = new Scanner(System.in);
		
		
	System.out.println("나눌 정수를 하나 입력해봐 ㅋ (제수)");	// 교수님은 제수 피제수라고 쓰셨다. ha ha 세대차이!
	int b = scann.nextInt();
	
	try {
		int ret = a / b;	// 0으로 무언가를 나누면 좆됨 ㅋ 헐 어떡함? ㅋ try-catch문을 이용하면 됨 ㅋ
		System.out.println(ret);	// 얘까지 try문 안에 있어야 한다. 0으로 나눌 경우 ret가 생성도 안 되기 때문에 나중에 출력할 때 뭘 출력해야함? 에러뜸 ㅋ.
	}
	
	catch(ArithmeticException e) {
		System.out.println("0으로 나누기 에러입니다 ㅋ");	
	}
	
//	catch(Exception e) {	// Exception은 try문에서 일어나는 '모든' 에러에 대해 잡아 주는 놈이다. 굳이 어떤 타입의 에러만 대응하기 귀찮을 때...
//		System.out.println("0으로 나누기 에러입니다 ㅋ");	
//	}
		
	
	int arr[] = new int[5];
	
	
	try {
		arr[7] = 10;
		System.out.println(arr[7]);		
	}
		
	catch(Exception e) {
		System.out.println("배열 인덱스 오류!!!");		
	}
	
	finally {	// finally문은 써도 되고 않 써도 된디 ㅋ
		arr[0] = 100;
		System.out.println("finally문 안의 명령은 에러가 나든 말든 반드시 실행된디.");	
	}

	
	
	scann.close();
	System.out.println("프로그램을 종료합니다. ㅋ");	

	
	
	
	
	
	
	}

}
