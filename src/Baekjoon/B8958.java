package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B8958 {
	// score�� ����ؼ� 0���� ����������� ��ø���� �ʴ´�!
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] arr = new String[num];
		StringTokenizer st1; 
		
		for (int i = 0; i < num; i++) {//�Է¹��� ����ŭ �ݺ��� ����
			arr[i] = br.readLine(); // �� �ٸ��� arr�� ����.
			int score = 0;
			int count = 0;
			for(int j = 0; j < arr[i].length(); j++) { //�ϳ��� �ε����� ���̸�ŭ �ݺ��� ����
				String character = arr[i].substring(j,j+1);
				if(!character.equals("O")) {
					count = 0;
					continue;
				} else if (character.equals("O")){
					count++;
					score = score + count;
				}
				
			}
			System.out.println(score);
				
		}
	}

}
