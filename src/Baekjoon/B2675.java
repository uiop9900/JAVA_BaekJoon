package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 어떻게 반복해야할까?
		for (int i = 0; i < number; i++) {
			int n = Integer.parseInt(st.nextToken());
			System.out.println(n);
			String str = st.nextToken();
			System.out.println(str);
			for (int j = 0; j < str.length(); j++) {
				char strCh = str.charAt(j);
				System.out.print(strCh * n);
			}
		}
	}

}
