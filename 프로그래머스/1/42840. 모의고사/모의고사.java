import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
         // List<String> w = new List<String>();
         // List<String> e = new List<String>();
        int[] a = {1,2,3,4,5}; //5
        int[] b = {2,1,2,3,2,4,2,5}; //8
        int[] c = {3,3,1,1,2,2,4,4,5,5}; //10
        int x=0; // 맞힌 개수 
        int y=0;
        int z=0;
        
        
        for(int i= 0;i<answers.length;i++){
            if(answers[i]==a[i%5]){ // 5개라서 6으로 나눈 나머지
                x++;
            }
            if(answers[i]==b[i%8]){
                y++;
            }
            if(answers[i]==c[i%10]){
                z++;
            }
        }
        
        int max = Math.max(x,Math.max(y,z)); // max에 x,y,z 중 가장 큰 수 들어감
        
         List<Integer> result = new ArrayList<>();
        if (x == max) result.add(1);
        if (y == max) result.add(2);
        if (z == max) result.add(3);
        
        // 가장 많이 맞힌 수포자들의 번호를 담은 배열로 반환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i); // 리스트에서 배열로 복사
        }
        
        return answer;
    }
}