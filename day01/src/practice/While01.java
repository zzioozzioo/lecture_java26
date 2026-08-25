package practice;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		int sum = 0;
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			number = sc.nextInt();
			if(number != 0) {
				sum += number;
			} else {
				System.out.println("지금까지 입력한 숫자의 합은 " + sum + "입니다.");
				break;
			}
		}
		
		sc.close();
	}

}
