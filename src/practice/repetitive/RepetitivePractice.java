package practice.repetitive;

public class RepetitivePractice {
	public void method1() {
		//�Ƕ�̵� ��� ����� (����for���� �̿�)
		
		//�ܺ� for�� �� ����
		for(int i =0; i<4; i++) {
			//���� for�� ĭ ����
			//���� ���(3,2,1,0)
			for(int j=3; j>i; j--) {
				System.out.print(" ");
			}
			//�� ���
			for(int j =0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		
	}
}
