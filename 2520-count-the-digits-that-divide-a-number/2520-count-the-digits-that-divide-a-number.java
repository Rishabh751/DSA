class Solution {
    public int countDigits(int num) {
        int n=num;
        int count=0;
        int l= Integer.toString(n).length();
        for(int i=1;i<=l;i++){
            int digit=n % 10;
            if(num % digit ==0){
                count++;
            }
            n/=10;
        }
        return count;
    }
}