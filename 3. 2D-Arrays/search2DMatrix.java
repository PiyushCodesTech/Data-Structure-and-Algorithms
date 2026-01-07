public class search2DMatrix {
    public static boolean searchSortedMatrix(int [][] matrix, int key){
        int row = 0;
        int col = matrix[0].length-1;

        while (row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                return true;
            } else if(key < matrix[row][col]){
                col--;
            } else{
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]matrix = {
                {1,2,3,10},
                {4,5,6,11},
                {7,8,9,12},
                {13,14,15,16}
        };

        int key = 84;

        boolean res= searchSortedMatrix(matrix, key);
        System.out.println(res);
    }
}
