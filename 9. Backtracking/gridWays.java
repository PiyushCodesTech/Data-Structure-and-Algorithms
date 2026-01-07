public class gridWays {
    public static int countWays(int i, int j, int row, int col){
        // Base Case
        if(i == row-1 && j==col-1){
            return 1;
        } else if (i>= row || j >= col) {
            return 0;
        }
        int w1 = countWays(i+1, j, row, col);
        int w2 = countWays(i, j+1, row, col);
        return w1 + w2;
    }

    static void main() {
        int row = 3;
        int col = 3;
        System.out.println(countWays(0,0,row, col));
    }
}

// This code is not optimal for large grid as it have exponential time complexity
// The above approach uses recursion and backtracking and not optimized