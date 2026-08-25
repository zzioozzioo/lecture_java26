package practice;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		number = sc.nextInt();
		
		String result = (number % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
		
		sc.close();

	}

}
