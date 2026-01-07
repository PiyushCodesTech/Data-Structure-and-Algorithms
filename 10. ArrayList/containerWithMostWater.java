import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;

public class containerWithMostWater {

    public static int maximumWater(ArrayList<Integer> height){
        int l = 0;
        int r = height.size()-1;
        int maxWater = 0;

        while(l < r){
            int h = Math.min(height.get(l), height.get(r));
            int width = r - l;

            int currWater = h * width;

            maxWater = Math.max(maxWater, currWater);

            if(height.get(l) < height.get(r)){
                l++;
            } else{
                r--;
            }
        }
        return maxWater;
    }

    public static void main(String [] args){
        ArrayList <Integer> list = new ArrayList<>();
        int [] arr = {1,8,6,2,5,4,8,3,7};

        for (int i = 0; i < arr.length; i++){
            list.add(i);
        }

        int res = maximumWater(list);
        System.out.println(res);
    }
}
