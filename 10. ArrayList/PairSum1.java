import java.util.ArrayList;

public class PairSum1 {
    public static boolean pairSum(ArrayList<Integer> nums, int target){
        int l = 0;
        int r = nums.size() -1;

        while(l < r){
            int sum = nums.get(l) + nums.get(r);

            if(sum == target){
                return true;
            } else if (sum > target) {
                r--;
            } else{
                l++;
            }
        }
        return false;
    }

    public static void main(String [] args){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        boolean res = pairSum(list, target);
        System.out.println(res);
    }

}
