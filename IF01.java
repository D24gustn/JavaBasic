package select;

import java.util.Scanner;

public class IF01 {
	public static void main(String[] args) {
	// 세 개의 숫자를 입력
	Scanner input = new Scanner(System.in);
	System.out.println("세 개의 숫자를 입력하세요");
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	//최대값 구하기
	int max = a;
	
	if(a > max) {
		max = a;
	}
	
	//b를 조사
	if (b > max) {
		max = b;
		
		//c를 조사
		if (c > max ) {
			max = c;
		}
	}
	//최대값 출력
	System.out.println("가장 큰 수는 " + max + "입니다.");
}
}
