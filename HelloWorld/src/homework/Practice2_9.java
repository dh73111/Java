package homework;

import java.util.Scanner;
public class Practice2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
		System.out.print("원의 중심과 반지름 입력>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		double r = sc.nextDouble();
		System.out.print("점 입력>>");
		double a=sc.nextInt();
		double b=sc.nextInt();
		if((x-a)*(x-a)+(y-b)*(y-b)<r*r)
		{
			System.out.println("점 ("+a+","+b+")는 원 안에 있다");
		}
		else
      	    System.out.println("원 안에 존재하지 않습니다.");
		
	 	System.out.println("===================");
		System.out.println("| 학번 : 2015041057 |");
		System.out.println("| 이름 :    김두회         |");
		System.out.println("===================");
			
	}
}
