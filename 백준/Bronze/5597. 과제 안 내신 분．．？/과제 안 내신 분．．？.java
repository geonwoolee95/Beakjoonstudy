import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x;
		int y=0;
		int arr2[] = new int[2];
		int arr[] = new int[28];
		
		for (int i = 0; i < 28; i++) {
			x = scan.nextInt();
			arr[i] = x;
		}

		for (int j = 1; j <=30; j++) {
			boolean found = false;
			
			for (int k = 0; k < 28; k++) {
				if (arr[k] == j) {
					found = true;
					break;
				}

			}
			if(!found) {
				arr2[y]=j;
				y++;
			}

		}
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);

	}

}
