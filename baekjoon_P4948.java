package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;

// baekjoon_P4948
// ����Ʈ�� ����.
// �ڿ��� n�� ���Ͽ� n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ��� 1�� �̻� ����.
// n�� �־�����, n�� 2n���� �Ҽ��� ������ ���ϴ� ���α׷�.


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
		
		// �Ҽ��� ã�� �κ�
		HashSet<Integer> prime_set = new HashSet<Integer>();
		
		int END = 2*max;
		int START = 1;
		
		int[] arr = new int[END-1]; // 2 ���� END������ ���� �ϴ� �� �ִ´�.
		
		for(int i = 2; i <= END; i++) 
			arr[i-2] = i;
		// arr[0] = 2, arr[1] = 3, ... , arr[END-2] = END
		
		// 2���� �����ؼ� i�� �÷�����, i�� ����� �����ϰ� �ִ� �͵��� ������ 0���� �ʱ�ȭ.
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
		// �Ҽ� ã�� ��.
		

		// array set_n�� ����� n ������ ���Ͽ� n�� 2n ������ �Ҽ��� ã�� �κ�.
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
