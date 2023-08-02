/*
Inverted and rotated half pyramid
Result
    *
   **
  ***
 ****
*****

*/

public class InvertedandRotatedPyramid{
    public static void totalmmatrix(int n){
        int count=n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n;j++){
                if((count-j)<=0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            count--;
            System.out.println();
        }
    }
    public static void main(String args[]){
        totalmmatrix(5);
    }
}