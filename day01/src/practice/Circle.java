package practice;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float width = 0;
		float height = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 길이: ");
		width = sc.nextFloat();
		System.out.print("직사각형의 세로 길이: ");
		height = sc.nextFloat();
		
		float result = 0;
		result = width * height;
		
		System.out.println("직사각형의 넓이는 " + result + "cm입니다.");

	}

}
