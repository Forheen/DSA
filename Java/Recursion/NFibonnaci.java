public class NFibonnaci{
    public static int fibonnaci(int n){
        if( n==1 || n==0){
            return n;
        }
        int fn= fibonnaci(n-1)+ fibonnaci(n-2); 
        
        return fn;
    }
    public static void main(String args[]){
        System.out.println(fibonnaci(5));
    }
}