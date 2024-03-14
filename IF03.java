package select;

import java.util.Scanner;

public class IF03 {

	public static void main(String[] args) {
		// 숫자 입력
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = input.nextInt();
		//양수,0,음수
		if (num > 0) {
			System.out.println("양수입니다");
			
		}
		else if (num == 0) {
			System.out.println("0입니다");
	
		}
		else {
			System.out.println("음수입니다");
			
		}
	
	}
	

}
