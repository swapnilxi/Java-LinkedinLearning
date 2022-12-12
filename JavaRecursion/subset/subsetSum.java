package subset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class subsetSum {
    public static void main(String[] args) {
        Solution sol= new Solution();
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
       
        ArrayList<Integer> ans= sol.subsetSums(arr, arr.size());
        Collections.sort(ans);
        System.out.println(ans);
       
    }
    static class Solution{
        ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
            ArrayList<Integer> ans= new ArrayList<>();
                if(N==0) {
                return ans;
                }
                subSum(0, 0, arr.size()-1,arr, ans);
                return ans;     
        }
         public void subSum(int sum, int s, int e, ArrayList<Integer> arr, ArrayList<Integer> ans){
              if(s>e){
                ans.add(sum);
                return;
              }  
            int i=arr.get(s);
            subSum(sum+i,s+1,e,arr,ans);
             subSum(sum,s+1,e, arr,ans);
             
         }
        }
        
    
}
