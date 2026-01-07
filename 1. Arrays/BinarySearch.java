public class BinarySearch {
    public static int binarySearch(int [] numbers, int key){
        int start = 0;
        int end = numbers.length - 1;
        while(start <= end){
            int mid = start + (end - start ) / 2;

            if(key == numbers[mid]){
                return mid;
            } else if(key < numbers[mid]){
                end = mid - 1;
            } else{
                start = mid +1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
            int[] numbers = {6, 12, 22, 37, 45,50, 66, 74, 88, 91, 100};
            int key = 88;

        System.out.println(binarySearch(numbers, key));

    }
}
