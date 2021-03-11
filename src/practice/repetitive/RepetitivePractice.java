package practice.repetitive;

public class RepetitivePractice {
	public void method1() {
		//피라미드 모양 별찍기 (이중for문을 이용)
		
		//외부 for문 줄 조건
		for(int i =0; i<4; i++) {
			//내부 for문 칸 조건
			//공백 출력(3,2,1,0)
			for(int j=3; j>i; j--) {
				System.out.print(" ");
			}
			//별 출력
			for(int j =0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		
	}
}
