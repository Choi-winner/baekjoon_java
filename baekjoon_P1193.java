package baekjoon;
//baekjoon_P1193
//Finding the fraction in the 2by2 array.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_P1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int N = Integer.parseInt(s);
		bf.close();
		
		int layer = 1;
		while( N > 0 ) {
			if(N <= layer) {
				if(layer%2 == 0)  // ¦�� ��
					System.out.println(N+"/"+(layer+1-N));
				else  // Ȧ�� ��
					System.out.println((layer+1-N)+"/"+N);			
				break;
			} else { // N > layer
				N -= layer;
				layer++; // go to next layer.	
			}
		}
	}
}
