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
		
		for (int i = 0; i < num; i++) { // ù �ٿ� �Է¹��� num��ŭ �ݺ�
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken()); // ��°�ٿ� �� ó�� ����ŭ arr�� �����
			int[] arr = new int[n];
			double sum = 0;
		
			// sum�� ����ϴ� for��
			for (int j = 0; j < n; j++) { // n��ŭ �ݺ��ؼ� �� ���� ������ �� ���Ѵ�.
				arr[j] = Integer.parseInt(st.nextToken());
				sum = sum + arr[j];
			}
			double average = sum / n; 
			
			// count�� �̿��ؼ� ��պ��� ū �л� ���� ����
			double count = 0;
			for (int j = 0; j < n; j++) { // ���� ���� n��ŭ �ݺ�
				if (arr[j] > average) {
					count++;
				}
			}
			System.out.println(String.format("%.3f", (count / n * 100)) + "%");

		}
	}

}
