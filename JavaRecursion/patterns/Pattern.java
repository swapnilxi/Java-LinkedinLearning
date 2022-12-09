package patterns;

public class Pattern {
    public static void main(String[] args) {
        int n=5;
        System.out.println("pattern 1");
        pattern1(n);
        System.out.println("pattern2");
        pattern2(n);
        System.out.println("pattern3");
        pattern3(n);
        System.out.println("pattern4");
        pattern4(n);
    }

    private static void pattern4(int n) {
    for(int row=0; row<2*n-1; ++row){
        int colNum=0;
        if(colNum<n){
            colNum=n-row;
        }else{
            colNum=2*n-row+1;
        }
        
            for(int col=0; col<colNum; ++col){
       System.out.print("*");
            }
        System.out.println("");

        }
    }

   

  private static void pattern3(int n) {

    for(int row=0; row< (2*n); ++row){
        int colNum=0;
        if(row<n){
            colNum=row;
        }else{
            colNum=2*n-row;//n- row-n+1 
        }
     
        for(int col=n; col>colNum; --col){
        System.out.print("*");
        }
        System.out.println(" ");
    }
    }

static void pattern2(int n) {
    for(int row=0; row<n; ++row){
        for(int col=0; col< n-row-1; ++ col){
            System.out.print("*");
        }
        System.out.println(" ");
    }
    }

static void pattern1(int n) {
        for(int row=0; row<n; ++row){
            for(int col=0; col< row; ++ col){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
