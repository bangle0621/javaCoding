package bronze5.Day2;

import java.util.Scanner;

public class BOJ1008 {
	public static void main(String[] args) {
//		����
//		�� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//
//		���
//		ù° �ٿ� A/B�� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-9 �����̸� �����̴�.
		Scanner sc = new Scanner(System.in);
		//int ���� �����̱� ������ �Ҽ����� �ȳ��´�.
		//float�� double���� ���е��� �ٸ���.
		//�ڵ��׽�Ʈ������ �ظ��ϸ� double�� ����ϴ� ���� ����.(�Ҽ��� ��Ȯ�� ǥ��)
		double A = sc.nextInt();
		double B = sc.nextInt();
		System.out.println(A/B);
	
	}
}
