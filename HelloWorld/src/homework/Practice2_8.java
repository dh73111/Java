package homework;

import java.util.Scanner;
public class Practice2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("�� (x1,y1),(x2,y2)�� ��ǥ�� �Է��Ͻÿ�>>");
	     int x1=sc.nextInt();
	     int y1=sc.nextInt();
	     int x2=sc.nextInt();
	     int y2=sc.nextInt();
	        
	     if (comp(x1,y1,x2,y2,100,100,200,200) == true)
	    	 System.out.println("("+x1+","+y1+")��("+x2+","+y2+")�� �簢�� �ȿ� �ֽ��ϴ�.");
	     else
	         System.out.println("("+x1+","+y1+")+�� +("+x2+","+y2+")�� �簢�� �ȿ� �����ϴ�.");
	       
	     sc.close();
	 	System.out.println("===================");
		System.out.println("| �й� : 2015041057 |");
		System.out.println("| �̸� :    ���ȸ         |");
		System.out.println("===================");
	    }
	public static boolean comp(int x1, int y1,int x2,int y2 ,int rectx1, int recty1, int rectx2, int recty2) {
		if ((x1>=rectx1 && x1<= rectx2) &&  (x2>=rectx1 && x2<= rectx2) && (y1>=recty1 && y1<= recty2) && (y2>=recty1 && x1<= recty2))
	        return true;
	    else
	        return false;
		}
}

