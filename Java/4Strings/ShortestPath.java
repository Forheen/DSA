
public class ShortestPath {

    public static void findpath(String str){
        int x=0, y=0;
        for(int i=0; i<str.length(); i++){
            char pos=str.charAt(i);
            switch(pos){
            case 'E':
                x++;
                break;
            case 'S':
                y--;
                break;
            case 'W':
                x--;
                break;
            case 'N':
                y++;
                break;
            }
        }

        double distance=Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2));
             
        System.out.println(distance);
    }
    public static  void main (String args[]){
        String str ="WNEENESENNN";
        findpath(str);
    }
}
