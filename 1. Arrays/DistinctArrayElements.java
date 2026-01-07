public class DistinctArrayElements {
    public static boolean isDistinct(int [] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,1};

        if(isDistinct(arr) == true){
            System.out.println("It does not have distinct elements");
        } else{
            System.out.println("Every element is distinct");
        }

    }
}
