public class firstOccurence {
    public static int occ(int [] arr, int i, int key){
        if(arr[i] == key){
            return i;
        }
        if(i == arr.length-1){
            return -1;
        }
        return occ(arr, i+1,key);
    }

    static void main(String [] args) {
        int arr[] = {1,2,5,4,7,8,5,3,2,6,5,8};
        int key = 19;

        System.out.println(occ(arr, 0, key));
    }
}
