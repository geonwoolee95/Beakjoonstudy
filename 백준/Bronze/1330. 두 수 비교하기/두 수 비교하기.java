import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int A;
		int B;
		
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();

		if(A>B) {
			System.out.println(">");
		}else if(A==B) {
			System.out.println("==");
		}else {
			System.out.println("<");
		}
	
		
		
	}

}
