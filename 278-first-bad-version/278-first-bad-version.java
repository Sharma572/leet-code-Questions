/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left =1, rigth = n;
        int result =n;
        int mid;
        while(left <= rigth){
            mid = rigth+(left-rigth)/2;
            if(isBadVersion(mid)){
//                 4 5 8 9 15 20 30 42
//                 
                result = mid;
                rigth = mid-1;
                
            }else{
                left = mid+1;
            }
        }
        return result;
    }
}