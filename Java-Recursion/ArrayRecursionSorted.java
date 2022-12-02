import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayRecursionSorted{
 public static void main(String[] args) { 
   int[] arr={1,2,3,3,4,6,5};//array
    System.out.println(sorted(arr, 0));
    int target=3;
   
    System.out.println(search(arr,target,0));
    searchAll( arr,0 ,target);
    System.out.println(searchedIdx);
    ArrayList<Integer> searchList= new ArrayList<>();
    System.out.println(searchAll(arr, 0, target, searchList));
    System.out.println(searchAll2(arr, 0, target));
   
 
 }
 
static boolean sorted(int[]arr, int index){
  if(index==arr.length-1) return true ;
  return arr[index]<arr[index+1] && sorted(arr, index+1);

}
private static int search(int[] arr, int target, int index) {
  if(index==arr.length){
   return -1;
  }
  if(arr[index]==target) return index;
 return search( arr, target , index+1);
}
static ArrayList<Integer> searchedIdx= new ArrayList<>();
 static void searchAll(int[] arr, int index, int target){
   if(index==arr.length){
      return;
     }
     if(arr[index]==target) {
      searchedIdx.add(index);
   };
     searchAll( arr, index+1, target);
   //   System.out.println(searchedIdx);// repeated multiple times 
}
   static ArrayList<Integer> searchAll(int[] arr, int index, int target, ArrayList<Integer> searchList) {
      if(index==arr.length){
         return searchList;
      }
      if(arr[index]==target) {
         searchList.add(index);
      };
      return  searchAll( arr, index+1, target, searchList);
   }
   static ArrayList<Integer> searchAll2(int[] arr, int index, int target ) {
      ArrayList<Integer> nsearchList= new ArrayList<>();
      if(index==arr.length){
         return nsearchList;
      }
      if(arr[index]==target) {
         nsearchList.add(index);
      };
     
      ArrayList<Integer> ansfrombelow= searchAll2( arr, index+1, target);
      nsearchList.addAll(ansfrombelow);
        return nsearchList;
   }
   
}

