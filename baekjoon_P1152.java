package baekjoon;
//Finding the number of words in a string
//It should handle same words a word.
import java.util.Scanner;

public class baekjoon_P1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		StringBuilder sb = new StringBuilder();
		String[] words = new String[10];
		int index = 0;
		
		// scanning for loop
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				sb.append(str.charAt(i));
			}
			else if(sb.length() != 0){
				words[index] = sb.toString();
				index++;
				sb.delete(0, sb.length());//reset the stringbuilder
			}else
				continue; // if 'sb' is empty, just continue.

		}
		if(sb.length() != 0) {
			words[index] = sb.toString();
			index++;
		}
		int Collision = 0;
		for(int i = 0; i < index; i ++) {
			for(int j = i+1; j < index; j++) {
				if(words[i] == words[j])
					Collision++;
			}
		}
		System.out.println(index-Collision); // The number of words
	}
}
