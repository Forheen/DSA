public class PrefixArray{
    public static void findmaxsum(int arr[], int prefix[]){

        int sum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i; j<arr.length;j++){
                int psum=i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                
                    sum=Math.max(psum,sum);
                

            }
        }
        System.out.println("\nmax sum :"+sum);

    }
    public static void main (String args[]){
        int arr[]={1,-2,6,-1,3};
        // creating prefix array
        int prefix[]= new int[arr.length];
      

        for(int i=0; i<arr.length;i++){
            
            prefix[i]= i==0 ? arr[i] : prefix[i-1]+arr[i];
            System.out.print(prefix[i]+" , ");
        }

        findmaxsum(arr,prefix);


    }
}