import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

  
        if (input.trim().isEmpty()) {
            System.out.println(0);
            return;
        }

        int count = 1; 
        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i] == ' ') {
              
                if (i == 0) {
                    continue;
                }
              
                if (i == arr.length - 1) {
                    continue;
                }
             
                if (arr[i - 1] == ' ') {
                    continue;
                }
           
                count++;
            }
        }

        System.out.println(count);
    }
}