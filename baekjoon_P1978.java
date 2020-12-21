package baekjoon;
// baekjoon_P1978
// Fiding prime numbers
// input: (1st line) a int 'N' under 100
//        (2nd line) 'N' numbers with blanks. 
// output: The number of prime numbers in the input.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_P1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		int[] Second_input = new int[N];
		int i = 0;
		while(st.hasMoreTokens()) {
			Second_input[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		int count = 0;
		for(int j = 0; j < N; j++ ) {
			int Num = Second_input[j];
			if(Num == 2)
				count++;
			else {
				int k = 2;
				for(; k < Num; k++) {
					if(Num%k == 0) {
						break;
					}		
				}
				if(k == (Num))
					count++;	
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}

}
