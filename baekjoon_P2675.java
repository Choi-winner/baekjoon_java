package baekjoon;
// Repeat 'R' times string 'S' <- seperated by a blank
// The number of cases is 'T'

import java.util.Scanner;

//import sun.security.util.Length;

public class baekjoon_P2675 {

	public static void main(String[] args) {
		int T = 0; // Number of test cases 1 ~ 1000
		int R = 0; // Number of repeats 1 ~ 8
		String S; // The target string to repeat 'R' times
		
		Scanner sc1 = new Scanner(System.in);
		T = sc1.nextInt();
		StringBuilder sb = new StringBuilder();

		
		for(int i = T; i > 0; i--) { // iterate this for loop T times
			Scanner sc2 = new Scanner(System.in);
			String str = sc2.nextLine();
			
			R = Character.getNumericValue(str.charAt(0)); // number of repeat
			S = str.substring(2,str.length());
			int N = S.length();
			
			
			for(int j = 0; j < N; j++) {
				for(int k = R; k>0; k--)
					sb.append(S.charAt(j));
			}
			sb.append('\n');
			
		}
		System.out.println(sb);
	}

}
