import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N; // 숫자
		int o =0; // 카운

		N = scan.nextInt();//입력받
		
		int[] M = new int[N]; //배열 선언 N크기만
		for (int i = 0; i < N; i++) {
			M[i] = scan.nextInt(); //입력받
		}
		
		int V;
		V = scan.nextInt(); // 비교할 숫자 입력받
		
		for(int i =0;i<N;i++ ) {
			if(M[i]==V) {
				o++;  //비교카운
			}
		}
		System.out.println(o);
		


	}

}
