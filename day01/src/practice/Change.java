package practice;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액: ");
		value = sc.nextInt();
		
		int count500 = value / 500;
		value %= 500;
		int count100 = value / 100;
		
		System.out.println("\n동전의 수 > ");
		System.out.println("500원짜리 = " + count500 + "개");
		System.out.println("100원짜리 = " + count100 + "개");
		

	}

}
