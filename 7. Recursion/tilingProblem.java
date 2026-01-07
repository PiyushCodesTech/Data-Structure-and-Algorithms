public class tilingProblem {
    public static int totalWays(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int vertical = totalWays(n-1);
        int horizontal = totalWays(n-2);

        return vertical + horizontal;
    }

    static void main() {
        System.out.println(totalWays(3));
        System.out.println(totalWays(4));
        System.out.println(totalWays(5));
        System.out.println(totalWays(6));
        System.out.println(totalWays    (7));



    }
}
