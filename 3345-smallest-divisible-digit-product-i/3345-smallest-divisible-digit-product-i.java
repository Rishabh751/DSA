class Solution {
    public int smallestNumber(int n, int t) {
        int a=n;
        while(true){
            int prd=1;
            int temp=a;
            while(temp>0){
                int ld=temp%10;
                prd*=ld;
                temp/=10;
            }
            if(prd%t==0){
                return a;
            }
            else{
                a++;    
            }
        }
    }
}