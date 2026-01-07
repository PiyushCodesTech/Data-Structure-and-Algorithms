// You are given 4 directions N,S,E,W
// You have to find the shortest distance between the initial point and the travelled distance
// WNEENESENNN
public class ShortestPath {
    public static float getShortestPath(String path){
        int x=0,y=0;

        for(int i = 0; i<path.length(); i++){
            if(path.charAt(i) == 'N'){
                y++;
            } else if(path.charAt(i) == 'S'){
                y--;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else{
                x--;
            }
        }
        int xSq = x*x;
        int ySq = y*y;

        return (float)Math.sqrt(xSq + ySq);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
