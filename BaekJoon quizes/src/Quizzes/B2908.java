package Quizzes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder word1 = new StringBuilder(st.nextToken());
		StringBuilder word2 = new StringBuilder(st.nextToken());

		char tem;
		tem = word1.charAt(0);
		word1.setCharAt(0, word1.charAt(2));
		word1.setCharAt(2, tem);
	
		tem = word2.charAt(0);
		word2.setCharAt(0, word2.charAt(2));
		word2.setCharAt(2, tem);
		
		int num1 = Integer.valueOf(word1.toString());
		int num2 = Integer.valueOf(word2.toString());
		
		if ( num1 > num2) {
			System.out.println(num1);
		} else if (num1 < num2) {
			System.out.println(num2);
		}
		
	}

}
