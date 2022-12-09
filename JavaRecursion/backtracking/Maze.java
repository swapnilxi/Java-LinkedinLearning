package backtracking;

import java.util.ArrayList;

//count number of ways 
public class Maze {
    public static void main(String[] args) {
        //System.out.println(count(3,3));
       // path("", 3, 3);
        System.out.println(pathRet("", 3, 3));
        System.out.println(pathRetdiagonal("", 3, 3));
    }
    static int count(int r, int c){
        if(r==1 ||c==1){ 
            return 1;
        }
        //we can only move in right or down as per question
        //you are at (3,3) have to reach (1,1)       
        int right= count(r,c-1);
        int down=count(r-1, c);
        // 3,3  3,2  3,1
       //  2,3  2,2  2,1
      //   1,3  1,2  1,1 
        return right+down;
    }
static void path(String p, int r, int c){
 if(r==1&& c==1){
    System.out.println(p);
    return;
 }
 if(r>1){
 path(p+'D',  r-1, c);
 }
 if(c>1){
 path( p+'R', r, c-1);
 }
    }

 static ArrayList<String> pathRet(String p, int r , int c){
    if(r==1 && c==1){
    ArrayList<String> list= new ArrayList<>();
      list.add(p);
        return list;
     }
     ArrayList<String> list= new ArrayList<>();
     if(r>1){
   list.addAll(pathRet(p+'D',  r-1, c));
     }
     if(c>1){
     list.addAll(pathRet( p+'R', r, c-1));
     }
     return list;
 }
 static ArrayList<String> pathRetdiagonal(String p, int r , int c){
    if(r==1 && c==1){
    ArrayList<String> list= new ArrayList<>();
      list.add(p);
        return list;
     }
    
     ArrayList<String> list= new ArrayList<>();
     if(r>1 && c>1){
       list.addAll(pathRetdiagonal(p+'D', r-1, c-1));
     }
     if(r>1){
   list.addAll(pathRetdiagonal(p+'V',  r-1, c));//down is Vertical 
     }
     if(c>1){
     list.addAll(pathRetdiagonal(p+'H', r, c-1));//right is horizontal
     }
     return list;
 }
 
}
