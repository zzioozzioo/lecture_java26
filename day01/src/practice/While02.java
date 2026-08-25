package practice;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		int sum = 0;
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			number = sc.nextInt();
			
			if(number % 2 == 0) {
				System.out.println(">> 짝수입니다.");
			} else {
				System.out.println(">> 홀수입니다.");
			}
			
			System.out.print("계속 하시겠습니까? (0-멈춤/1-계속): ");
			int stopOrContinue = sc.nextInt();
			
			if(stopOrContinue == 0) {
				break;
			} else if(stopOrContinue == 1){
				continue;
			}
		}
		
		sc.close();

	}

}
