package bronze5.Day3;

import java.util.Scanner;

public class BOJ2739 {
	public static void main(String[] args) {
//		����
//		N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
//
//		�Է�
//		ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
//
//		���
//		������İ� ���� N*1���� N*9���� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println(N + " * " + i + " = " + N*i);
		}
	}
}
