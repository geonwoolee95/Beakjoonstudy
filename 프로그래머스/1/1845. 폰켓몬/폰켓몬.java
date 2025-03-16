import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int a= nums.length/2; // 2   nums= 4
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]); // 3
        }
        //해쉬로 받으면 중복값안받아지니깐 종류개수만 나옴 3  2마리선택이면 2가끝
        
        for(int i =0;i<set.size();i++){
            if(answer<a){
                answer++;
            }
            
        }

        
        return answer;
    }
}

//         if(a<set.size()){
            
//             answer=set.size();
//         }else{
//             answer=a;
//         }
        