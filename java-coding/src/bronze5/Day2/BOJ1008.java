package bronze5.Day2;

import java.util.Scanner;

public class BOJ1008 {
	public static void main(String[] args) {
//		문제
//		두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//		출력
//		첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
		Scanner sc = new Scanner(System.in);
		//int 형은 정수이기 때문에 소수점이 안나온다.
		//float과 double형의 정밀도가 다르다.
		//코딩테스트에서는 왠만하면 double을 사용하는 것이 좋다.(소수점 정확히 표현)
		double A = sc.nextInt();
		double B = sc.nextInt();
		System.out.println(A/B);
	
	}
}
