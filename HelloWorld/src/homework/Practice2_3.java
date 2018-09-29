package homework;

import java.util.Scanner;

public class Practice2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	int money =0;

	System.out.print("금액을 입력하시오>>");
	money = sc.nextInt();
	System.out.println("오만원권 " + money/50000 + "매");
	System.out.println("만원권" + (money - 50000*(money/50000))/10000 + "매");
	System.out.println("천원권" + (money - 10000*(money/10000))/1000 + '매');
	System.out.println("백원" + (money - 1000*(money/1000))/100 + "개");
	System.out.println("오십원" + (money - 100*(money/100))/50 + "개");
	System.out.println("십원" + (money - 50*(money/50))/10 + "개");
	System.out.println("일원" + (money -10*(money/10)) + "개");
	System.out.println("===================");
	System.out.println("| 학번 : 2015041057 |");
	System.out.println("| 이름 :    김두회         |");
	System.out.println("===================");
	}

}
