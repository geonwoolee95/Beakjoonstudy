import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int x;

		Scanner scan = new Scanner(System.in);

		x = scan.nextInt();

		for (int i = 1; i < 10; i++) {

			System.out.println(x+" * "+i+" = "+x*i);
			
		}
	}

}
