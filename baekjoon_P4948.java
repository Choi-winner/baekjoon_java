package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;

// baekjoon_P4948
// 베르트랑 공준.
// 자연수 n에 대하여 n보다 크고, 2n보다 작거나 같은 소수는 적어도 1개 이상 존재.
// n이 주어질때, n과 2n사이 소수의 개수를 구하는 프로그램.


public class baekjoon_P4948 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int[] set_n = new int[1000];
		int index = 0;
		int max = 1;
		while(true) {
			int temp = Integer.parseInt(br.readLine());
			if(temp == 0)
				break;
			set_n[index] = temp;
			index++;
			if(max <= temp)
				max = temp;
		}
		
		br.close();
		
		// 소수를 찾는 부분
		HashSet<Integer> prime_set = new HashSet<Integer>();
		
		int END = 2*max;
		int START = 1;
		
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
				prime_set.add(arr[i]);
		}
		// 소수 찾기 끝.
		

		// array set_n에 저장된 n 각각에 대하여 n과 2n 사이의 소수를 찾는 부분.
		for(int i = 0; i < index; i ++) {
			int n = set_n[i];
			int count = 0;
			Iterator<Integer> iter = prime_set.iterator();
			while(iter.hasNext()) {
				int prime_num = iter.next();
				if((n < prime_num) && (prime_num <= 2*n))
					count++;
			}
			bw.write(Integer.toString(count));
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
