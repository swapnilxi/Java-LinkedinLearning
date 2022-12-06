import java.util.ArrayList;


public class FindElement {
    public static void main(String[] args) {
     int[] arr={3,4,5,6,7,5};
     int target=5;
     System.out.println(find(arr, 0, target));  
     System.out.println(findIdx(arr, 0, target));  
    //  System.out.println(findAllIdx(arr, 0, target)); // this won't print anything
    System.out.println(list);
    }
  
    static boolean find( int[] arr, int index, int target){
        if(index==arr.length){return false;}
        return  arr[index]==target || find(arr, index+1, target);

    }
    static int findIdx(int[] arr, int index, int target){
      if(arr.length<1) return 1;
       if(index==arr.length) return -1;
        if(arr[index]==target){ 
            return index;
        } else{ 
            return findIdx(arr, index+1, target);
        }
    }
static ArrayList<Integer> list= new ArrayList<>();
   static void findAllIdx(int[] arr, int index, int target) {
    if(index==arr.length) return;
    if(arr[index]==target){ 
         list.add(index);
    } else{
          findAllIdx(arr, index+1, target);
    }
    }
}
