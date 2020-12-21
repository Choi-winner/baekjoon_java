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
		
		// �����佺�׳׽��� ü�� �̿��� ���.
		// �ϳ��� �Ҽ��� �߰��ϸ�, �� ���� ������� ��� �����.
		// ���� �Ҽ��� �߰��ϸ�, �� �� ���� ������� ��� �����.
		// �̸� limit N�� �����ٱ���
			
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
				sb.append(String.valueOf(arr[i])+"\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
