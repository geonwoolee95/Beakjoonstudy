import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 두 수 입력 받고
		// 입력받은 수로 바구니 수 결정
		// 두번째 입력받은 수로 몇번 바꿀지 결정
		// 그리고 다음 입력 받는 두 수로 두 바구니의 숫자 교환 (반복)
		// 그 후 최종 출력
		Scanner scan = new Scanner(System.in);

		int x, z;
		x = scan.nextInt();
		int arr[] = new int[x];
		int b;

		
	
		z = scan.nextInt();

		for (int i = 0; i < x; i++) {
			arr[i] = i + 1;
		}

		for (int j = 0; j < z; j++) {
			int X = scan.nextInt();
			int Z = scan.nextInt();

			b = arr[X - 1];
			arr[X - 1] = arr[Z - 1];
			arr[Z - 1] = b;

		}
		
		for(int k = 0; k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}
