import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 수의 개수
        int M = scan.nextInt(); // 합을 구해야 하는 횟수

        int[] arr = new int[N + 1];   // 입력 받은 수 배열 (1부터 시작)
        int[] S = new int[N + 1];     // 누적 합 배열

        // 배열 입력 받기
        for (int i = 1; i <= N; i++) {
            arr[i] = scan.nextInt();
            S[i] = S[i - 1] + arr[i]; // 누적 합 계산
        }

        // 합을 구해야 하는 범위 입력과 출력
        for (int j = 0; j < M; j++) {
            int start = scan.nextInt(); // 구간 시작
            int end = scan.nextInt();   // 구간 끝
            System.out.println(S[end] - S[start - 1]); // 구간 합 출력
        }

        scan.close();
    }
}
