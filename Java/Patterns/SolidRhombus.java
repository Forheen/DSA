/*
Solid Rhombus
      ******
     ******
    ******
   ******
  ******
 ******
 */
public class SolidRhombus{
    public static void counter(int n){
        for(int i=n; i>=1; i--){
            for (int j=1; j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n;j++){
                System.out.print("*");

            }
        System.out.println();
        }
        

    }
    public static void main (String args[]){
        counter(6);
    }
}