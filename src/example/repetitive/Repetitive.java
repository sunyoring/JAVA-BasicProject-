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

}
