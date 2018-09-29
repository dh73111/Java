package java_200_middle;

public class _43 {
	public static void showOddnEvenw(int n){
		int temp = n;
		while(temp != 1){
			if(temp % 2 == 1){       // È¦¼ö 
				temp = temp * 3 + 1;
			}
			else{               // Â¦¼ö 
				temp /= 2;
			}
			System.out.print("["+temp+"] ");
		}
		System.out.println("\n---------------------");
	}
	public static void main(String[] args) {
		showOddnEvenw(122);
	}

}
