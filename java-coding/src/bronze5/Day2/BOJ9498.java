package bronze5.Day2;

import java.util.Scanner;

public class BOJ9498 {
	public static void main(String[] args) {
//		����
//		���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
//
//		���
//		���� ������ ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		if(A>=90 && A<=100) {
			System.out.println("A");
		}else if(80<=A && A<=89) {
			System.out.println("B");
		}else if(70<=A && A<=79) {
			System.out.println("C");
		}else if(60 <= A && A<=69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
