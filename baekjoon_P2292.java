package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// baekjoon_P2292
// honey comb number problem

public class baekjoon_P2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();

		int N = Integer.parseInt(s);; // N = 1~10000000
		int Step;
		if(N == 1)
			Step = 1;
		else {
			int current_N = N-2;
			for(int i = 0; ; i++ ) {
				current_N = current_N - 6*i;
				if(current_N/(6*(i+1)) == 0) {
					Step = i + 2;
					break;
				}
			}
		}
		System.out.println(Step);
		
	}

}
