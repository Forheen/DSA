import java.util.*;

public class TrappedRainwater{
    public static int calculate(int height_arr[]){
        //calculate left max subarray
        int max_left[] = new int[height_arr.length];
        for(int i=0; i<height_arr.length;i++){
            max_left[i]= i==0 ? height_arr[0] : Math.max(max_left[i-1],height_arr[i]);
        }
        int max_right[] = new int[height_arr.length];
        for(int i=height_arr.length-1; i>=0;i--){
            max_right[i]= i==(max_right.length-1) ? height_arr[max_right.length-1] : Math.max(max_right[i+1],height_arr[i]);
        }
        int sum=0;
        for(int i=0; i<height_arr.length;i++){
            sum=sum+ (Math.min(max_left[i], max_right[i])-height_arr[i]);
        }
        return sum;
    }

    public static void main (String args[]){
        int height_arr[]={4,2,0,6,3,2,5};
        System.out.println("\n Total trapped rainwater is : "+calculate(height_arr));
    }
}