package practice;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int number = sc.nextInt();

		int result = 0;
		if(number % 2 == 0) {
			result = 0;
		} else {
			result = 1;
		}
		
		switch(result) {
			case 0:
				System.out.println("짝수입니다.");
				break;
			case 1:
				System.out.println("홀수입니다.");
				break;
		}
		
		sc.close();
	}

}
