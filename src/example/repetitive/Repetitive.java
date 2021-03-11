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

	public void testWhile() {
		//초기식 : 외부, 조건식 : 중괄호, 증감식 : 내부
		int i = 0;
		while(i < 10) { //조건식
			System.out.println(i + "번 째 i 출력");
			i++;
		}
		//증감식 출력
		int j = 10;
		while(j > 0) {
			System.out.println(j + "번 째 j 출력");
			j--;
		}
		
		//무한 루프 : 조건값을 항상 true로 해줌.
		int k=0;
		while(true) {
			System.out.println(k++ + "번째 k 출력");
		}
	}
	public void testDowhile() {
		//초기식 : 외부
		int i =0;
		do {
			System.out.println(i++ +"번째 i 출력");
			// 증감식
		} while(i < 10); // 조건식이 맨 마지막, 세미콜론 사용
		
		//감소식
		int j = 10;
		do {
			System.out.println(j-- + "번 째 j출력");
			
		}while(j > 0);
		
		//do - while 문 무한 루프
		int k=0;
		do {
			System.out.println(k++ + "번 째 k출력");
		}while(true);
		
	}
}
