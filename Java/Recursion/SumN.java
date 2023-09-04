public class SumN {

    static int sum(int n){
        if(n==1){
            return 1;
        }
        int total=n+sum(n-1);
        return total;
    }
    public static void main (String args[]){
        System.out.println("Sum of n natural numbers : "+ sum(5));
    }
}
