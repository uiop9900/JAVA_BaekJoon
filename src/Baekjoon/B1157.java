package Baekjoon;

import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next(); 
		String upperWord = word.toUpperCase(); //출력이 대문자라 일단 대문자로 다 만든 다음에 비교.
		
		int[] alpabet = new int[26]; // a-z까지 저장한다음 같은값이 있으면 그 칸이 +1 하기
		
		//값을 입력받아서 - 65를 하면 0 = A
		for (int i = 0 ; i < upperWord.length(); i++) {
			int wordNumber = (int)upperWord.charAt(i) - 65; // 0=A
			alpabet[wordNumber]++;
		}
		
		int maxIdx = 0;
		int max = 0;
		// 여러개일때는 ?를 출력,,
		for(int i = 0; i < 26; i++) {
			if(max < alpabet[i]) {
				max = alpabet[i];
				maxIdx = i;
			}
			
		}
		System.out.println((char)(maxIdx + 65));
	}
	
}
