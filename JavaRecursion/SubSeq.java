import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSeq {
    //sbubset is for arrays
    //subsequence is for string
    public static void main(String[] args) {
        // System.out.println("subsequences are: ");
        // subseq("", "abc");
    //    System.out.println( SubSeqArr("", "abc"));
       int[] nums={1,2,3};
       int[] numsDup={1,2,2};
    //    
    List<List<Integer>> ans= subseqIter2(numsDup);
       for(List<Integer> list: ans){
        System.out.println(list);
       }

   
    }
//iteratively

static List<List<Integer>> subseqIter2(int[] arr){
      Arrays.sort(arr);//avoid duplication
        List<List<Integer>> outer = new ArrayList<>(); 
        outer.add(new  ArrayList<Integer>());
        int start =0;
        int end=0;
        for(int i=0; i<arr.length; ++i){
           start=0 ;
    //if my previous element is same then my start would be 
   // start= e+1;
   if(i>0 && arr[i]==arr[i-1]){
    start=end+1;
   } 
   end= outer.size()-1;
            int n= outer.size();
            for(int j=start; j<n; ++j){
                List<Integer> internal= new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;

    }
      
    // static List<List<Integer>> subseqIter(int[] arr){
    //     Arrays.sort(arr);//avoid duplication
    //     List<List<Integer>> outer = new ArrayList<>(); 
    //     outer.add(new  ArrayList<Integer>());
    //     for(int num: arr){
    //         int n= outer.size();
    //         for(int i=0; i<n; ++i){
    //             List<Integer> internal= new ArrayList<>(outer.get(i));
    //             internal.add(num);
    //             outer.add(internal);
    //         }
    //     }
    //     return outer;
    // } 

    //recursively
    static ArrayList<String> SubSeqArr(String p, String unp){
        if(unp.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= unp.charAt(0);
        ArrayList<String> left=SubSeqArr(p+ch, unp.substring(1));
        ArrayList<String> right=SubSeqArr(p, unp.substring(1));
        left.addAll(right);
        return left;
    }



    static void subseq(String p, String unp){
        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=unp.charAt(0);
        subseq(p+ch, unp.substring(1));//take it or ignore it 
        subseq(p, unp.substring(1));//
          
    }


    }

