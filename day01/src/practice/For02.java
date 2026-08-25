package practice;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int number;
		int sum = 0;
		
		System.out.println("5개의 숫자를 입력하세요: ");
		
		for(int i=1; i<=5; i++) {
			number = sc.nextInt();
			sum += number;
		}
		
		System.out.println("5개 숫자의 합은 " + sum + "입니다.");
		
		sc.close();
	}

}
