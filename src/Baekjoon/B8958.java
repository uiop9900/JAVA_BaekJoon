package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B8958 {
	// score을 계속해서 0으로 리셋해줘야지 중첩되지 않는다!
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] arr = new String[num];
		StringTokenizer st1; 
		
		for (int i = 0; i < num; i++) {//입력받은 수만큼 반복할 예정
			arr[i] = br.readLine(); // 한 줄마다 arr에 들어간다.
			int score = 0;
			int count = 0;
			for(int j = 0; j < arr[i].length(); j++) { //하나의 인덱스의 길이만큼 반복할 것임
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
