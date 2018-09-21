package practice;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name;
		int Math;
		
		System.out.println("이름 ? ");
		name = sc.next();
		
		System.out.println("수학 ? ");
		Math = sc.nextInt();
		
		System.out.println(name + ":"+Math);
	}

}
