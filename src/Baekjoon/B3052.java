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
		
		List<Integer> arrInt = new ArrayList<>(); //hashSet�� �ߺ�, ������ ����.!!!
		String input = br.readLine();
		
		
		while(input != null) { // �̷������� �޴� ���� �������� �ִ´�. -> null�� �ƴϸ� ��� ���� �����ٰ� null�� �Ǵ� ���� while���� ������� �ʴ´�.
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
