public class printIndexOfKey {
    public static void indexKey(int [] arr, int key, int idx){
        if(idx > arr.length-1){
            return;
        }

        if (arr[idx] == key){
            System.out.print(idx + " ");
        }
        indexKey(arr, key, idx+1);

    }

    static void main() {
        int [] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        indexKey(arr, 2, 0);
    }
}
