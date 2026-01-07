public class friendsPairingProblem {
    public static int pairFriends(int n){
        if(n==0 || n == 1 || n ==2){
            return n;
        }

        //Single choice
        int single = pairFriends(n-1);

        //Pair choice
        int pair = pairFriends(n-2);
        int pairWays = (n-1) * pair;

        // Total Ways
        return single + pairWays;
    }

    static void main() {
        int n = 3;
        System.out.println(pairFriends(n));
    }
}
