class HappyNumbers {
    public static boolean isHappy(int n) {
        int num=n;
        int rem=0;
        int sum=Integer.MAX_VALUE;
    while(num >9){

        sum=0;
        rem=0;
             while(num > 0){ 
                rem = num%10;  
                sum = sum + (rem*rem);  
                 num = num/10;  
            }
   
        num= sum;
        System.out.println("num "+num);

    }
    
    return num==1;

    }
    public static void main(String args[]){
        
        System.out.println(isHappy(2));
    }
}