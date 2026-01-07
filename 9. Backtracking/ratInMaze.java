
public class ratInMaze {
    static int mazeSize;

    public static int[][] solveMaze(int [][]maze){
        mazeSize = maze.length;
        int[][] solutionPath = new int[mazeSize][mazeSize];

        if (explorePath(0,0, maze, solutionPath)){
            return solutionPath;
        } else {
            System.out.println("No path found");
            return new int[mazeSize][mazeSize];
        }
    }

    public static boolean explorePath(int row, int col, int [][]maze, int [][] solutionPath){
        if ((row == mazeSize - 1) && (col == mazeSize - 1) && (maze[row][col] == 1)) {
            solutionPath[row][col] = 1;
            return true;
        }

        if (isSafeCell(row, col, maze)) {
            // mark current cell
            solutionPath[row][col] = 1;

            // Move Down
            if (explorePath(row + 1, col, maze, solutionPath)) {
                return true;
            }

            // Move Right
            if (explorePath(row, col + 1, maze, solutionPath)) {
                return true;
            }

            // Move Up
            if (explorePath(row - 1, col, maze, solutionPath)) {
                return true;
            }

            // Move Left
            if (explorePath(row, col - 1, maze, solutionPath)) {
                return true;
            }

            // Backtrack: unmark cell
            solutionPath[row][col] = 0;
            return false;
        }
        return false;
    }

    // Check if cell is safe
    static boolean isSafeCell(int row, int col, int[][] maze) {
        return (row >= 0) && (col >= 0) && (row < mazeSize) && (col < mazeSize) && (maze[row][col] == 1);
    }

    // Utility to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }




    public static void main(String [] args) {
        int [][] maze  = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };

        int[][] solution = solveMaze(maze);
        printMatrix(solution);


    }
}
