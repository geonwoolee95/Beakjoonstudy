import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
       
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int A[] = new int[n];
    for(int i=0;i<n;i++) {
    	A[i]=scan.nextInt();
    }
    
    Stack<Integer> stack = new Stack<>();
    for(int i = 0;i<A.length;i++) {
    	int su = A[i];
    	if(su != 0) {
    		stack.push(su);
    		
    	}else {
    		stack.pop();
    	}
    	
    }
    int sum =0;
    while(!stack.isEmpty()) {
    	sum+=stack.pop();
    }
    System.out.println(sum);
    	
    	
    }

}
