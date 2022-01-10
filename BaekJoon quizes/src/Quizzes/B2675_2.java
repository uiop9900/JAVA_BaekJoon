package Quizzes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2675_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int number = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < number; i++) {
			String[] arr = br.readLine().split(" ");
			int num = Integer.parseInt(arr[0]);
			String str = arr[1];
			
			for (int j = 0; j < str.length(); j++) {
				for (int z = 0; z < num; z++) {
				System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
