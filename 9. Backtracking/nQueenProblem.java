public class nQueenProblem {

    public static boolean isSafe(char[][]board, int row, int col){
        //---------------------------------Step 4---------------------------------
        // Now we will check if any queen is attacking any other queen or not

        // vertical up direction
        for (int i = row-1; i>=0; i--){
            if (board[i][col] == 'Q'){
                return false;
            }
        }

        // Diagonally left
        for (int i = row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        // Diagonally right
        for (int i = row-1, j = col+1; i>=0 && j< board.length; i--,j++){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void printArr(char[][]arr){
        //---------------------------------Step 3---------------------------------
        System.out.println("-----------------CHESS BOARD-----------------");
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void nQueens(char[][]board, int row){
        //---------------------------------Step 2---------------------------------
        if (row == board.length){
            printArr(board);
            return;
        }

        // We will place queen in column row by row
        for (int j = 0; j<board.length; j++){
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // Placing the queen in every column
                nQueens(board, row + 1); // recursion for next row
                board[row][j] = 'x'; // Backtracking step
            }
        }
    }

    public static void main(String [] args){
        //---------------------------------Step 1---------------------------------
        int n = 4;

        // Chess Board
        char [][] board = new char[n][n]; // board size of NxN

        // Initialize the board as no queen is there
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
    }
}
