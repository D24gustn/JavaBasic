package select;

import java.util.Scanner;

public class Switch02  {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		char score = input.next().charAt(0);
		char grade = 'A';
		
		switch(score) { 
		
			case 'a' :   
				System.out.println("아주 열심히 하셨군요");
	
					break;
				
			case 'b' : 
				System.out.println("아주 열심히 하셨군요");
					break;
		
			case 'c' : 
				System.out.println("남들만큼 하셨네요");
		
					break;
			
			
			case 'd' : 
				System.out.println("조금 더 노력이 필요합니다");
				
					break;
		
			case 'f' :  
				System.out.println("교수실로 찾아오세요");
		
					break;
		
		}
	}
}
	
		
