import java.util.Arrays;



public class Sorting {
    public static void main(String[] args) {
        int[] arr= {1,4,3,6,2,3};
        // System.out.println(Arrays.toString(mergeSort(arr))); 
        // mergeSortInPlace(arr, 0, arr.length);  
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort( int[] arr, int lo, int  hi){
        //java internally uses double pivot quick sort
        //that has combination of heap sort and insertion sort
        if(lo>hi){
            return;
        }
        //for swapping
        int start=lo;
        int end=hi;
        int mid= start+(end-start)/2;
        int pivot= arr[mid];

        if(start <=end){
            while(arr[start]< pivot){
                start++;
            }
            while (arr[end]> pivot) {
                end--;
            }
            //swap till start is less than end
            if (start<=end){
                 int temp= arr[start];
                 arr[start]=arr[end];
                 arr[end]= temp;
                 start++;
                 end--;

            }
             
        }
        //now my pivot is at correct index, please sort left and right
        quickSort(arr, lo, end);
        quickSort(arr, start, hi);


    }

   
     static void mergeSortInPlace(int[] arr, int start, int end) {
            if(end-start==1){
                return ;
            }
    
        int mid= (start+end)/2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);
        mergeInPlace(arr, start, end , mid);
        }
    
         static void mergeInPlace(int[] arr, int s, int e, int m) {
            int[] mix= new int[e-s];
            
            int i=s;
            int j=m;
            int k=0;
        while(i< m && j< e){
            if(arr[i]< arr[j]){
                mix[k]= arr[i];
                i++; 
            }else{
                mix[k]= arr[j];
                j++; 
            }
            k++; 
        }
        //if element in one array remains
        while( i< m){
            mix[k]=arr[i];
            i++;
            k++;
        }
    
        while( j< e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        
        for(int l=0; l<mix.length; l++){
          arr[s+l]= mix[l];  
        }
        }

    static int[] mergeSort(int[] arr) {
        if(arr.length==1){
            return arr;
        }

        int mid= arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
       int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length-1 ));
        return merge(left, right);
    }

     static int[] merge(int[] first, int[] second) {
        int[] mix= new int[first.length + second.length];
        
        int i=0;
        int j=0;
        int k=0;
    while(i< first.length && j< second.length){
        if(first[i]< second[j]){
            mix[k]= first[i];
            i++; 
        }else{
            mix[k]= second[j];
            j++; 
        }
        k++; 
    }
    //if element in one array remains
    while( i< first.length){
        mix[k]=first[i];
        i++;
        k++;
    }

    while( j< second.length){
        mix[k]=second[j];
        j++;
        k++;
    }
    
    return mix;
    }
    
    
}
