public class sudokuSolver {

    public static boolean isSafe(int[][]sudoku, int row, int col, int digit){
        //Check if the number is present in the row
        for (int i = 0; i < 9; i++){
            if (sudoku[i][col] == digit){
                return false;
            }
        }

        //Check if the number is present in the column
        for (int j = 0; j< 9; j++){
            if (sudoku[row][j] == digit){
                return false;
            }
        }

        //Check if the number is present in the grid
        int startRow = row - row%3;
        int startCol = col - col%3;
        for (int i = startRow; i < startRow +3; i++){
            for (int j = startCol; j<startCol+3; j++){
                if (sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solveSudoku(int[][]sudoku, int row, int col){
        //Base Case
        // If reached the end of the sudoku
        if (row == 9) {
            return true;
        }
        // If reached the end column then move to the next row
        if (col == 9) {
            return solveSudoku(sudoku, row+1, 0);
        }

        // If the cell is places then skip it
        if (sudoku [row][col] != 0) {
            return solveSudoku(sudoku, row, col+1);
        }

        // Place the numbers if safe

        for (int digit = 1; digit <=9; digit++){
            if (isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if (solveSudoku(sudoku, row, col+1)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printBoard(int[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                System.out.print(board[i][j] + " ");
            }
            System.out.println();

        }
    }

    static void main() {
        int[][] board = {
                {5,3,0, 0,7,0, 0,0,0},
                {6,0,0, 1,9,5, 0,0,0},
                {0,9,8, 0,0,0, 0,6,0},

                {8,0,0, 0,6,0, 0,0,3},
                {4,0,0, 8,0,3, 0,0,1},
                {7,0,0, 0,2,0, 0,0,6},

                {0,6,0, 0,0,0, 2,8,0},
                {0,0,0, 4,1,9, 0,0,5},
                {0,0,0, 0,8,0, 0,7,9}
        };

        if (solveSudoku(board, 0,0)){
            printBoard(board);
        } else {
            System.out.println("No solution exist");
        }
    }
}
