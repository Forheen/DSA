
public class SpiralMatrix {
    public static void main(String args[]){
        int[][] matrix = {{1,2,3,4},  {5,6,7,8},{9,10,11,12}, {13,14,15,16}};
          int nrows = matrix.length;
        int ncolumns=matrix[0].length;
       
        // System.out.println(rows+" "+columns);
    
        int startrow=0;
        int endrow=nrows-1;
        int startcolumn=0;
        int endcolumn=ncolumns-1;

        while(startrow<=endrow && startcolumn<=endcolumn){
            for(int j=startcolumn; j<=endcolumn;j++){
            System.out.print(matrix[startrow][j]+" ");
            }
             for(int j=startrow+1; j<=endrow;j++){
            System.out.print(matrix[j][endcolumn]+" ");
            }
             for(int j=endcolumn-1; j>=startcolumn;j--){
            System.out.print(matrix[endrow][j]+" ");
            }
            for(int j=endrow-1; j>=startrow+1;j--){
            System.out.print(matrix[j][startcolumn]+" ");
            }
            System.out.println();
            startrow++;
            endrow--;
            startcolumn++;
            endcolumn--;
        }
    }
}
