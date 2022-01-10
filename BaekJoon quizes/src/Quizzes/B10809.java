package Quizzes;

import java.util.Scanner;

public class B10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		for (int i = 97; i <= 122; i++) {
			char ch = (char)i;
			System.out.print(str.indexOf(ch) + " ");
		}

	}
}
