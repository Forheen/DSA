public class SubArrays{
    public static void pairs(int arr[]){
        int max=Integer.MIN_VALUE;
           for(int i=0;i<arr.length;i++){
                int steps=arr.length-i;
                for(int j=1; j<=steps;j++){
                    int sum=arr[i];
                    System.out.print("("+arr[i]);
                    for(int k=1; k<=steps-j;k++){
                        sum=sum+arr[i+k];
                            System.out.print(","+arr[i+k]);
                    }

                    if(max<sum){
                        max=sum;
                    }
                    System.out.print(")");
                                                                   System.out.println("sum value "+sum);

                }
                
                System.out.println();
           }
                           System.out.println("Max value "+max);

    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        pairs(arr);
      
    }
}