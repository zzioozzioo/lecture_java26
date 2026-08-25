package practice;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		int sum = 0;
		
		System.out.print("숫자를 입력하세요: ");
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + number + "까지의 합은 " + sum + "입니다.");
		
		sc.close();
	}

}
