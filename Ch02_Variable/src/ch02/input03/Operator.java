package ch02.input03;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		int num0 = 0, num1 =  0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("더하기 연산을 합니다");
		System.out.print("1번째 숫자 입력 >> ");
		num0 = sc.nextInt();
		System.out.print("2번째 숫자 입력 >> ");
		num1 = sc.nextInt();
		
		result = num0 + num1;
		System.out.println("결과는 " + result);
		
		sc.close();

	}

}
