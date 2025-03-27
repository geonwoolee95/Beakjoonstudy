class Solution {
    public int[] solution(int brown, int yellow) {
        
             int a = brown+yellow;
             int[] answer = new int[2];
 
            
        for(int i=3;i<a;i++){ //최소 3부터 시작
            if(a%i==0&&(i-2)*((a/i)-2)==yellow){       
                if((a/i)>i){ // 
                answer[0]=a/i;
                answer[1]=i;
                    }else if((a/i)==i){ // 정사각형일때
                     answer[0]=i;
                     answer[1]=i;
                } 
                //yello 9이상일때 9 
            }
        }
        
        
        return answer;
    }
}
     //9116은 정사각형
        //나머지 직사각형
        //3의 배수 패턴 3이뒤로
        //3으로 안나눠지면 4의 배수 ㅇㅋㅇㅋ



//         for(int i =1;i<a;i++){
            
//             if((i*i)==a){
//                 answer[0]=i;
//                 answer[1]=i;
//             }
//             for(int j=0;j<a;j++){
//                 if(i*j==a){
//                     if()
//                     answer[0]=i;
//                     answer[1]=j;
//                 }
//             }
            
            
        // }    
             
           // if(a%3==0){
           //     answer[0]=a/3;
           //     answer[1]=3;
           // }else if(a%4==0){
           //      answer[0]=a/4;
           //      answer[1]=4;
           //  }   
        