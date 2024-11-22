import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a = 2;
		int x;

		Scanner scan = new Scanner(System.in);

		x = scan.nextInt();

		for (int i = 0; i < x; i++) {
			a = (a - 1) + a;

		}
		System.out.println(a * a);
	}

}
