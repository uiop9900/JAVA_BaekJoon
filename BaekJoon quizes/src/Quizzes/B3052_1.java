package Quizzes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class B3052_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
// 		1. Scanner을 이용		
//		Scanner scan = new Scanner (System.in);
//		Set<Integer> set1 = new HashSet<>();
//		
//		for (int i = 0; i < 10; i++) {
//			int number = scan.nextInt();
//			int rest = number % 42;
//			set1.add(rest);
//		}
//		System.out.println(set1.size());
		
		// 2. BuffredReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> set2 = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			int rest = num % 42;
			set2.add(rest);
		}
		System.out.println(set2.size());
	}

}
