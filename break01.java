package chap09;

import java.util.Scanner;

public class break01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num;
		
		while (true) {
			num = input.nextInt();       
			if (num <= 0) {
			System.out.println("0보다 큰 숫자를 입력하세요");
			}
			else { 
		break;
		}
		}
		int sum = 0;
		for (int i = 1; i <= num; i++) sum += i;
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
	}

}
