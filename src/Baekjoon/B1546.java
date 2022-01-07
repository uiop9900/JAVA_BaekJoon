package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		int subjectNum = Integer.parseInt(br.readLine());
		double[] scores = new double[subjectNum];
		StringTokenizer st = new StringTokenizer (br.readLine(), " ");
		double max = 0;
		double sum = 0;
		
		for (int i = 0; i < subjectNum; i++) {
			scores[i] = Integer.parseInt(st.nextToken()); // 정상 작동
			if (max < scores[i]) {
				max = scores[i];
			}			
		}
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scores[i] / max * 100; 
			sum += scores[i];
		}

		System.out.println(sum/scores.length);
		}
		
	}


