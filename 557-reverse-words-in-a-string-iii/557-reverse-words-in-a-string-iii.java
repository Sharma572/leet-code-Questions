class Solution {
    public String reverseWords(String s) {
        char rv[] = s.toCharArray();
        int i =0;
        for(int j = 0;j< rv.length;j++){
            if(rv[j]== ' '){
                reverse(rv ,i, j-1);
                i = j+1;
            }
           
        }
         reverse(rv,i ,rv.length-1);
            return new String(rv);
    }
    static void reverse(char[] rv,int i,int j){
        char temp;
        while(i<=j){
            temp = rv[i];
        rv[i]=rv[j];
        rv[j]=temp;
        i++;
        j--; 
        }
       
    }
}