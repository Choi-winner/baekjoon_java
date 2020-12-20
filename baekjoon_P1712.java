package baekjoon;

import java.util.Scanner;

// Finding Break-even point (���ͺб��� ã��)
public class baekjoon_P1712 {

	public static void main(String[] args) {
		int A, B, C;
		// A: �������, B: �������(1�����), C: �Ǹż���(1�����)
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		sc.close();
		int N = 1; // number of product
		int cont = 1;
		while(cont == 1) {
			if(B >= C){ // ���� �����Ҽ��� ���ض� ���ͺб��� �������� ����.
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
