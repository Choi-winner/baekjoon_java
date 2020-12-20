package baekjoon.P10809;
// Searching the position of all alphabets.

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		StringBuilder sb = new StringBuilder();

		for(int i = 97+0; i < 97+26; i++ ) {
			char ch = (char)i;

			for(int j = 0; j < S.length() ; j++) {
				if(S.charAt(j) == ch) {
					sb.append(Character.forDigit(j, 10));
					break;
				}
				if(j == S.length()-2) {
					int p = 1;
					sb.append('-');
					sb.append(Character.forDigit(p, 10));
					break;
				}
			}
			if(i == 97+26-1)
				break;
			sb.append(' ');
		}
		String str = sb.toString();
		System.out.println(str);
	
	}

}
