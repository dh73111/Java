package homework;

import java.util.Scanner;

public class Practice2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("원화를 입력하세요(단위 원)>>>");
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		num = sc.nextInt();
		
		System.out.println(num + "원은 $" + (float)num/1100 + "입니다.");
		System.out.println("===================");
		System.out.println(" 학번 : 2015041057   ");
		System.out.println(" 이름 :   김두회           ");
		System.out.println("===================");
	}

}
