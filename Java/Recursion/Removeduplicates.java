public class Removeduplicates {
    public static void removedup(String str, int idx, StringBuilder newString, boolean[] map){

        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        int idxm= str.charAt(idx)-'a';
        if(map[idxm]==false){
            
            map[idxm]=true;
            removedup(str, idx+1, newString.append(str.charAt(idx)), map);
        }else{
            map[idxm]=false;

            removedup(str, idx+1, newString, map);

        }
        

    }
    public static void main(String args[]){
        String word="apnacollege";
        removedup(word, 0, new StringBuilder(""),new boolean[26] );
    }
}
