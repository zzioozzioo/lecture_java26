package practice;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.print("숫자를 입력하세요: ");
		number = sc.nextInt();
		
		int sum = 1;
		for(int i=1; i<=number; i++) {
			sum *= i;
		}

		System.out.println(number + "! = " + sum);
		sc.close();
	}

}
