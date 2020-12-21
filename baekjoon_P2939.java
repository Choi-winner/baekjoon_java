package baekjoon;
// SugarDelivery baekjoon_ P2939
import java.util.Scanner;

public class baekjoon_P2939 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int num = (N/2); // The first "(num > i + j)" is always true.
		int status = 0;
		int LIMIT_5 = (N/5);
		for(int i = 0; i <= LIMIT_5 ; i++ ) {
			if((N-i*5)%3 == 0) {
				int Q = (N-i*5)/3;
				if(num >= i + Q) {  // when it is the first finding, the result is go directly into the 'num'
					num = i + Q; 
					status++;	
					}
			}
		}		

		if(status == 0) 
			System.out.println("-1");
		else
			System.out.println(num);
	}
}
// memory 18328KB / time 240ms