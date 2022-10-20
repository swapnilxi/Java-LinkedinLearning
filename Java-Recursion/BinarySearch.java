public class BinarySearch {
    public static void main(String[] args) {
     int[] arr={2,3,4,55,66,67};
     int target= 66;
     int s=0;
     int e= arr.length-1;
     System.out.println(binarySearchfun(arr, target, s, e));
    }
    static int binarySearchfun(int[] arr, int target, int s , int e){
        int mid= s+ (e-s)/2;
        if(target<arr[mid]){
            return binarySearchfun(arr, target, s, mid-1);//left

        }
        if(target>arr[mid]){
           return  binarySearchfun(arr, target, mid+1, e);//right
        }
        if(target== arr[mid]){
            return mid;
        }
        return -1;

    }
}
