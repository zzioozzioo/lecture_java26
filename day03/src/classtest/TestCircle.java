package classtest;

import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {
		// 원의 반지름 입력받기
//		TestCircle tc = new TestCircle();
//		tc.printArea();
		printArea();
		
	}
	
	public static void printArea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름: ");
		
		double radius = sc.nextDouble();
		
		// 원의 객체 생성
		Circle c = new Circle(radius);
		
		// 원의 면적을 계산하여 출력
		double area = c.getArea();
		System.out.println("반지름이 " + radius + "인 원의 면적은 " + area + "입니다.");
	}

}
