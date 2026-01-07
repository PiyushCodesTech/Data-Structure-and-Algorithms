public class sumOfNNaturalNumbers {
    public static int printNaturalNumbers(int n){
        if(n == 1){
            return 1;
        }
        return n + printNaturalNumbers(n-1);
    }

    static void main() {
        int n = 5;
        System.out.println(printNaturalNumbers(n));

    }
}
