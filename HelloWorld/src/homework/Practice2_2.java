package homework;

import java.util.Scanner;

public class Practice2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99)>>>");
		int num;
		num = sc.nextInt();
		if(num >=10 && num <=99)
			if(num/10 == num%10) {
				System.out.println("Yes! 10의자리와 1의 자리가 같습니다.");
			}
			else
				System.out.println("No! 10자리와 1의 자리가 같지 않습니다.");
		else
			System.out.println("정수 입력이 옳지 않습니다.");
		System.out.println("===================");
		System.out.println(" 학번 : 2015041057   ");
		System.out.println(" 이름 :   김두회           ");
		System.out.println("===================");
	}

}
