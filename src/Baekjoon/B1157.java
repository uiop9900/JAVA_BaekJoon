package Baekjoon;

import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next(); 
		String upperWord = word.toUpperCase(); //����� �빮�ڶ� �ϴ� �빮�ڷ� �� ���� ������ ��.
		
		int[] alpabet = new int[26]; // a-z���� �����Ѵ��� �������� ������ �� ĭ�� +1 �ϱ�
		
		//���� �Է¹޾Ƽ� - 65�� �ϸ� 0 = A
		for (int i = 0 ; i < upperWord.length(); i++) {
			int wordNumber = (int)upperWord.charAt(i) - 65; // 0=A
			alpabet[wordNumber]++;
		}
		
		int maxIdx = 0;
		int max = 0;
		// �������϶��� ?�� ���,,
		for(int i = 0; i < 26; i++) {
			if(max < alpabet[i]) {
				max = alpabet[i];
				maxIdx = i;
			}
			
		}
		System.out.println((char)(maxIdx + 65));
	}
	
}
