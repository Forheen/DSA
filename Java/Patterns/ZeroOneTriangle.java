/*
0-1 Triangle
1 
0 1
0 1 0
1 0 1 0
1 0 1 0 1
 */
public class ZeroOneTriangle{
    public static void counter(int n){
        boolean x=true;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i;j++){
                int val = (x) ? 1 : 0;
                System.out.print(val+" ");
                x=!x;
            }
        System.out.println();
        }
        

    }
    public static void main (String args[]){
        counter(5);
    }
}