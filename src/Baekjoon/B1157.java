package Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next(); 
		String upperWord = word.toUpperCase(); //����� �빮�ڶ� �ϴ� �빮�ڷ� �� ���� ������ ��.
		
		List<Character> arr = new ArrayList<>(); 
		for (int i = 0; i < word.length(); i++) { // i�� 0 ~ ���ڼ�
			for (int j = i + 1; j < word.length(); j++) { // j�� 1 ~ ���ڼ�
				if (word.charAt(i) == word.charAt(j)) {// ������? abca
					arr.add(word.charAt(i));
				}
			}
		}
		System.out.println(arr);
	}
}
