public class DiagonalSum {

    public static void main (String args[]){

        int [][] matrix ={{1,2,3}, {4,5,6},{7,8,9}};
        
        int sum=0;
        // for(int i=0; i<matrix.length;i++){
        //     for(int j=0; j<matrix[0].length;j++){
        //         if(i==j || (i+j)==matrix.length-1){
        //             System.out.print(matrix[i][j]+" ");
        //             sum=sum+matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0;i<matrix.length;i++){
            sum=sum+matrix[i][i];
            int j=(matrix.length-1-i);
            if(i!=j)
                sum+=matrix[i][j];

            
        }
        System.out.println("\nSum is "+sum);
    }
}
