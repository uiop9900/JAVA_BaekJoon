package Baekjoon;

import java.util.Scanner;

public class B11654 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 문자 -> 숫자
		String ch = scan.next();
		char chFirst = ch.charAt(0);
		int number = (int)chFirst;
		System.out.println(number);
		
		// 숫자 -> 문자
		int num = scan.nextInt();
		char chr = (char)num;
		System.out.println(chr);
		
	}

}
