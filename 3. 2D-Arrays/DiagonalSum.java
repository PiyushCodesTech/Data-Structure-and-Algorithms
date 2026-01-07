public class DiagonalSum {
    public static int diagonalSum(int [][] matrix){
        int n = matrix.length;
        int sum = 0;

        for(int i = 0; i<n; i++){

            // Primary Diagonal
            sum += matrix[i][i];

            // Secondary Diagonal
            if(i != n-1-i){ // This condition will check if the pointers are overlapping each other
                sum += matrix[i][n-1-i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3,10},
                {4,5,6,11},
                {7,8,9,12},
                {13,14,15,16}
        };

        int res = diagonalSum(matrix);
        System.out.println(res);
    }
}
