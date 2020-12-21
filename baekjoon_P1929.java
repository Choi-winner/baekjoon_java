package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// baekjoon_P1929
// Finding the prime numbers within two input 'int'


public class baekjoon_P1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int START = Integer.parseInt(st.nextToken());
		int END = Integer.parseInt(st.nextToken());
		br.close();
		StringBuilder sb = new StringBuilder();		
		
		// 에라토스테네스의 체를 이용한 방법.
		// 하나의 소수를 발견하면, 그 수의 배수들을 모두 지운다.
		// 다음 소수를 발견하면, 또 그 수의 배수들을 모두 지운다.
		// 이를 limit N의 제곱근까지
			
		int[] arr = new int[END-1]; // 2 부터 END까지의 값을 일단 다 넣는다.
		
		for(int i = 2; i <= END; i++) 
			arr[i-2] = i;
		// arr[0] = 2, arr[1] = 3, ... , arr[END-2] = END
		
		// 2부터 시작해서 i를 올려가며, i의 배수를 저장하고 있는 것들은 모조리 0으로 초기화.
		for(int i = 2; i <= Math.sqrt(END); i++) {
			for(int j = 2*i; j <= END; j += i)
				arr[j-2] = 0;
		}
		for(int i = START-2; i <= END-2; i++ ) {
			if(i == -1) 
				continue;
			if(arr[i] != 0)
				sb.append(String.valueOf(arr[i])+"\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
