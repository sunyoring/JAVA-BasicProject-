package example.repetitive;

public class Repetitive {
	public void testFor() {
		// for(�ʱ��; ���ǽ�; ������)
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "�� ° ���");
		}
		// i�� ���ҽ�Ű�鼭
		for (int i = 10; i > 0; i--) {
			System.out.println(i + "�� ° ���");
		}
		// �������� �ݵ�� 1�� ������ �ʿ䰡 ����.
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i + "�� ° ���");
		}
		// int�� �ƴ� char�� �Է��ϸ�?
		for (char ch = 'a'; ch <= 'e'; ch++) {
			System.out.println(ch);
		}
	}

	public void testWhile() {
		//�ʱ�� : �ܺ�, ���ǽ� : �߰�ȣ, ������ : ����
		int i = 0;
		while(i < 10) { //���ǽ�
			System.out.println(i + "�� ° i ���");
			i++;
		}
		//������ ���
		int j = 10;
		while(j > 0) {
			System.out.println(j + "�� ° j ���");
			j--;
		}
		
		//���� ���� : ���ǰ��� �׻� true�� ����.
		int k=0;
		while(true) {
			System.out.println(k++ + "��° k ���");
		}
	}
	public void testDowhile() {
		//�ʱ�� : �ܺ�
		int i =0;
		do {
			System.out.println(i++ +"��° i ���");
			// ������
		} while(i < 10); // ���ǽ��� �� ������, �����ݷ� ���
		
		//���ҽ�
		int j = 10;
		do {
			System.out.println(j-- + "�� ° j���");
			
		}while(j > 0);
		
		//do - while �� ���� ����
		int k=0;
		do {
			System.out.println(k++ + "�� ° k���");
		}while(true);
		
	}
}
