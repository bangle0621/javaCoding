package bronze5.Day6;

import java.util.Scanner;

public class BOJ10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
//
//		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//
//		���
//		�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}

}
