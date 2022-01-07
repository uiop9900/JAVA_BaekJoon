package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class B3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		
		List<Integer> arrInt = new ArrayList<>(); //hashSet은 중복, 순서가 없다.!!!
		String input = br.readLine();
		
		
		while(input != null) { // 이런식으로 받는 값이 없으면을 넣는다. -> null이 아니면 계속 값이 들어오다가 null이 되는 순간 while문이 실행되지 않는다.
			int inputNum = Integer.parseInt(br.readLine());
			int rest = inputNum % 42;
			
			if (arrInt.contains(rest)) {
				continue;				
			} else {
				bw.write(rest);
			}
			
			bw.flush();
			bw.close();
			br.close();
		}
		
	}

}
