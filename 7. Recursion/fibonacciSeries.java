public class fibonacciSeries {
    public static int printFib(int n){
        // Base Case
        if(n == 0 || n == 1){
            return n;
        }

        return printFib(n-1) + printFib(n-2);
    }

    static void main(String [] args) {
        int n = 5;
        System.out.println(printFib(n));
    }
}
