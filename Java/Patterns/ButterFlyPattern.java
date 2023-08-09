/*
Butterfly Pattern 
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
 */
public class ButterFlyPattern{
    public static void counter(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n*2;j++){
                if(j<=i || j>(n*2-i)){
                System.out.print("*");
                }else{
                    System.out.print(" ");

                }
            }
        System.out.println();
        }

        for(int i=1; i<=n;i++){
            for (int j=1; j<=n*2; j++){
                if(j<=(n-i+1) || j>(n+i-1)){
                    System.out.print("*");
                }else{
                                     System.out.print(" ");
   
                }
               
            }
                    System.out.println();

        }
    
    }

    public static void secondmethod(int n){
        //1st half
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");

            }
             for(int j=1; j<=i; j++){
                System.out.print("*");
            }
                                System.out.println();

        }
                         

        //2nd half
        for (int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");

            }
             for(int j=1; j<=i; j++){
                System.out.print("*");
            }
                                System.out.println();

        }

    }
    public static void main (String args[]){
        secondmethod(4);
    }
}