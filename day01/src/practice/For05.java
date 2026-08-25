package practice;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.print("양의 숫자를 입력하세요 : ");
        for (;;) {
            num = sc.nextInt();
            if (num > 0) {
                break;
            }
            System.out.print("양의 숫자가 아닙니다. 다시 입력하세요: ");
        }

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
        
        sc.close();
	}

}
