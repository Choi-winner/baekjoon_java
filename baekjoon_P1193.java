package baekjoon;
//baekjoon_P1193
//Finding the fraction in the 2by2 array.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_P1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(bf.readLine());
		bf.close();
		StringBuffer sb = new StringBuffer(); //StringBuffer에 String 저장.
		
		int layer = 1;
		while( N > 0 ) {
			if(N <= layer) {
				if(layer%2 == 0)  // 짝수 층
					sb.append(N).append("/").append(layer+1-N); // 저장하는 방식.
				else  // 홀수 층
					sb.append(layer+1-N).append("/").append(N);	
				break;
			} else { // N > layer
				N -= layer;
				layer++; // go to next layer.	
			}
		}
		bw.write(sb.toString()); // BufferedWriter에 의해 출력하는 방법.
		bw.flush();
		bw.close();
	}
}
