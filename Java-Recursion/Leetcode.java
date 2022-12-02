import java.util.Arrays;

public class Leetcode {
 public static void main(String[] args) {
    int[] arr={11,81,94,43,3};
    System.out.println(sumSubarrayMins(arr));
  
 }  
 
    public static int sumSubarrayMins(int[] arr) {
        int min= Integer.MAX_VALUE;
        int start=0;
        int end=arr.length;
        int sum=0;
       // System.out.println(k);
       int[] k= Arrays.copyOfRange(arr, start, end);
        for(int i=0; i<end;++i){
            if(k[i]<min){
            min=k[i];
            sum=sum+min;
            int[] k= Arrays.copyOfRange(arr, start, end--);
            end--;
        }
        }
        return sum;
        
    }
}



// 1 2 3 4 5 6 7
// s         e     


class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int ans=0;
        q.offer(root);
        int b=myfun(root);
        while(!q.isEmpty()){
            int n=q.size();
            b--;
            for(int i=0;i<n;i++){
                TreeNode a = q.poll();
                if(a.left!=null)
                    q.offer(a.left);
                if(a.right!=null)
                    q.offer(a.right);
                if(a.left==nul
 
