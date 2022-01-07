package Baekjoon;

public class B10809_1 {

	public static void main(String[] args) {
		String str = "I would like to fly";
		
		// 1. contains �޼ҵ�
		System.out.println(str.contains("w")); // true
		System.out.println(str.contains("li")); // true
		
		// 2. indexOf �޼ҵ�
		System.out.println(str.indexOf("w")); // 2 -> �������ؼ� 3��° ���� -> index: 2
		System.out.println(str.indexOf("of")); // -1 
		System.out.println(str.indexOf("l")); // 5 -> would�� l�� index ����, ���� fly�� ��ȯ���� �ʴ´�.
		
		// 3. matches �޼ҵ�
		System.out.println(str.matches("l")); // false : String�� "l"�̾�� true�̴�.
		System.out.println(str.matches("(.*)l(.*)")); //true : �յڿ� ����ǥ������ �־��ָ� containsó�� ���� true�̴�.
		System.out.println(str.matches("(.*)o(.*)")); //true : �յڿ� ����ǥ������ �־��ָ� containsó�� ���� true�̴�.
		
	}

}
