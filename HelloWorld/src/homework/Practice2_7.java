package homework;

import java.util.Scanner;

public class Practice2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점 (x,y)의 자표를 입력하시오>>");
		
		int x=0,y=0;
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x>100 && x<200 && y>100 && y<200)
				System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
		
		else 
			System.out.println("("+x+","+y+")는 사각형 안에 있지 않습니다.");
		
		System.out.println("===================");
		System.out.println(" 학번 : 2015041057   ");
		System.out.println(" 이름 :   김두회           ");
		System.out.println("===================");
	}
}
