package baekjoon;

import java.util.Scanner;

// Finding Break-even point (손익분기점 찾기)
public class baekjoon_P1712 {

	public static void main(String[] args) {
		int A, B, C;
		// A: 고정비용, B: 가변비용(1대생산), C: 판매수입(1대생산)
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		sc.close();
		int N = 1; // number of product
		int cont = 1;
		while(cont == 1) {
			if(B >= C){ // 많이 생산할수록 손해라서 손익분기점 존재하지 않음.
				// the pure profit is decreasing
				cont = -1; // the Break-even point is nowhere
				break;
			}
			if(A+B*N<C*N) {
				cont = 2; // the Break-even point is N
				break;
			}
			N++;
		}
		
		if(cont == 2) 
			System.out.println(N);
		else if(cont == -1) // If there is no 'Break-even point', print '-1'
			System.out.println(cont);
	}

}
