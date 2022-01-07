package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for (int i = 0; i < num; i++) { // 첫 줄에 입력받은 num만큼 반복
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken()); // 둘째줄에 맨 처음 수만큼 arr를 만든다
			int[] arr = new int[n];
			double sum = 0;
		
			// sum을 계산하는 for문
			for (int j = 0; j < n; j++) { // n만큼 반복해서 그 안의 수들을 다 더한다.
				arr[j] = Integer.parseInt(st.nextToken());
				sum = sum + arr[j];
			}
			double average = sum / n; 
			
			// count를 이용해서 평균보다 큰 학생 수를 구함
			double count = 0;
			for (int j = 0; j < n; j++) { // 위와 같이 n만큼 반복
				if (arr[j] > average) {
					count++;
				}
			}
			System.out.println(String.format("%.3f", (count / n * 100)) + "%");

		}
	}

}
