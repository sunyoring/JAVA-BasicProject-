package practice.operator;

public class OperatorPractice {
	public void method1() {
		//문제 1 출력 값 예측
		int num1 = 10, num2 = 0;
		String str = "hello";
		
		num1 += 20; // 30
		num2 += 10; //10
		num1 /= num2; // 3
		num2 *= num1; // 30
		str += num2; // "hello30" 
		num2 -= num1; // 27
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("str : " + str);
		
	}
}
