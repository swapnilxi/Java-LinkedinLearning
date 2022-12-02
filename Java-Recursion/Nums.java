

public class Nums
{
	public static void main(String[] args) {
	    int n=0;
		increase(n);
	}
	static void increase(int n){
	    if(n==6){
	        return ;
	    }
	  //increse
	  System.out.println(n);//print
	  increase(++n);//fuction 
	 
	 //decrese
	 increase(++n);//functioncall
     
	 // stack -> out of stack -> condition satisfy print
	 System.out.println(n);//print
	   
	    
	}

}
