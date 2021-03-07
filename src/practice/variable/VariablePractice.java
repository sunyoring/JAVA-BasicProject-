package practice.variable;

public class VariablePractice {
	public void method1() {
		//문제 1 초기화 및 값 변경
		int inum = 100 ;
		float dnum = 234.567f;
		char ch = 'A' ;
		String str = "Hello world";
		boolean bool = true ;
		
		System.out.println("초기화 후 : " + inum + "," + dnum + "," + ch + "," + str + "," + bool);
		
		inum = 100000;
		dnum = 567.123465789f; //float의 유효자리수는 7자리 : 567.1235로 출력됨.
		ch = 'B';
		str = "Welcome to JAVA";
		bool = false;
		
		System.out.println("값 변경 후 : " + inum + "," + dnum + "," + ch + "," + str + "," + bool);
		
		
		
		
		
		
		
		
		
		
		
	}
}
