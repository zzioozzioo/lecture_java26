package practice;

import java.util.Scanner;

public class Star02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		int num = sc.nextInt();
		
		for(int i=num; i>=1; i--) {
			System.out.println("*".repeat(i));
		}
	}

}
