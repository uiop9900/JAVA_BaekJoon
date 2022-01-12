package Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next(); 
		String upperWord = word.toUpperCase(); //출력이 대문자라 일단 대문자로 다 만든 다음에 비교.
		
		List<Character> arr = new ArrayList<>(); 
		for (int i = 0; i < word.length(); i++) { // i는 0 ~ 글자수
			for (int j = i + 1; j < word.length(); j++) { // j는 1 ~ 글자수
				if (word.charAt(i) == word.charAt(j)) {// 같으면? abca
					arr.add(word.charAt(i));
				}
			}
		}
		System.out.println(arr);
	}
}
