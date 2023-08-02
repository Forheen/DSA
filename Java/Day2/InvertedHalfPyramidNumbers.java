/*
 Inverted Half Pyramid with Numbers
 
12345
1234
123
12
1

 */
public class InvertedHalfPyramidNumbers{
    public static void totalnum(int n){
    int count=n;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=count; j++){
            System.out.print(j);
        }
count--;
System.out.println();
    }
}
    public static void main(String args[]){
        totalnum(5);
    }
}