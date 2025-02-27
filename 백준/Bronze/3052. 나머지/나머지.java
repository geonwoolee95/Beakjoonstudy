import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[10]; // 입력을 저장할 배열
        int cnt = 0; // 서로 다른 나머지 개수

        Scanner scan = new Scanner(System.in);

        // 입력값을 42로 나눈 나머지를 배열에 저장
        for (int i = 0; i < 10; i++) {
            a[i] = scan.nextInt() % 42;
        }

        // 중복 체크 로직 수정
        for (int i = 0; i < 10; i++) {
            boolean isFirst = true; // 현재 값이 처음 등장했는지 여부
            for (int j = 0; j < i; j++) { // 이전 값들과 비교
                if (a[i] == a[j]) { // 중복된 값이 있으면
                    isFirst = false; // 첫 번째 등장 아님
                    break; // 더 이상 검사할 필요 없음
                }
            }
            if (isFirst) { // 첫 등장 값이면 카운트 증가
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}