public class SubarraysOfArray  {
    public static void subArrays(int[] arr){

        for(int i = 0; i< arr.length; i++){
            for(int j = i; j<arr.length; j++){
                // We will initialize a variable to count the sum of each sub array elements
                int sum = 0;
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+ " ");
                    sum += arr[k];
                }
                System.out.print("          Sum:  " + sum);
                System.out.println();
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();


        // To check if the last element of the prefix sum is the largest
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
            System.out.println(prefix[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 7, 9};
        subArrays(arr);
    }
}
