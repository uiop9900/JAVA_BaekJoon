	package Quizzes;
	
	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
	
	public class b1152 {
	
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int word = st.countTokens();
			System.out.println(word);
			
		}
	
	}
