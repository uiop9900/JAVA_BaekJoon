package Quizzes;

import java.io.IOException;
import java.util.Scanner;

public class B2675 {

	public static void main(String[] args) throws IOException {
		//Scanner�� �ڵ� - 224ms
		Scanner scan = new Scanner (System.in);
		int number = scan.nextInt();
		
		for (int i = 0 ; i < number; i++) {
			int num = scan.nextInt(); // �ݺ��ϰ��� �ϴ� ��
			String word = scan.next();
			
			for (int j = 0; j < word.length(); j++) {
				char wordChar = word.charAt(j);
				for (int z = 0; z < num; z++) {
					System.out.print(wordChar);
				}
			}
			System.out.println();
		}
	
	}

}
