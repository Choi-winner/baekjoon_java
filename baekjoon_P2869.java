package baekjoon;
//baekjoon_P2869
//Snail want to go up the tree

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_P2869 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		int A = Integer.parseInt(st.nextToken()); // Up 'A' meter a day.
		int B = Integer.parseInt(st.nextToken()); // Down 'B' meter a day.
		int V = Integer.parseInt(st.nextToken()); // Total height of the tree.

		int C = A - B;
		if(V <= A) {
			bw.write(String.valueOf(1));
		} 
		else {
			bw.write(String.valueOf(1 + (int) Math.ceil((V-A)/(double)C)));
		}
		bw.flush();
		bw.close();
	}
}
