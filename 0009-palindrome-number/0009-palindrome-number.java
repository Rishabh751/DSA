class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        boolean ispalli=true;
        int sum = 0;
        while(n>0){
            int ld=n%10;
            sum=(sum*10)+ld;
            n/=10;
        }
        if(sum==x){
            return ispalli;
        }
        else{
            ispalli=false;
            return ispalli;
        }
    }
}