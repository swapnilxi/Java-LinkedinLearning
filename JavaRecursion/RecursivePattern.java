import java.util.Arrays;

public class RecursivePattern {
    public static void main(String[] args) {
        int n=3;
        System.out.println("pattern 1: ");
        pattern1(n,0, 0);
        System.out.println("pattern 2");
        pattern2( 5, 0);
        System.out.println("");
        System.out.println("pattern 3");
        pattern3(5,0);

        System.out.println("bubble Sort");
        int[] arr={6,3,7,2,1};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println("sorted array"+ Arrays.toString(arr));
       
    }
   static void pattern1(int n, int row, int col){
      
    if(row==n){
        return;
    }
    if(col<=row){
   System.out.print("*");
        pattern1(n,row,col+1);  
    }else{
    System.out.println(" ");
    pattern1(n,row+1, 0);
    }
}

static void pattern2( int row, int col){
    if(row==0){
        return;
    }
    if(col<row){
        pattern2(row,col+1);//function call 
        System.out.print("*");//print 
        
    }else{
    pattern2(row-1, 0);//function call 
    System.out.println("");//print 
    }
    }

    static void pattern3( int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("*");//print
            pattern3(row,col+1);//function call 
      
            
        }else{
            System.out.println("");//print 
            pattern3(row-1, 0);//function call
        }
        }
        static void bubbleSort(int[] arr, int row, int col){
            if(row==0){
                return;
            }
            if(col<row){
            if(arr[col]>arr[col+1]){
                //swap
                int temp= arr[col];
                arr[col]=arr[col+1];
                arr[col+1]= temp;
            }
            bubbleSort(arr, row, col+1);
        }else{
            
            bubbleSort(arr, row-1,  col);
            
        }
     

        }

}
