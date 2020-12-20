package baekjoon;
// what is the most used Alphabet 

import java.util.Scanner;

public class baekjoon_P1157 {

	public static void main(String[] args) {
		int Mode;
		char Mode_char;
		Scanner sc = new Scanner(System.in);
		String Input_string = sc.nextLine();
		sc.close();
		int[] counter = new int[26]; // The whole alphabets are 26.
		
		int N = Input_string.length();
		for(int i = 0; i < N; i++) {
			int ASCII = (int)Input_string.charAt(i);
			if((97 <= ASCII)&&(ASCII <= 122))  // Large
				ASCII -= 32;
			// ASCII = 65 ~ 90
			counter[ASCII-65] += 1;
		}
		Mode = -1;
		int index = 0;
		for(int i = 0; i < 26; i++) {
			if(Mode <= counter[i]) {
				Mode = counter[i];
				index = i;
			}
		}
		int Collision = 0;
		for(int i = 0; i < 26; i++) {
			if(Mode == counter[i])
				Collision++;
		}
		if(Collision >= 2) // If the collision accrued, print '?' 
			Mode_char = '?';
		else
			Mode_char = (char)(index+65); // Change from ASCII code to a char
		System.out.println(Mode_char);
	}
}
