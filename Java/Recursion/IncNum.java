public class IncNum {
    public static void printnum(int n){
        if(n==0){
            return;
        }
        printnum(n-1);
        System.out.println(n+" ");
    }
    public static void main(String args[]){
        int n=5;
        printnum(n);
    }    
}
