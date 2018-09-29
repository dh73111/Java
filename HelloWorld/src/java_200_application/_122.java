package java_200_application;

public class _122 {
	public static void diamond(int n) {
		for(int i=0;i<n/2+1;i++) {
			for(int j=0;j<n-i;j++)
				System.out.print(" ");
			for(int k=0;k<i+1;k++) {
				System.out.print("*");
				if(k != 0)
					System.out.print("*");
			}
			
			System.out.println();
		}
		
		int e = n/2+2;
		for(int i=e;i<n+1;i++) {
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int k=0;k<2*(n-e)+1;k++)
				System.out.print("*");
			System.out.println();
			e++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 diamond(9);
	}
}