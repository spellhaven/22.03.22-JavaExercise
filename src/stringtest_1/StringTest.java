package stringtest_1;

import java.util.*;

// ������ p 126 ���� - �Է±�
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		
		while (true) {
			System.out.print(">>");
			String txt = scann.nextLine();	// ���ڿ� �Է� + ������� �� �޾� �ִ� ��, nextLine. �翬�� �� ���ӻ� ����
//			String txt = scann.next();	// ���ڿ� �Է��� �ޱ� �޴µ� ����� �� �޴� ��, next
			System.out.println(txt);
			
			if(txt.equals("exit")) {
				break;
			}	
		}
			
		System.out.println("���α׷��� �����մϴ� ��.");
		scann.close();
	
	}
}
