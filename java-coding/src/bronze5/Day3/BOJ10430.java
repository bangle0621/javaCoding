package bronze5.Day3;

import java.util.Scanner;

public class BOJ10430 {
	public static void main(String[] args) {
//(A+B)%C�� ((A%C) + (B%C))%C �� ������?
//
//		(A��B)%C�� ((A%C) �� (B%C))%C �� ������?
//
//		�� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)
//
//		���
//		ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C, ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
	
	}
}
