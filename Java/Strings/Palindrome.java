import java.util.*;

public class Palindrome{

    public static boolean check(String str){
        for(int i =0; i<str.length()/2; i++){
            if( str.charAt(i) != str.charAt(str.length()-1-i) ) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        
        if(check(str)){
            System.out.println(str +" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }
    }
}