package baekjoon.P11720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int N1 = sc.nextInt();

		
		String N2 = sc2.nextLine();
		String N3 = N2;	
		
		int sum = 0;
		if(N1 > 9) {
				String temp_str = N2.substring(0,9);
				long temp = Long.parseLong(temp_str);
				for(int i = 0; i < 9 ; i++) {	
					sum += temp%10;
					temp /= 10;
					if(temp == 0)
						break;
				}
				String temp_str2 = N3.substring(9,N2.length());
				long temp2 = Long.parseLong(temp_str2);          
				for(int i = 0; i < N2.length()-9 ; i++) {
					sum += temp2%10;
					temp2 /= 10;
					if(temp2 == 0)
						break;
				}
		}
		else {
			String str3 = N2;
			long temp3 = Long.parseLong(str3);
			for(int i = 0; i < 15 ; i++) {
				sum += temp3%10;
				temp3 /= 10;
				if(temp3 == 0)
					break;
			}			
		}
		System.out.println(sum);
	}

}
