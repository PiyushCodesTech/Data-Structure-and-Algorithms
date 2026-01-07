public class printDecreasing {

    static void printDec(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    public static void main() {
        int n = 15;
        printDec(n);

    }
}
