package class01;

import java.util.Scanner;

public class CircleDemo01 {

	public static void main(String[] args) {
		
		System.out.print("원의 반지름 : ");
		Scanner in = new Scanner(System.in);
		
		// Circle 클래스 사용하여 원의 면적 구하여 출력
		Circle myCircle = new Circle();
		myCircle.radius = in.nextDouble();
		myCircle.show(myCircle.radius, myCircle.getArea());
	}
}