import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int A;
		int B;
		int x1,x2,x3,x4,x5; 
		
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		x1 = A+B;
		x2 = A-B;
		x3 = A*B;
		x4 = A/B;
		x5 = A%B;
		
		System.out.print(x1+"\n");
		System.out.print(x2+"\n");
		System.out.print(x3+"\n");
		System.out.print(x4+"\n");
		System.out.print(x5);
		
		
	}

}
