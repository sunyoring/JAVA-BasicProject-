package example.repetitive;

public class Repetitive {
	public void testFor() {
		// for(초기식; 조건식; 증감식)
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "번 째 출력");
		}
		// i를 감소시키면서
		for (int i = 10; i > 0; i--) {
			System.out.println(i + "번 째 출력");
		}
		// 증감식은 반드시 1씩 증감할 필요가 없음.
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i + "번 째 출력");
		}
		// int가 아닌 char를 입력하면?
		for (char ch = 'a'; ch <= 'e'; ch++) {
			System.out.println(ch);
		}
	}

}
