package Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		String str = scan.next();
		
		List<String> list = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			list.add(str.substring(i, i + 1));
		}
		for (int i = 0; i < list.size(); i++) {
			int n = Integer.parseInt(list.get(i));
			sum += n;
		}
		
		System.out.println(sum);
	}

}
