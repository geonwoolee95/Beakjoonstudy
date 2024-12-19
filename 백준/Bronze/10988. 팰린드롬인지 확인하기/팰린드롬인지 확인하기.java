import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        String input = scanner.nextLine();
        scanner.close();

     
        int length = input.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // 결과 출력
        System.out.println(isPalindrome ? 1 : 0);
    }
}