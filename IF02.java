package select;

import java.util.Scanner;

public class IF02 {
public static void main(String[] args) {

//숫자를 입력
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num = input.nextInt();
		
	//홀짝 판단하여 출력
		if (num % 2 == 0) {
			System.out.println("짝수입니다");
		}
			else { 
				System.out.println("홀수입니다");
			}
		}
	
}
