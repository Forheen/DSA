public class Power {
    public static int powr(int x, int n){
        if(n==1){
            return x;
        }
        int ans=x * powr(x, n-1);
        return ans;
    }
      public static int optimized(int x, int n){
        if(n==1){
            return x;
        }
        int ans=0;
        if(n%2==0){
        ans=optimized(x, n/2)* optimized(x, n/2);
        }else{
            ans=x * optimized(x, n/2)* optimized(x, n/2);
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println("Answer is "+ optimized(2,4));
    }
    
}
