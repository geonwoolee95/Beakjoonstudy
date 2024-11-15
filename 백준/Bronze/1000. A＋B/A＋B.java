import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int A;
		int B;
		int sum;
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextInt();
		
		while(0>=A) {
		A = scan.nextInt();
		}
		
		B = scan.nextInt();
		
		while(10<=B) {
			B = scan.nextInt();
			}
		sum = A+B;
		System.out.print(sum);
		
		
	}

}
