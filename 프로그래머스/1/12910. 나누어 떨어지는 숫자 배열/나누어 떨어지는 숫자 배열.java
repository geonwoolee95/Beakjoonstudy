import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>(); 
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
               answer.add(arr[i]);
            }
            
        }
        
        if(answer.isEmpty()){
            return new int[]{-1};
        }
        
        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }
}