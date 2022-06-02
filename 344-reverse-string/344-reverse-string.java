class Solution {
    public void reverseString(char[] s) {
       
    int start = 0, end = s.length-1;
        
       char[] ans = itaration(s, start , end);
        System.out.print(Arrays.toString(ans));
    }
    
    static char[] itaration(char s[],int start ,int end){
        while(start < end){
            char temp;
            temp = s[start] ;
            s[start] = s[end];
            s[end] = temp;
            start ++;
            end--;
        }
        return s;
    }
    
}