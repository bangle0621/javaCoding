package bronze5.Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		List<Integer> A = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			int b = sc.nextInt();
			A.add(b);
		}
		for(int c : A) {
			if(c<X) {
				System.out.print(c+" ");
			}
		}
		
		
	}

}
