public class lastOccurence {
    public static int lastOCC(int [] arr, int key, int i){
        if(arr[i] == key){
            return i;
        }
        if(i < 0){
            return -1;
        }
        return lastOCC(arr, key, i-1);
    }

    static void main(String [] args) {
        int [] arr = {1,2,5,9,8,7,4,5,6,3,2,1,6};
        int key = 1;
        System.out.println(lastOCC(arr, key, arr.length-1));
    }
}
