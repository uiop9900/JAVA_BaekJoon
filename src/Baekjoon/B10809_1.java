package Baekjoon;

public class B10809_1 {

	public static void main(String[] args) {
		String str = "I would like to fly";
		
		// 1. contains 메소드
		System.out.println(str.contains("w")); // true
		System.out.println(str.contains("li")); // true
		
		// 2. indexOf 메소드
		System.out.println(str.indexOf("w")); // 2 -> 공백합해서 3번째 글자 -> index: 2
		System.out.println(str.indexOf("of")); // -1 
		System.out.println(str.indexOf("l")); // 5 -> would의 l의 index 추출, 뒤의 fly는 반환되지 않는다.
		
		// 3. matches 메소드
		System.out.println(str.matches("l")); // false : String이 "l"이어야 true이다.
		System.out.println(str.matches("(.*)l(.*)")); //true : 앞뒤에 정규표현식을 넣어주면 contains처럼 들어가면 true이다.
		System.out.println(str.matches("(.*)o(.*)")); //true : 앞뒤에 정규표현식을 넣어주면 contains처럼 들어가면 true이다.
		
	}

}
