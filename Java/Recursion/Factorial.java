public class Factorial{
    static int fn(int n){
        if(n==1){
            return 1;
        }
        int fac= n*fn(n-1);
        return fac;
    }
    public static void main(String args[]){
        System.out.println("Factorial of 5 is "+ fn(5));
    }
}