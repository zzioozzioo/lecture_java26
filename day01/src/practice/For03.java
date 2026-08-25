package practice;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.print("숫자를 입력하세요: ");
		number = sc.nextInt();
		
		System.out.println("[구구단 " + number + "단]");
		for(int i=1; i<=9; i++) {
			System.out.println(number + " x " + i + " = " + number*i);
		}

		sc.close();
	}

}
