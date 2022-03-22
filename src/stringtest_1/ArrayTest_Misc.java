package stringtest_1;

import java.util.*;

// 22.03.22 화 점심 먹은 후 - 다른 학우 분 스크린을 보고 다크 모드를 썼더니 훨씬 낫네.
// 대비를 높여서 글씨만 잘 보이게 하면 다크 모드도 정말 짱이네.

// Ctrl + Space는 아무 때나 할 수 있다. 내가 선언한 변수, 함수 등등의 이름을 자동완성시킬 때 상당히 편하다! ^^

// p 133 예제를 마치 영어 섀도잉 읽기 하듯 따라 써 보며 의미를 체득하는 중. ㅋ


public class ArrayTest_Misc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max = 0;	// max를 현재 가장 큰 수로 쓰기로 했다. 꼭 int max = 0; 초기화 잊지 마.
		
		System.out.println("양수 5개를 입력하세요.");
		for(int i = 0; i < 5; i++) {
			intArray[i] = scanner.nextInt();	// 입력받은 정수를 배열에 저장. 크킄
			
			if(intArray[i] > max) {		//intArray[i]가 현재 가장 큰 수보다 크면?
				max = intArray[i];		// intArray[i]를 max로 변경 ㅋ
			}
		}
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		int arr_length = intArray.length;
		System.out.print("배열으 길이는 " + arr_length + "입니다. ㅋ");		
		
		
		// .length 메소드는 상당히 유용하다. 특히 for문에서.
		// for(int i = 0; i < intArray.length; i++) 이런 식으로 쓰면 편하기 때문. 배열 길이를 우리가 일일이 셀 필요도 없어.
		// 특히 가변하는 길이의 배열도 많으니까 말이야. 여튼 숫자를 직접 넣지 말고 배열 길이를 메소드로 구해서 넣으란 말이야.
		// "유연한 코드"! "소프트한 코드"! 뭐 normie 식으로 표현하면 계좌번호를 직접 쓰면 오타가 나니까, 그러지 않게 복붙하는 개념이다. 정말 좋아요.
		
		
		
		
		scanner.close();
		
	}

}
